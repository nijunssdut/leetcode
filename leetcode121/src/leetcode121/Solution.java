package leetcode121;

public class Solution {
	  public static int maxProfit(int[] prices) {
		  if (prices.length <2)
	            return 0;
	            
	        int rs = 0;
	        for(int i =1 ; i <=prices.length - 1 ; i++)
	        {
	        	 if(prices[i]>prices[i-1])
	             {
	                 rs += prices[i]-prices[i-1];
	             }
	        	   
	        }
	        
	        return rs;
	    }
	    public static void main(String args[]){
	    	int []A={1,3,4,2,9,5};
	    	System.out.println(maxProfit(A));
	    }
	    
}
