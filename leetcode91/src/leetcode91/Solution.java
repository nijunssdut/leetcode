package leetcode91;

public class Solution {
	 public static ListNode reverseBetween(ListNode head, int m, int n) {
		 if (head == null)
	             return head;             
         ListNode q = null;
         ListNode p = head;
         for(int i = 0; i < m - 1; i++)
        {
            q = p;
            p = p.next;
         }         
         ListNode end = p;
         ListNode pPre = p;
         p = p.next;
         for(int i = m + 1; i <= n; i++)
         {
             ListNode pNext = p.next;
             p.next = pPre;
             pPre = p;
             p = pNext;
         }        
         end.next = p;
         if (q!=null)
             q.next = pPre;
         else
             head = pPre;
        
         return head;
    }
	 public static void main(String args[])
	 {
		 
		  ListNode A=new ListNode(1);
		  ListNode temp=A;
		  for(int i=2;i<=5;i++)
		  {
			  ListNode B=new ListNode(i);
			  temp.next=B;
			  temp=temp.next;
		  }
		   System.out.println(reverseBetween(A,2,4));
	 }
	    
}
