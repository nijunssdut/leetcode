package leetcode53;

import java.util.Scanner;

//Each element in the array represents your maximum jump length at that position
public class Solution {
	 public static boolean canJump(int[] A) {
	     int len=A.length;
	     if(len==0)
	    	 return false;
	     if(len==1)
	    	 return true;
	     int temp=A[0];//go ahead 
	     for(int i=0;i<len;i++)
	     {
	    	 if(temp>0)
	    	 {
	    		 temp--;
	    		 temp=temp>A[i]?temp:A[i];
	    	 }
	    	 else
	    		 return false;
	     }
	     return true;
	     
	    }
	 public static void main(String args[])
	 {
		 int A[]=new int[5];
		 Scanner sc=new Scanner(System.in);
		 for(int i=0;i<5;i++)
		 {
			 A[i]=sc.nextInt();
		 }
		 System.out.println(canJump(A));
	 }

}
