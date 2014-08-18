package leetcode123;

public class Solution {
		static int rs;
	  public static int maxPathSum(TreeNode root) {
		  rs=Integer.MIN_VALUE;
		  check(root);  
	     return rs;
	    }
	  public static int check(TreeNode root){
		
		  int lmax=0;
		  int rmax=0;
		  if(root==null)
			  return 0;
		  lmax = check(root.left);  
		  rmax = check(root.right); 
		  int res=root.val; 
		   if(lmax>0) {  
	              res += lmax;
	          }
            if(rmax>0) {  
            	res += rmax;
	          }
		  if(rs<res)
		  {
			  rs=res;
		  }
		  return  Math.max(root.val,Math.max(root.val + lmax, root.val + rmax));  
	  }
	  public static void main(String args[])
	  {
		  TreeNode A=new TreeNode(2);
		  TreeNode B=new TreeNode(1);
		  TreeNode C=new TreeNode(3);
		  A.left=B;
		  A.right=C;
		  System.out.println(maxPathSum(A));
	  }
}
