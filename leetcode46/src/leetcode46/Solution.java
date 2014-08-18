package leetcode46;

public class Solution {
	public static void rotate(int[][] matrix) {
        int n=matrix.length;
        int k=0;
        int []temp=new int [n*n];
       // int l=(int)Math.sqrt(n);
        for(int i=0;i<n;i++)
        {	for(int j=0;j<n;j++)
        	{
        		temp[k]=matrix[i][j];
        		k++;
        	}
        }
        k=0;
        for(int j=n-1;j>=0;j--){
        	for(int i=0;i<n;i++)
        		{
        			matrix[i][j]=temp[k];
        			k++;
        		}
        	} 		
    }
	public static void main(String args[])
	{
		int[][]s=new int[2][2];
		int k=0;
		for(int i=0;i<2;i++)
		{	for(int j=0;j<2;j++)
			{	s[i][j]=k;
				k++;
			}
		}
		rotate(s);
		System.out.println(s);
	}
}
