package leetcode93;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
	   public static ArrayList<Integer> inorderTraversal(TreeNode root) {
		        Stack<TreeNode> S=new Stack<TreeNode>();  
		        ArrayList<Integer> rs=new ArrayList<Integer>();  
		        rs.clear();  
		        if(root==null)  
		            return rs;  
		        TreeNode p =root;   
		        while(!S.empty()|| p!=null)  
		        {  
		            if(p!=null)  
		            {  
		                S.push(p);  
		                p= p.left;  
		            }else{  
		                p = S.lastElement();  
		                S.pop();  
		                rs.add(p.val);  
		                p = p.right;  
		            }  
		        }  
		        return rs;  
		    }  
	public static void main(String args[])
	{
		TreeNode A=new TreeNode(1);
		TreeNode B=null;
		TreeNode C=new TreeNode(2);
		TreeNode D=new TreeNode(3);
		A.left=B;
		A.right=C;
		C.left=D;
		System.out.println(inorderTraversal(A));
		
	}
}
