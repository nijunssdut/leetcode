package leetcode63;


public class Solution {
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) 
	{
	    if (l1 == null) return l2;
	    if (l2 == null) return l1;
	    
	    ListNode rs = null;
	    
	    if (l1.val < l2.val)
	    {
	        rs = l1;
	        rs.next = mergeTwoLists(l1.next, l2);//compare the next position
	    }
	    else
	    {
	        rs = l2;
	        rs.next = mergeTwoLists(l1, l2.next);
	    }
	    
	    return rs;
	}
	public static void main(String args[])
	{
		ListNode n1=new ListNode(3);
		ListNode n2= new ListNode(5);
		System.out.println(mergeTwoLists(n1,n2));
	}
}
