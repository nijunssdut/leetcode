package leetcode113;

public class Solution {
	 public void flatten(TreeNode root) {
	     build(root);   
	    }
	 public void build(TreeNode root)
	 {
		 if(root==null)
			 return;
		 if(root.left!=null)
		 {
			 build(root.left);
			 TreeNode rs=root.left;
			 while(rs.right!=null){
				 rs=rs.right;
			 }//find the end of left
			 rs.right = root.right;
			 root.right = root.left;
			 root.left = null;
		 }
		 if(root.right!=null)
		 {
			 build(root.right);
		 }
	 }
	 public static void main(String args[])
	 {
		 System.out.println();
	 }
}
