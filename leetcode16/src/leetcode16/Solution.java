package leetcode16;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	 public static ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
		  ArrayList<ArrayList<Integer>> rs=new ArrayList<ArrayList<Integer>>();
		    int n=num.length;
		    if(n==0)
		    {
		    	return rs;
		    }
	        int start;
	        int  end;
	        Arrays.sort(num);
	        for(int i=0;i<n;i++)
	        {
	        	if(i > 0 && num[i]==num[i-1])  
	               continue;
	        	 for (int j= i + 1; j< n; j++)
	             {
	                 if (j != i + 1 && num[j] == num[j - 1])
	                 {
	                     continue;
	                 }
	            //first two as one 
	            start=j+1;  
	            end=n-1;  
	               while(start<end){  
	                   if(start>j+1&&num[start]==num[start-1]){   
	                       start++;  
	                       continue;  
	                   }  
	                   if(end<n-1&& num[end]==num[end+1]){  
	                       end--;  
	                       continue;  
	                   }  
	                    int sum = num[i] + num[start] + num[end]+num[j];  
	                   if(sum>target){  
	                       end--;  
	                   }else if(sum<target){  
	                       start++;  
	                   }else{
	                	   ArrayList<Integer> temp=new ArrayList<Integer>();
	                	   temp.add(num[i]);
	                	    temp.add(num[j]);
	                	   temp.add(num[start]);
	                	   temp.add(num[end]);
	                	   rs.add(temp); 
	                       start++;  
	                   }  
	               }
	             }
	        }
	           return rs;  
	        }
	    public static void main(String args[])
	    {
	    	int []A={1 ,0, -1, 0, -2, 2};
	    	System.out.println(fourSum(A,0));
	    }
	    
}
