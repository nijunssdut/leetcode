package leetcode25;

import java.util.Scanner;

public class Solution {
	 public static int removeElement(int[] A, int elem) {
	     int rs=0;
	     int n=A.length;
	     for(int i=0;i<n;i++)
	     {
	    	 if(A[i]!=elem)
	    	 {
	    		 A[rs++]=A[i];
	    	 }
	     }
	     return rs;
	    }
	 public static void main(String args[])
	 {
		 int []AA=new int[5];
		 Scanner sc=new Scanner(System.in);
		 for(int i=0;i<5;i++)
			 AA[i]=sc.nextInt();
		 System.out.println(removeElement(AA,3));
	 }
}
