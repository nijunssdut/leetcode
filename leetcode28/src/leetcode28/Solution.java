package leetcode28;

public class Solution {
	 public static int divide(int dividend, int divisor) {
	     if(dividend==0)
	    	 return 0;
	     boolean sign=false;
	     if(dividend>0&&divisor<0||dividend<0&&divisor>0)
	     {
	    	 sign=true;
	     }
	     int rs=0;
	     divisor=Math.abs(divisor);
	     dividend=Math.abs(dividend);
	     if(divisor>dividend)
	    	 return rs;
	     else if(divisor==1){
	    	 return dividend;
	     }
	     else{
	    	 int temp;
	    	 int counter;
	    	 while(dividend>=divisor){
	    		 temp=divisor;
	    		 counter=1;
	    		 while(temp+temp<dividend){
	    			 temp+=temp;
	    			 counter+=counter;
	    		 }
	    		 dividend=dividend-temp;
	    		 rs+=counter;
	    	}
	    	 
	     }
	     if(sign)
	    	 rs=-rs;
	    	return rs; 
	    }
	 public static void main(String args[]){
		 System.out.println( divide(2147483647,2));
	 }

}
