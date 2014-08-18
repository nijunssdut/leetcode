package leetcode71;

public class Solution {
	 public static int minDistance(String word1, String word2) {  
	 	int row = word1.length() + 1;
        int col = word2.length() + 1;
        int temp;
        int [][]rs=new int[row][col];
	 	  for (int i = 0; i < row; i++)
	            rs[i][0] = i;

	        for (int i = 0; i < col; i++)
	            rs[0][i] = i;

	        for (int i = 1; i < row; i++)
	            for (int j = 1; j < col; j++){
	                if (word1.charAt(i-1) == word2.charAt(j-1))
	                    rs[i][j] = rs[i-1][j-1];
	                else
	                    rs[i][j] = rs[i-1][j-1] + 1;
	                temp=rs[i-1][j]+1>rs[i][j-1]+1?rs[i][j-1]+1:rs[i-1][j]+1;
	                rs[i][j] = rs[i][j]>temp?temp:rs[i][j];
	            } 

	        return rs[row-1][col-1];
	 }
	 public static void main(String args[])
	 {
		 System.out.println(minDistance("hello","hasllo"));
	 }
	  
}
