package leetcode108;


public class Solution {
	  public static TreeNode sortedListToBST(ListNode head) {
		   int len=0;
		   ListNode p=head;
		   while(p!=null)
		   {
			   len++;
			   p=p.next;
		   }
		   TreeNode res;
		   if(len==0)
			   return null;
		   res=check(head,len);
			return  res;
	    }
	  public static TreeNode check(ListNode head,int length)
	   {
		  
		  if(length == 0 || head == null){  
	            return null;  
	        }else if(length == 1){  
	            return new TreeNode(head.val);  
	        }  
		   ListNode temp=head;
		   int mid= (int)length/2;
		   for(int i = 0; i<mid; i++){  
	            temp = temp.next;  
	        } 
		   TreeNode rs=new TreeNode(temp.val);
		   TreeNode l=check(head,mid); 
		   TreeNode r=check(temp.next,length-mid-1);
		     rs.left=l;
		     rs.right=r;
		  
		   return rs;
	   }
	  public static void main(String args[]){
		   ListNode A=new ListNode(1);
		   ListNode B=new ListNode(2);
		   ListNode C=new ListNode(3);
		   A.next=B;
		   A.next.next=C;
		   System.out.println(sortedListToBST(A));
	   }
}
