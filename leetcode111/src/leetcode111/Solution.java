package leetcode111;

public class Solution {
	 public static boolean hasPathSum(TreeNode root, int sum) {
		 return  check(root,sum,0);   
	    }
	 public static boolean check(TreeNode root,int sum,int temp)
	 {
		 if(root==null)
			 return false;
		 if(root.left==null&&root.right==null)
		 {	 temp+=root.val;
		 	 return temp==sum;
		 }
		 return check(root.left,sum,temp+root.val)||check(root.right,sum,temp+root.val);
	 }
	 public static void main(String args[])
	 {
			TreeNode A=new TreeNode(1);
			TreeNode B=new TreeNode(2);
			TreeNode C=new TreeNode(3);
			TreeNode D=new TreeNode(6);
			B.left=A;
			B.right=C;
			C.right=D;
			System.out.println( hasPathSum(B,11));
	 }
}
