package leetcode122;

public class Solution {
	  public static int maxProfit(int[] prices) {
		   int rs = 0;  
	       if (prices.length == 0) {  
	            return rs;  
	        }  
	        int n = prices.length;  //at most two transactions
	        int[] left = new int[n];  
	        int[] right = new int[n];// find the maxProfit from two side  
	        int min = prices[0];  
	        for (int i = 1; i < n; i++) {  
	            left[i] = left[i - 1] > prices[i] - min ? left[i - 1] : prices[i] - min;  
	            min = min < prices[i] ? min : prices[i];  
	        }  
	        int max = prices[n - 1];  
	        for (int i = n - 2; i >= 0; i--) {  
	            right[i] = right[i + 1] > max - prices[i] ? right[i + 1] : max - prices[i];  
	            max = max > prices[i] ? max : prices[i];  
	        }  
	          
	        for (int i = 0; i < n; i++) {  
	           rs = rs > left[i] + right[i] ? rs: left[i] + right[i];  
	        }  //add it
	        return rs;  
	    }  
	    public static void main(String args[]){
	    	int []A={1,3,4,2,9,5};
	    	System.out.println(maxProfit(A));
	    }
}
