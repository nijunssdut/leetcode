import java.util.Scanner;


public class Solution {
	 public ListNode detectCycle(ListNode head) {
			 ListNode slow = head;  
		      ListNode fast = head;  
		      boolean flag=false;
		      if(head == null)
		          return null;//null list
		      else if(head.next==null)
		    	  return null;//one element turns
	    	  while(fast != null && fast.next != null) {  
		    		  slow = slow.next;//go ahead one  
		    		  fast = fast.next.next;  //go ahead two
		    		  if(slow == fast)  
		    		  { 
		    		      slow=head;
		    			  flag=true;
		    			  break;
		    		  }
	    	  }
		    	  if(!flag)  
	                return null;  
	        while(slow!=fast){  
	            slow=slow.next;  
	            fast=fast.next;  
	        }  
	    	  return fast;
		      
		      }
		      public static void main(String args[])
		 	 {
		 		 	int num1; 
		 		 	ListNode result;
		 			Scanner sc=new Scanner(System.in);
		 			num1=sc.nextInt();
		 			ListNode input1=new ListNode(num1);
		 			result=new Solution().detectCycle(input1);
		 			System.out.println(result);
		 			
		 	 }

}
