package leetcode128;

public class Solution {
	   public static int sumNumbers(TreeNode root) {
		   if(root==null)
			   return 0;
		   return build(root,0);
		   
	   }
	   public static int build(TreeNode root,int num){
		   int temp=num*10+root.val;
		   if(root.left==null && root.right==null) {  
	            return temp;
	        }   
		   if(root.left==null)
			   return build(root.right,temp);
		   if(root.right==null)
			   return build(root.left,temp);
		   return build(root.left,temp)+build(root.right,temp);
	   }
	   public static void main(String args[])
	   {
		   TreeNode A=new TreeNode(1);
		   TreeNode B=new TreeNode(2);
		   TreeNode C=new TreeNode(3);
		   A.left=B;
		   A.right=C;
		   System.out.println(sumNumbers(A));
	   }
}
