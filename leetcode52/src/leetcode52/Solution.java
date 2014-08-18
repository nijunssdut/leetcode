package leetcode52;

import java.util.ArrayList;

public class Solution {
	 public static ArrayList<Integer> spiralOrder(int[][] matrix) {
	        int len=matrix.length;
	        ArrayList<Integer> rs = new ArrayList<Integer>();
	        if(len==0)
	            return rs; 
	        int y1=0;
	        int y2=matrix[0].length-1;
	        int x1=0;
	        int x2=len-1; 
	        int k=0;
	     
	 while(x1 <= x2 && y1 <= y2)  
     {  
		
         //up row  
         for(int i = y1; i <=y2; ++i) 
        	 rs.add(k++,matrix[x1][i]);  
         //right column  
         for(int i = x1+1; i <=x2; ++i) 
        	 rs.add(k++,matrix[i][y2]);  
         //bottom row  
         if(x2 != x1)  
         {
        	 for(int i = y2-1; i >= y1; --i) 
        		 rs.add(k++,matrix[x2][i]);  
         }
         //left column  
         if(y1 != y2) 
         {
        	 for(int i = x2-1; i > x1; --i)
        		 rs.add(k++,matrix[i][y1]);  
         } 
         x1++; y1++; x2--; y2--;  
     }  
	 return rs;
}
	 public static void main(String args[])
	 {
		 int A[][]=new int[0][0];
		 /*int k=1;
		 for(int i=0;i<3;i++)
		 {	 for(int j=0;j<3;j++)
			 {
			 	A[i][j]=k;
			 	k++;
			 }
		 }*/
		 System.out.println(spiralOrder(A));
	 }
}
