package leetcode79;

import java.util.Scanner;

public class Solution {
	  public int removeDuplicates(int[] A) {
		  int n=A.length;
		  int start=1;
		  if(n==0)return 0;  
	      if(n==1)return 1;  
		  int temp=A[1];
		     if(n==0)
		    	 return 0;
		     for(int i=2;i<n;i++)
		     {
		    	 if(A[i]!=A[i-2])  
		            {  
		                A[start++]=temp;  
		                temp=A[i];  
		            }  
		     }
		     A[start++]=temp;  
		     return start;
		 
	    }
	  public static void main(String args[])
		 {
			 int  s[]=new int[6];
			 int result;
			 Scanner sc=new Scanner(System.in);
			 for(int i=0;i<6;i++)
				 s[i]=sc.nextInt();
			 result=new Solution().removeDuplicates(s);
			 System.out.println(result);
		 }
}
