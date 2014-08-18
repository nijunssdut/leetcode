package leetcode77;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	 public static ArrayList<ArrayList<Integer>> subsets(int[] S) {
		 ArrayList<ArrayList<Integer>> rs=new  ArrayList<ArrayList<Integer>>();
		 if(S == null || S.length == 0)  
		        return rs;  
		 Arrays.sort(S);	
		 ArrayList<Integer> cur=new ArrayList<Integer>(S.length);
		 for(int k=0;k<S.length;k++)
		 {
			 cur.add(S[k]);
		 }	 
		 rs.add(new ArrayList<Integer>());  
		 for(int i=0;i<S.length;i++)  
		    {  
			 	int size=rs.size(); 
		        for(int j=0;j<size;j++)  
		        {  
		            ArrayList<Integer> item = new ArrayList<Integer>(rs.get(j));  
		            item.add(S[i]);  
		            rs.add(item);  
		            
		        } 
		        
		    }  
		 return rs;
	    }
	 public static void main(String args[])
	 {
		 int []A=new int[3];
		 for(int i=0;i<3;i++)
		 {
			 A[i]=i+1;
		 }
		 System.out.println(subsets(A));
	 }

}
