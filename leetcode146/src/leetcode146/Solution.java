package leetcode146;


public class Solution {
	  public static ListNode sortList(ListNode head) {
		        if(head==null||head.next==null)
		        	return head;
		        
		        ListNode temp1= getMiddleOfList(head);
		        ListNode temp2=temp1.next;
		        temp1.next=null;
				return sort(sortList(head),sortList(temp2));
		      
		     
		    }
	  public static ListNode sort(ListNode A,ListNode B)
	  {
		   ListNode rs=new ListNode(0);
	       ListNode p=rs;
	        while(A!=null&&B!=null) {  
	            if(A.val<=B.val) {  
	                p.next=A;
	                A=A.next;  
	            } else {  
	                p.next=B;
	                B=B.next;  
	            }  
	             p= p.next;  
	        }  
	        p.next =A!=null?A:B; 
	        return rs.next;    
	  }
	  public static ListNode getMiddleOfList(ListNode head) {  
	        ListNode slow = head;  
	        ListNode fast = head;  
	        while(fast.next!=null&&fast.next.next!=null) {  
	            slow = slow.next;  
	            fast = fast.next.next;  
	        }  
	        return slow;  
	    }  
			public static void main(String args[])
			{
				ListNode A=new ListNode(5);
				ListNode B=new ListNode(1);
				ListNode C=new ListNode(4);
				ListNode D=new ListNode(3);
				A.next=B;
				B.next=C;
				C.next=D;
				System.out.println(sortList(A));
			}
	    }

