package leetcode85;

public class Solution {
	 public static ListNode partition(ListNode head, int x) {
	     if(head==null)
	    	 return head;
	     ListNode left=null;
	     ListNode right=head;
	     ListNode temp=head;
	     while(temp.next!=null)
             temp = temp.next;             
         ListNode end = temp;
	     while(right != temp)
	     {
           if (right.val >= x)
           {
               ListNode pNext = right.next;
               if (head == right)
            	   head = pNext;
                 end.next = right;
                 right.next = null;
                 end = right;
	    	   if (left!=null)
                   left.next = pNext;
	    	   right= pNext;
             }
             else
             {
                 left = right;
                 right = right.next;
            }
         }
	     if (right.val >= x && temp != end)
	     {
           ListNode pNext = right.next;
             if (head == right)
                 head = pNext;
             end.next = right;
             right.next = null;
             if (left!=null)
            	 left.next = pNext;
            	 }
	              return head;       
	    }
	 public static void main(String args[])
	 {
		 ListNode head=new ListNode(1);
		 ListNode A=new ListNode(4);
		 ListNode B=new ListNode(3);
		 ListNode C=new ListNode(2);
		 ListNode D=new ListNode(5);
		 ListNode E=new ListNode(2);
		 head.next=A;
		 A.next=B;
		 B.next=C;
		 C.next=D;
		 D.next=E;
		 System.out.println(partition(head,3));
	 }
}
