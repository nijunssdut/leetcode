package leetcode145;

public class Solution {
	public static ListNode insertionSortList(ListNode head) {
        if(head==null)
        	return head;
        ListNode temp1=head.next;
        ListNode temp2=null;
        while(temp1 != null)  
        {  
            temp2 = head;  
            while(temp2.val < temp1.val && temp2 != temp1)  
                temp2 = temp2.next; //find the position to change 
            if(temp2 != temp1)  
            {  
                int first = temp1.val;  
                int second;  
                while(temp2 !=temp1)  
                {  
                    second = temp2.val;  
                    temp2.val = first;  
                    first = second;  
                    temp2=temp2.next;  
                }  //change two Integer step by step
                temp2.val=first;  
            }  
            temp1 = temp1.next;  
        }  
        return head;  
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
		System.out.println(insertionSortList(A));
	}
}
