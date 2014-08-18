package leetcode66;

public class Solution {
	  public static int[] plusOne(int[] digits) {
		  int i;
	        for(i = digits.length - 1;i >= 0;--i){
	            if(digits[i] != 9){
	                ++digits[i];
	                return digits;
	            }
	            else {
	                digits[i] = 0;
	            }
	        }
	        if(i < 0) {
	        	 int[] result = new int[digits.length + 1];  
	             result[0] = 1;  
	             System.arraycopy(digits, 0, result, 1, digits.length); 
	             return result;    
	        }//²¹×î¸ßÎ»
	        return digits;
	    }
	  public static void main(String args[])
	  {
		  int []digits=new int[1];
		  for(int i=0;i<1;i++)
		  {
			  digits[i]=9;
		  }
		  System.out.println(plusOne(digits));
	  }

}
