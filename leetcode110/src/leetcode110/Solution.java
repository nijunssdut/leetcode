package leetcode110;


public class Solution {
	 public static int minDepth(TreeNode root) {
	        if(root==null)
	        	return 0;
	        if(root.left==null&&root.right==null)
	        	return 1;
	        int lp;
	        int rp;
	        lp=minDepth(root.left);
	        rp=minDepth(root.right);
	        if(lp==0)
	        	return rp+1; //from the root node down to the nearest leaf node.
	        else if(rp==0)
	        	return lp+1;
	        else
	        	return Math.min(lp, rp)+1;
	    }
	 public static void main(String args[])
	 {
			TreeNode A=new TreeNode(1);
			TreeNode B=new TreeNode(2);
			TreeNode D=new TreeNode(3);
			TreeNode C=new TreeNode(0);
			B.left=A;
			B.right=D;
			A.left=C;
			System.out.println(minDepth(B));
	 }
}
