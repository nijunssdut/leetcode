package leetcode18;



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
	    public static ListNode removeNthFromEnd(ListNode head, int n) {
	    	  if(head == null){
	              return head;
	          }
	          ListNode p1 = head;
	          ListNode p2 = head;
	          ListNode remove = head;//the position to remove
	          int i = 0;  
	          while(p1!=null){  
	              p1 = p1.next;  
	              i++;  
	              if(i > n){  
	                  p2 = remove;  
	                  remove = remove.next;  
	              }  
	          }  
	          if(remove == head){  
	              head = head.next;  
	          }else{  
	              p2.next = remove.next;  
	          }  
	          return head;  
	    }  
	    public static void main(String args[])
	    {
	    	System.out.println( );
	    }
	}

