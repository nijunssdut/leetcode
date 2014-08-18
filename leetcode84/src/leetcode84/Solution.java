package leetcode84;

public class Solution {
	  public static int maximalRectangle(char[][] matrix) {
		  int len1 = matrix.length;
	        if(len1 == 0)
	            return 0;
	        int len2 = matrix[0].length;
	        if(len2 == 0)
	            return 0;
	        int [][]mark = new int[len1][len2];
	        for(int i = 0;i < len1;i++)
	        {
	            for(int j = 0;j < len2;j++)
	            {
	                mark[i][j] = 0;
	                if(j == 0 && matrix[i][j] == '1')
	                    mark[i][j] = 1;
	                else if(matrix[i][j] == '1')
	                    mark[i][j] = 1 + mark[i][j-1];
	            }
	        }
	        int max = 0;
	        for(int i = 0;i < len1;i++)
	            for(int j = 0;j < len2;j++)
	            {
	                int tmps = 0;
	                int min2 = (int)Double.MAX_VALUE;
	                int t = i;
	                while(t < len1 && matrix[t][j] == '1')
	                {
	                    if(min2 > mark[t][j])
	                        min2 = mark[t][j];
	                    if(tmps < (t - i + 1)*min2)
	                        tmps = (t - i + 1)*min2;
	                    t++;
	                }
	                if(max < tmps)
	                    max = tmps;
	            }
	        return max;   
	    }
	  public static void main(String args[])
	  {
		  char[][]A={{'1','1'},{'0','0'}};
		  System.out.println(maximalRectangle(A));
	  }
}
