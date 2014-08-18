package leetcode57;

public class Solution {
	   public static int[][] generateMatrix(int n) {
		   int[][] matrix = new int[n][n];
	        if(n<=0)
	            return matrix;
	        int x1=0;
	        int x2=n-1; 
	        int k=1;    
	  while(x1 <= x2 )  
	 {  
      //up row  
      for(int i = x1; i <=x2; ++i) 
     	 matrix[x1][i]=k++;  
      //right column  
      for(int i = x1+1; i <=x2; ++i) 
     	 matrix[i][x2]=k++;  
      //bottom row  
      if(x2 != x1)  
      {
     	 for(int i = x2-1; i >= x1; --i) 
     		 matrix[x2][i]=k++;  
      }
      //left column  
      if(x1 != x2) 
      {
     	 for(int i = x2-1; i > x1; --i)
     		 matrix[i][x1]=k++;  
      } 
      x1++; x2--;  
  }  
	 return matrix;
}
	 public static void main(String args[])
	 {
		
		 System.out.println(generateMatrix(3));
	 }
}
