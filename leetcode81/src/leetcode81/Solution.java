package leetcode81;
//感觉Listnode作用是指针不是变量，即通过移位变head的值，调试发现
public class Solution {
	   public static ListNode deleteDuplicates(ListNode head) {
	        if(head==null||head.next==null)
	        	return head;
	        ListNode rs=head;
	        ListNode temp=head.next;
	        while(temp!=null)
	        {
	        	if(rs.val==temp.val)
	        		rs.next=temp.next;
	        	else
	        		rs=rs.next;
	        	temp=temp.next;
	        }
	        return head;
	    }
	   public static void main(String args[])
	   {
		   ListNode A=new ListNode(1);
		   ListNode B=new ListNode(2);
		   ListNode C=new ListNode(2);
		   A.next=B;
		   A.next.next=C;
		   System.out.println(deleteDuplicates(A));
	   }
}
