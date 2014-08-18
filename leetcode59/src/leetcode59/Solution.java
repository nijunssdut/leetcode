package leetcode59;

public class Solution {
	 public static ListNode rotateRight(ListNode head, int n) {
		 if (head == null || head.next == null || n== 0) {  
	            return head;  
	        }  
		  int length = 0;  
	        ListNode ptr = head, tail = head;  
	        while (ptr != null) {  
	            length++;  
	            tail = ptr;  
	            ptr = ptr.next;   
	        }//counter the length
	        n=n % length;            
	        ptr = head;  
	        for (int i = 0; i < length - n - 1; i++) {  
	            ptr = ptr.next;  
	        }  //move
	          
	        tail.next = head;  
	        head = ptr.next;  
	        ptr.next = null;  
	          
	        return head;  
	    }
	 public static void main(String args[])
	 {
		 ListNode input=new ListNode(1);
		 ListNode temp=input;
		 for(int i=2;i<=5;i++)
			 temp=temp.next=new ListNode(i);
		 System.out.println(rotateRight(input,2));
	 }
}
