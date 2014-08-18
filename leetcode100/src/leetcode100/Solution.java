package leetcode100;

public class Solution {
	 public static boolean isSymmetric(TreeNode root) {
		  if (root == null)
	             return true;
		 return check(root.left,root.right); 
	    }
	 public static boolean check(TreeNode left,TreeNode right){
		 if(left==null&&right==null)
			 return true;
		 else if(left==null||right==null||left.val!=right.val)
			 return false;
		 else if(left.val==right.val){
			return check(left.left, right.right)&&check(left.right, right.left);
		 }
		 return false;
	 }
	 public static void main(String args[])
	 {
		 TreeNode A=new TreeNode(1);
		 TreeNode B=new TreeNode(2);
		 TreeNode C=new TreeNode(2);
		 A.right=B;
		 A.left=C;
		System.out.println(isSymmetric(A)); 
	 }
}
