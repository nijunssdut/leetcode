package leetcode90;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	public static ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
			 ArrayList<ArrayList<Integer>> rs=new  ArrayList<ArrayList<Integer>>();
			  ArrayList<Integer> item = new ArrayList<Integer>();  
			  if(num == null || num.length == 0)  
			        return rs;  
			 Arrays.sort(num);	
			 base(num,0,rs,item);
			 return rs;
		    }
	public static void base(int[]num,int start, ArrayList<ArrayList<Integer>> rs, ArrayList<Integer> item)
	{ 
		 if(!rs.contains(item))
		      rs.add(new ArrayList<Integer>(item));  
		for(int i=start;i<num.length;i++)  
	    { 
	          
	            item.add(num[i]); 
	            base(num,i+1,rs,item);
	            item.remove(item.size()-1); 
	     
	    }
		
	}
		 public static void main(String args[])
		 {
			 int []A={1,2,2};
			 System.out.println(subsetsWithDup(A));
		 }
}
