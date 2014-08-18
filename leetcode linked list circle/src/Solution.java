import java.util.Scanner;



/** 
 * Definition for singly-linked list. 
 * class ListNode { 
 *     int val; 
 *     ListNode next; 
 *     ListNode(int x) { 
 *         val = x; 
 *         next = null; 
 *     } 
 * } 
 */  
public class Solution {
	  public boolean hasCycle(ListNode head) {  
		  ListNode slow = head;  
	      ListNode fast = head;  
	      if(head == null)
	          return false;//null list
	      else if(head.next==null)
	    	  return false;//one element turns
	      else{
	    	  while(fast != null && fast.next != null) {  
	    		  slow = slow.next;//go ahead one  
	    		  fast = fast.next.next;  //go ahead two
	    		  if(slow == fast)  
	    			  return true;  
	    	  }
	     
	      }
	      return false;
	  }
	 public static void main(String args[])
	 {
		 	int num1; 
		 	boolean result;
			Scanner sc=new Scanner(System.in);
			num1=sc.nextInt();
			ListNode input1=new ListNode(num1);
			result=new Solution().hasCycle(input1);
			System.out.println(result);
			
	 }
}  

