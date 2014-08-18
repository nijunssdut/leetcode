package leetcode40;

import java.util.Scanner;

//¶þ·Ö·¨
public class Solution {
	  public static int trap(int[] A) {
	     int n=A.length;
	     int mid=0;
	     int high=0;
	     int rs=0;
	     if(A.length<=0)
	    	 return rs;
	     for(int i=0;i<n;i++)
	     {
	    	 if(A[i]>A[mid])
	    		 mid=i;//find the highest as half position
	     }
	     for(int j=0;j<mid;j++)
	     {
	    	 if(high>A[j])
	    		 rs=rs+high-A[j];
	    	 else
	    		 high=A[j];
	     }//the left of mid
	     high=0;
	     for(int k=n-1;k>mid;k--)
	     {
	    	 if(high>A[k])
	    		 rs=rs+high-A[k];
	    	 else
	    		 high=A[k];
	     }//the right of mid
	     return rs;
	    }
	  public static void main(String args[])
	  {
		  int []A=new int[12];
		  Scanner sc=new Scanner(System.in);
		  for(int i=0;i<12;i++)
		  {
			  A[i]=sc.nextInt();
		  }
		  System.out.println(trap(A));
	  }

}
