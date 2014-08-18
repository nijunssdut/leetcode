package leetcode101;

import java.util.ArrayList;

public class Solution {
	  public static ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
	        ArrayList<ArrayList<Integer>> rs=new ArrayList<ArrayList<Integer>>();
	        if(root==null)
	        	return rs;
	        rs.clear();
	        check(0,root,rs);
	        return rs;
	    }
	  public static void check(int start,TreeNode root,ArrayList<ArrayList<Integer>> rs)
	  {
		  if (root == null)
	             return;
		 
		  if(rs.size()>start)
		  {
			  rs.get(start).add(root.val);
		  }
		  else
		  {
			  ArrayList<Integer> temp=new ArrayList<Integer>();
             temp.add(root.val);
             rs.add(temp);
		  }
		  check(start + 1, root.left,rs);
		  check(start + 1, root.right,rs);
	  }
	  public static void main(String args[])
	  {
		  TreeNode A=new TreeNode(3);
		  TreeNode B=new TreeNode(9);
		  TreeNode C=new TreeNode(20);
		  TreeNode D=new TreeNode(15);
		  TreeNode E=new TreeNode(7);
		  //TreeNode F=new TeeNode(3);
		  A.left=B; A.right=C;
		  C.left=D;C.right=E;
		  System.out.println(levelOrder(A));
	  }
}
