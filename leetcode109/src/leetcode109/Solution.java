package leetcode109;


public class Solution {
	public static boolean isBalanced(TreeNode root) {
		if(root==null)
			return true;
		 TreeNode left = root.left;
	     TreeNode right = root.right;   
	     int dif = Math.abs(height(left) - height(right));
	        if(dif > 1) 
	        	return false;
	      return isBalanced(left) && isBalanced(right);
    }
	public static int height(TreeNode root) {
        if(root == null) return 0;
       return Math.max(height(root.left), height(root.right)) + 1;
	}
	public static void main(String args[])
	{
		TreeNode A=new TreeNode(1);
		TreeNode B=new TreeNode(2);
		TreeNode C=new TreeNode(0);
		B.left=A;
		A.left=C;
		System.out.println(isBalanced(B));
	}
}
