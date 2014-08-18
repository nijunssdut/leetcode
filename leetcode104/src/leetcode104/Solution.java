package leetcode104;

public class Solution {
	  public static TreeNode buildTree(int[] preorder, int[] inorder) {
		return  check(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
	        
	    }
	  public static TreeNode check(int[] preorder, int[] inorder,int pl,int pr,int ql,int qr)
	  {
		  TreeNode root;  
	        if (pl > pr || ql > qr) {  
	            root = null;              
	        }  
	        else {  
	            root = new TreeNode(preorder[pl]);      
	            int i;  
	            for (i = ql; i <= qr && preorder[pl] != inorder[i]; i++);  
	            root.left = check(preorder, inorder, pl + 1, pl + i - ql, ql, i - 1);  
	            root.right = check(preorder, inorder, pl + i - ql + 1, pr, i + 1, qr);  
	        }          
	        return root;  
	  }
	  public static void main(String args[])
	  {
		  int []A={1,2,5};
		  int []B={2,1,5};
		  System.out.println(buildTree(A,B));
	  }

}
