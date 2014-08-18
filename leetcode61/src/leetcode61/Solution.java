package leetcode61;

public class Solution {
	 public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		 int m = obstacleGrid.length;  
	     int n = obstacleGrid[0].length;   
		 int rs[][]=new int[m][n];
		 if (obstacleGrid[0][0] == 1) {  
	            rs[0][0] = 0;  
	        } else {  
	            rs[0][0] = 1;  
	        }  
	      
	        for (int i = 1; i < m; i++) {  
	        	if(obstacleGrid[i][0]==1)
	        		rs[i][0]=0;
	        	else
	        		rs[i][0] = rs[i-1][0];  
	        }  
	        for (int j = 1; j < n; j++) {
	        	if(obstacleGrid[0][j]==1)
	        		rs[0][j]=0;
	        	else
	        		rs[0][j] =rs[0][j-1];  
	        }  //Á½±ß
	        for (int i = 1; i < m; i++) {  
	            for (int j = 1; j < n; j++) {  
	            	if(obstacleGrid[i][j]==1)
	            		rs[i][j]=0;
	            	else
	            		rs[i][j] = rs[i - 1][j] + rs[i][j - 1];  
	            }  
	        }  
	        return rs[m - 1][n - 1];  
		 
	    }
	 public static void main(String args[])
	   {
		   int A[][]=new int [3][3];
		   for(int i=0;i<3;i++)
			   for(int j=0;j<3;j++)
				   A[i][j]=0;
		   A[1][1]=1;
		   System.out.println(uniquePathsWithObstacles(A));
	   }
}
