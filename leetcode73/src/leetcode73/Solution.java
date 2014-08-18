package leetcode73;

public class Solution {
	 public static boolean searchMatrix(int[][] matrix, int target) {
		  int i = 0;
		  int j = matrix[0].length - 1;      
		  while (i < matrix.length && j>= 0)
		  {
	        if (target == matrix[i][j])
	        	return true;
	        else if (target < matrix[i][j])
	    	     j--;//find from the before line
		    else
		         i++;//find from next row
		   }
		          
		     return false;
}
	 public static void main(String args[])
	 {
		 int [][]A=new int[3][4];
		 int k=0;
		 for(int i=0;i<3;i++)
		 {
			 for(int j=0;j<4;j++)
			 {
				 A[i][j]=++k;
			 }
		 }
		 System.out.println(searchMatrix(A,3));
	 }
	 
}


