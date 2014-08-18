package leetcode120;

public class Solution {
	 public static int maxProfit(int[] prices) {
		 if (prices.length == 0)
	            return 0;
	            
	        int maxPrice = prices[prices.length-1];
	        int rs = 0;
	        for(int i = prices.length - 1; i >= 0; i--)
	        {
	            maxPrice = Math.max(maxPrice, prices[i]);//the max to sell
	            rs =Math.max(rs, maxPrice - prices[i]);//the left of get the most;
	        }
	        
	        return rs;
	    }
	    public static void main(String args[]){
	    	int []A={1,3,4,2,9,5};
	    	System.out.println(maxProfit(A));
	    }
}
