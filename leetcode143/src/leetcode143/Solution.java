package leetcode143;

import java.util.ArrayList;


public class Solution {
	   public static ArrayList<Integer> postorderTraversal(TreeNode root) {
		   ArrayList<Integer> rs=new ArrayList<Integer>();
			  build(rs,root);
			  return rs;
	    }
	   public static void build(ArrayList<Integer> rs,TreeNode root){
			  if(root==null)
				  return; 
			  if(root.left!=null){
				  build(rs,root.left);
			  }
			  build(rs,root.right);
			  rs.add(root.val);//the last root
				  
		  }
		  public static void main(String args[])
		  {
			  TreeNode A=new TreeNode(1);
			  TreeNode B=new TreeNode(2);
			  TreeNode C=new TreeNode(3);
			  A.right=B;
			  B.left=C;
			  System.out.println( postorderTraversal(A));
		  }
}
