package leetcode51;

import java.util.Scanner;
public class Solution {
public static int maxSubArray(int[] A) {
	int n=A.length;
	 if (n <= 0) return 0;  
	    int sum = 0;  
	    int maxsum =A[0];  
	    for (int i = 0; i < n; i++)  
	    {  
	        sum += A[i];  
	        if (sum > maxsum)
	        	maxsum = sum;  
	        if (sum < 0)
	        	sum = 0;  
	    }  
	    return maxsum;    
}
public static void main(String args[])
{
	int []A=new int[9];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<9;i++)
	{
		A[i]=sc.nextInt();
	}
	System.out.println(maxSubArray(A));
}

}
