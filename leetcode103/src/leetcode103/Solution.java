package leetcode103;


public class Solution {
	 public static int maxDepth(TreeNode root) {
	  if (root == null)
	       return 0;            
	  int rs;
	  int lDepth = maxDepth(root.left);
	  int rDepth = maxDepth(root.right);
	  if(lDepth>rDepth)
		  rs=lDepth+1;
	  else
		  rs=rDepth+1;
	  return rs;
	 }
	 public static void main(String args[])
	 {
		  TreeNode A=new TreeNode(3);
		  TreeNode B=new TreeNode(9);
		  TreeNode C=new TreeNode(20);
		  TreeNode D=new TreeNode(15);
		  TreeNode E=new TreeNode(7);
		  TreeNode F=new TreeNode(34);
		  A.left=B; A.right=C;
		  C.left=D;C.right=E;
		  B.left=F;
		  System.out.println(maxDepth(A));
	 }
}
