package leetcode60;
//Ñî»ÔÈý½Ç
public class Solution {
	 public static int uniquePaths(int m, int n) {
		        int rs[][]=new int[m][n]; 
		        for(int i=0;i<m;i++)
		        {	for(int j=0;j<n;j++)
		        	{	rs[i][j]=0;
		        	
		        	}
		        }
		        for (int i = 0; i < m; i++) {  
		            rs[i][0] = 1;  
		        }  
		        for (int j = 0; j < n; j++) {  
		            rs[0][j] = 1;  
		        }  //Á½±ß
		        for (int i = 1; i < m; i++) {  
		            for (int j = 1; j < n; j++) {  
		                rs[i][j] = rs[i - 1][j] + rs[i][j - 1];  
		            }  
		        }  
		        return rs[m - 1][n - 1];  
		    }  
	   public static void main(String args[])
	   {
		   System.out.println(uniquePaths(3,7));
	   }

}
