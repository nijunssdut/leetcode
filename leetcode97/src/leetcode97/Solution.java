package leetcode97;

public class Solution {
	  public static  boolean check(TreeNode node, int left, int right){
	     if(node==null)
	    	 return true;
	     boolean flag;
	     //The left subtree of a node contains only nodes with keys less than the node's key.
	     flag=left < node.val && node.val < right && check(node.left, left, node.val) &&
	                  check(node.right, node.val, right);
	     return flag;
	    }
	  public static boolean isValidBST(TreeNode root) { 
		  boolean rs;
		  rs=check(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
		  return rs;
	  }
	  public static void main(String args[])
	  {
		  TreeNode A=new TreeNode(1);
		  TreeNode B=new TreeNode(2);
		  TreeNode C=new TreeNode(3);
		  A.right=B;
		  B.left=C;
		  System.out.println(isValidBST(A));
		  
	  }
}
