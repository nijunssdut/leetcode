package leetcode15;
import java.util.Arrays;

public class Solution {
	 public static int threeSumClosest(int[] num, int target) {
		    int n=num.length;
		    int rs=0;
		    if(n==0)
		    {
		    	return rs;
		    }
	        int start;
	        int  end;
	        boolean flag=true;
	        Arrays.sort(num);
	        for(int i=0;i<n;i++)
	        {
	            start=i+1;  
	            end=n-1;  
	               while(start<end){  
	                    int sum = num[i] + num[start] + num[end];  
	                   if(flag){  
	                      rs=sum;
	                      flag=false;  
	                   }else{
	                	   if (Math.abs(sum - target) < Math.abs(rs - target))
	                             rs = sum;         
	                   }  //find the closest
	                   if (rs == target)
	                     return rs;
	                   
	                   if (sum > target)
	                       end--;
	                   else
	                	   start++;
	               }
	        }
	           return rs;  
	        }
	    public static void main(String args[])
	    {
	    	int []A={-1,2,1,-4};
	    	System.out.println( threeSumClosest(A,1));
	    }
}
