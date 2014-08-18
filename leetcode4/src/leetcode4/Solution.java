package leetcode4;

import java.util.Scanner;


 // Definition for singly-linked list.
 /* public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 */
public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int temp = 0;//go up a position
        ListNode rs = new ListNode(0);
        ListNode cur = rs;
        while(l1 != null || l2 != null) {
            int i = 0;
            int j = 0;
            if(l1 != null) {
                i = l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                j = l2.val;
                l2 = l2.next;
            }
            int sum = i + j + temp;//the present position
            cur.next = new ListNode(sum%10);//save laster number
            cur = cur.next;
            temp = sum/10;
        }
        if(temp > 0) cur.next = new ListNode(temp);//the top number
               return rs.next;
        
        
	  }
	public static void main(String args[])
	{
		int num1;
		int num2;
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		Scanner sc2=new Scanner(System.in);
		num2=sc2.nextInt();
		ListNode input1=new ListNode(num1);
		ListNode input2=new ListNode(num2);
		ListNode result;
		result=new Solution().addTwoNumbers(input1, input2);
		System.out.println(result.val);
	}
}
