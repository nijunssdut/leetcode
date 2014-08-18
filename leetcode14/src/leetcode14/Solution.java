package leetcode14;

import java.util.ArrayList;
import java.util.Arrays;


public class Solution {
	  public static ArrayList<ArrayList<Integer>> threeSum(int[] num) {
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
	            start=i+1;  
	            end=n-1;  
	               while(start<end){  
	                   if(start>i+1&&num[start]==num[start-1]){   
	                       start++;  
	                       continue;  
	                   }  
	                   if(end<n-1&& num[end]==num[end+1]){  
	                       end--;  
	                       continue;  
	                   }  
	                    int sum = num[i] + num[start] + num[end];  
	                   if(sum>0){  
	                       end--;  
	                   }else if(sum<0){  
	                       start++;  
	                   }else{
	                	   ArrayList<Integer> temp=new ArrayList<Integer>();
	                	   temp.add(num[i]);
	                	   temp.add(num[start]);
	                	   temp.add(num[end]);
	                	   rs.add(temp);
	                       start++;  
	                   }  
	               }
	        }
	           return rs;  
	        }
	    public static void main(String args[])
	    {
	    	int []A={-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
	    	System.out.println(threeSum(A));
	    }
	    
}
