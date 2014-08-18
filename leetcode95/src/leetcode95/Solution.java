package leetcode95;

import java.util.ArrayList;

public class Solution {
	 public static ArrayList<TreeNode> generateTrees(int n) {
		 return find(0, n-1);
	    }
	 public static ArrayList<TreeNode>find(int start,int end){
		 ArrayList<TreeNode> rs=new ArrayList<TreeNode>();
		 if(start>end)
		 {
			 rs.add(null);
			 return rs;
		 }
		 ArrayList<TreeNode> lt=new ArrayList<TreeNode>();
		 ArrayList<TreeNode> rt=new ArrayList<TreeNode>();
		 for(int i=start;i<=end;i++)
		 {
			 lt=find(start,i-1);
			 rt=find(i+1,end);
			 for(int j=0;j<lt.size();j++)
			 {
				 for(int k=0;k<rt.size();k++)
				 {
					 TreeNode temp=new TreeNode(i+1);
					 temp.left=lt.get(j);
					 temp.right=rt.get(k);
					 rs.add(temp);
				 }
			 }
		 }
		 return rs;
	 }
	 public static void main(String args[])
	 {
		 System.out.println( generateTrees(3));
	 }
}
