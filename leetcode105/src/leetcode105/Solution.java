package leetcode105;

//前序遍历，也叫先根遍历，遍历的顺序是，根，左子树，右子树
//后序遍历，也叫后跟遍历，遍历顺序，左子树，右子树，根

public class Solution {
	public static TreeNode buildTree(int[] inorder, int[] postorder) {
			return  check(inorder ,postorder, 0, inorder.length - 1, 0, postorder.length - 1);
		}
		  public static TreeNode check(int[] inorder, int[] postorder,int pl,int pr,int ql,int qr)
		  {
			  TreeNode root;
		        if (pl > pr || ql > qr) {  
		            root = null;              
		        } 
		        	
		        else {  
		            root = new TreeNode(postorder[qr]);//the left;  
		            int i;  
		            for (i = pl; i <= pr&&inorder[i] != postorder[qr]; i++);
		            root.left = check(inorder, postorder, pl ,i- 1, ql, ql + i - pl-1);  //ensure the left for inorder
		            root.right = check(inorder, postorder,  i+1, pr, ql+i-pl, qr-1);  
		        }          
		        return root;  
		  }
	
		  public static void main(String args[])
		  {
			  int []A={1,3,2};
			  int []B={3,2,1};
			  System.out.println(buildTree(A,B));
		  }

}
