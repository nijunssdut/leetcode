package leetcode115;

public class Solution {
	public void connect(TreeLinkNode root) {
      check(root);  
    }
	public void check(TreeLinkNode root){
		if(root==null)
			return;
		if(root.left!=null){
			
			root.left.next=root.right;
		}
		if(root.right!=null){
			
			root.right.next = root.next!=null ? root.next.left:null;    	
		}
		check(root.left);
		check(root.right);
	}
	public static void main(String args[])
	{
		System.out.println();
	}
}
