package leetcode24;

import java.util.Scanner;

public class Solution {
	 public int removeDuplicates(int[] A) {
	     int n=A.length;
	     if(n==0)
	    	 return 0;
	     int start=0;
	     for(int i=1;i<n;i++)
	     {
	    	 if(A[start]!=A[i])
	    	 {
	    		
	    		 start++; 
	    		 A[start] = A[i];
	    	 }
	     }
	     return start+1;
	 }
	 public static void main(String args[])
	 {
		 int  s[]=new int[3];
		 int result;
		 Scanner sc=new Scanner(System.in);
		 for(int i=0;i<3;i++)
			 s[i]=sc.nextInt();
		 result=new Solution().removeDuplicates(s);
		 System.out.println(result);
	 }
}
