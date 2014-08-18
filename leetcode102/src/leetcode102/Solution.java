package leetcode102;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	 public static ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {  
		 ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();  
	        if(root == null){  
	            return ret;  
	        }  
	           
	        Queue<TreeNode> queue = new LinkedList<TreeNode>();  
	        ArrayList<Integer> al = new ArrayList<Integer>();  
	        queue.add(root);  
	        int currentLevel = 1;  
	        int nextLevel = 0;  
	        boolean left = true;  
	           
	        while(!queue.isEmpty()){  
	            TreeNode cur = queue.remove();  
	            currentLevel--;  
	            al.add(cur.val);  
	            if(cur.left != null){  
	                queue.add(cur.left);  
	                nextLevel++;  
	            }  
	            if(cur.right!=null){  
	                queue.add(cur.right);  
	                nextLevel++;  
	            }  
	               
	            if(currentLevel == 0){  
	                if(!left){          // 当自右往左时，要翻转al  
	                    Collections.reverse(al);  
	                }  
	                left = !left;  
	                ret.add(al);  
	                al = new ArrayList<Integer>();  
	                currentLevel = nextLevel;  
	                nextLevel = 0;  
	            }  
	        }  
	        return ret;  
	    }  
	  public static void main(String args[])
	  {
		  TreeNode A=new TreeNode(3);
		  TreeNode B=new TreeNode(9);
		  TreeNode C=new TreeNode(20);
		  TreeNode D=new TreeNode(15);
		  TreeNode E=new TreeNode(7);
		  TreeNode F=new TreeNode(34);
		  A.left=B; A.right=C;
		  C.left=D;C.right=E;
		  B.left=F;
		  System.out.println(zigzagLevelOrder(A));
	  }
}
