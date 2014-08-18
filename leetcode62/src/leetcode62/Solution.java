package leetcode62;

public class Solution {
	 public static int minPathSum(int[][] grid) {
		 int m = grid.length;  
	     int n = grid[0].length;   
	     int temp;
		 int rs[][]=new int[m][n];  
	            rs[0][0] =grid[0][0] ;  	      
	        for (int i = 1; i < m; i++) {  
	        	rs[i][0]=rs[i-1][0]+grid[i][0];
	        }  
	        for (int j = 1; j < n; j++) {
	        	rs[0][j]=rs[0][j-1]+grid[0][j];
	        }  //Á½±ß
	        for (int i = 1; i < m; i++) {  
	            for (int j = 1; j < n; j++) {  
	            	temp=rs[i - 1][j]> rs[i][j - 1]?rs[i][j-1]:rs[i-1][j];
	            		rs[i][j] = temp+grid[i][j];  
	            }  
	        }  
	        return rs[m - 1][n - 1];  
		 
	    }
	 public static void main(String args[])
	 {
		 int A[][]=new int[3][3];
		 int k=1;
		 for(int i=0;i<3;i++)
		 {
			 for(int j=0;j<3;j++)
			 {
				 A[i][j]=k;
				 k++;
			 }
		 }
		 System.out.println(minPathSum(A));
	 }
}
