package leetcode82;


public class Solution {
	  public static ListNode deleteDuplicates(ListNode head) {
	        if(head==null||head.next==null)
	        	return head;
	        ListNode rs=head;
	        ListNode temp=head.next;
	        ListNode res=head;
	        boolean flag=false;
	        while(temp!=null)
	        {
	        	if(rs.val == temp.val) {  
	                flag = true;  
	                rs.next = temp.next;            
	                temp = temp.next;  
	            }  
	        	 else if(rs.val != temp.val && !flag) {  
	                 res = rs;  
	                 rs= temp;  
	                 temp= temp.next;  
	             }  
	        	 else if(rs.val != temp.val && flag) {  
	                 if(rs == head) {  
	                     head = rs.next;  
	                     rs = temp;  
	                     temp = temp.next;  
	                 }  
	                 else {  
	                     res.next = rs.next;  
	                     rs = res.next;  
	                     temp = temp.next;  
	                 }  
	                 flag = false;  
	             }  
	         }  	      
	        if(flag) {  
	            if(rs == head) {  
	                head = rs.next;
	            }
	            else{  
	                res.next = rs.next;  
	            }
	        }
	        return head;
	    }
	   public static void main(String args[])
	   {
		   ListNode A=new ListNode(1);
		   ListNode B=new ListNode(1);
		   ListNode C=new ListNode(1);
		   ListNode D=new ListNode(3);
		   A.next=B;
		   A.next.next=C;
		   A.next.next.next=D;
		   System.out.println(deleteDuplicates(A));
	   }
}
