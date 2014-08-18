package leetcode21;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public static ListNode mergeKLists(ArrayList<ListNode> lists) {
    	 Comparator<ListNode> mycomp = new Comparator<ListNode>(){  
             public int compare(ListNode a, ListNode b){  
                 if(a.val<b.val) return -1;  
                 else if(a.val==b.val) return 0;  
                 else return 1;  
             }  
         };  
         if(lists.size()==0) return null;  
         PriorityQueue<ListNode> heap = new PriorityQueue<ListNode>(lists.size(), mycomp);  
         for(ListNode node: lists){  
             if(node!=null)  
                 heap.add(node);  
         }  
         ListNode head= new ListNode(0);  
         ListNode prev = head;  
         while(heap.size()>0){  
             ListNode curr = heap.poll();  
             prev.next = curr;  
             prev = curr;  
             curr = curr.next;  
             if(curr!=null)  
                 heap.add(curr);  
         }  
         return head.next;   
        
    }
    public static void main(String args[])
    {
    	ArrayList<ListNode> head = null; 
    	System.out.println(mergeKLists(head));
    }
}