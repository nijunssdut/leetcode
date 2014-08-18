package leetcode131;


public class Solution {
	  public static int minCut(String s) {
		  int len = s.length();  
	        int[] dp = new int[len+1];  
	        if (s == null || s.length() == 0)  
	              return 0;  
	        for(int i=len; i>=0; i--)  
	            dp[i] = len-i;  
	        boolean[][] matrix = new boolean[len][len];    
	        for(int i=len-1; i>=0; i--)  
	            for(int j=i; j<len; j++)  
	            {  
	                if(s.charAt(i) == s.charAt(j) && (j-i<2 || matrix[i+1][j-1]))  
	                {  
	                    matrix[i][j] = true;  //Palindrome or not
	                    dp[i] = Math.min(dp[i], dp[j+1]+1);  
	                }  
	            }  
	        return dp[0]-1;  
	    }  
	  public static void main(String args[])
	    {
	    	System.out.println(  minCut("aab"));
	    }
}
