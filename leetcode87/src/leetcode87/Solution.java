package leetcode87;

public class Solution {
	 public static void merge(int A[], int m, int B[], int n) {
	        int i=m-1;
	        int j=n-1;
	        int k=m+n-1;
	        while(i>=0&&j>=0)
	        {
	        	if(A[i]>B[j])
	        	{
	        		A[k--]=A[i--];
	        	}
	        	else
	        	{
	        		A[k--]=B[j--];
	        	}
	        }
	        while(i>=0)
	        {
	        	A[k--]=A[i--];
	        }
	        while(j>=0)
	        {
	        	A[k--]=B[j--];
	        }
	    }
	 public static void  main(String args[])
	 {
		 int []A=new int[7];
		 for(int i=0;i<3;i++)
			 A[i]=2*i+1;
		 int []B={2,4,6,10};
		 merge(A,3,B,4);
		 System.out.println();
	 }
}
