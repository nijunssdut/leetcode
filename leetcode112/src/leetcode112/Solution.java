package leetcode112;

import java.util.ArrayList;


public class Solution {
	 public static ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
		 ArrayList<ArrayList<Integer>> rs=new ArrayList<ArrayList<Integer>>();
		 ArrayList<Integer> tmp=new ArrayList<Integer>();
	        		check(rs,root,sum,0,tmp);  
	        		return rs;
	    }
		 
	 public static void check(ArrayList<ArrayList<Integer>> rs,TreeNode root,int sum,int temp,ArrayList<Integer> tmp)
	 {
		
		 if(root==null)
			 return;
		
		 if(root.left==null&&root.right==null)
		 {	 
			 tmp.add(root.val);
			 for(int i=0;i<tmp.size();i++)
				 temp+=tmp.get(i);	
		 	if(temp==sum){
		 	
		 		rs.add(new ArrayList<Integer>(tmp));
		 	}
		 	return;
		 	
		 }  
		 tmp.add(root.val);
			if(root.left!=null)
			 {
				check(rs,root.left,sum,temp,tmp);
				  tmp.remove(tmp.size() - 1);  
			 }
			if(root.right!=null){
			 check(rs,root.right,sum,temp,tmp);
			 tmp.remove(tmp.size()-1);
			}
	 }
	 public static void main(String args[])
	 {
			TreeNode A=new TreeNode(3);
			TreeNode B=new TreeNode(0);
			TreeNode C=new TreeNode(1);
			TreeNode D=new TreeNode(2);
			B.left=A;
			B.right=C;
			C.right=D;
			System.out.println( pathSum(B,3));
	 }

}
