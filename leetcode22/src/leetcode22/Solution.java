package leetcode22;

public class Solution {

public static ListNode swapPairs(ListNode head) {
	 if(head==null||head.next==null)
    	 return head;
     ListNode p=head;
     ListNode q=p.next;
     ListNode n=q.next;
     head=head.next;
     while(q!=null){
    	q.next=p;//three
    	if(n!=null&&n.next!=null)
    		 p.next=n.next;
    	 else
    		 p.next=n;
    	 p=n;
    	 if(n!=null)
    		 q=n.next;//four
    	 else
    	     q=null;
    	 if(n!=null&&n.next!=null)
    		 n=n.next.next;//five
    	 else
    	     n=null;
     }
     return head;
    }
public static void main(String args[])
{
	ListNode input=new ListNode(4);
	System.out.println(swapPairs(input));
}
}
