package leetcode127;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {
	  public static int longestConsecutive(int[] num) {
	 /*       Arrays.sort(num);
	        int len=num.length;
	        if(len==0)
	        	return 0;
	        int rs=0;
	        int temp=0;
	        int index=0;
	        if(len==0)
	        	return 0;
	        while(index<len){
	        	temp=1;
	        	for(int i=index;i<len;i++)
	        	{
	        		if(i!=len-1&&num[i+1]==num[i]+1)
	        		{
	        			temp++;
	        			continue;
	        		}
	        		else{
	        			index=i+1;
	        			break;
	        		}
	        		
	        	}
	        	if(temp>rs)
	        		rs=temp;
	        }
	        return rs;
	        */
		  if(num.length == 0)  
	            return 0;  
	        if(num.length == 1)  
	            return 1;  
	        HashSet<Integer> hash = new HashSet<Integer>();  
	        for(int i = 0; i < num.length; i++)  
	        {  
	            hash.add(num[i]);  
	        }  
	        int res = 0;  
	        for(int i = 0; i < num.length; i++)  
	        {  
	            int tmplen = 1, tmpnum;  
	            tmpnum = num[i] + 1;  
	            while(hash.contains(tmpnum))  
	            {  
	                hash.remove(tmpnum);  
	                tmplen++;  
	                tmpnum++;  
	            }  
	            tmpnum = num[i] - 1;  
	            while(hash.contains(tmpnum))  
	            {  
	                hash.remove(tmpnum);  
	                tmplen++;  
	                tmpnum--;  
	            }  
	            if(tmplen > res)  
	                res = tmplen;  
	            if(res >= num.length)  
	                break;  
	        }  
	        return res;  
	    }  

	  public static void main(String args[])
	  {
		  int[]A={1,2,0,1};
		  System.out.println(longestConsecutive(A));
	  }
	
}
