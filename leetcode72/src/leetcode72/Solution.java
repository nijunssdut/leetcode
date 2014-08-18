package leetcode72;

public class Solution {
	 public void setZeroes(int[][] matrix) {
		   int m = matrix.length, n = matrix[0].length;  
	        boolean row0 = false, col0 = false;  
	                for(int i = 0; i < m; ++i)  
	                    if (matrix[i][0] == 0)  
	                    {  
	                        col0 = true;  
	                        break;  
	                    } 
	                for (int j = 0; j < n; j++) { 
	                	 if (matrix[0][j] == 0)  
		                    {  
		                        row0 = true;  
		                        break;  
		                    } 
	                	
	                }
	               //sign the first 
	        for (int i = 1; i < m; i++) {  
	            for (int j = 1; j < n; j++) {  
	            	if(matrix[i][j] == 0) 
                	{	matrix[i][0] = 0;
               			matrix[0][j] = 0 ; 
                	}
	            }
	        }
	        for (int i = 1; i < m; i++) {  
	            for (int j = 1; j < n; j++) {
	            	if(matrix[i][0] == 0 || matrix[0][j] == 0 )
	            		matrix[i][j] = 0;
	               }  
	        }  
	          //aim at the first
	        for (int i = 0; i < m && col0; i++) {  
	            matrix[i][0] = 0;  
	        }  
	        for (int j = 0; j < n && row0; j++) {  
	            matrix[0][j] = 0;  
	        }  
	  
	    }  
	    public static void main(String args[])
	    {
	    	System.out.println();
	    }
}
