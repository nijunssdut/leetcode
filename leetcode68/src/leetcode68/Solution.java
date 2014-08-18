package leetcode68;

import java.util.Scanner;

public class Solution {
	  public static int sqrt(int x) {
		  if (x < 0)
			  return -1;  
		  int start=0;
		  int end=x;
		  int temp;
		  if(x==0||x==1)
			  return x;
		  while(start<end)
		  {
			  temp=start+(end-start)/2;
			  if((temp + 1) > x / (temp + 1) && (temp <= x / temp))
				  return temp;
			  else if(temp+1>x/(temp+1))
				  end=temp-1;
			  else
				  start=temp+1;
		  }
		  return -1;
		  
	    }
	  public static void main(String args[])
	  {
		  int input;
		  Scanner sc=new Scanner(System.in);
		  input=sc.nextInt();
		  System.out.println(sqrt(input));
	  }

}
