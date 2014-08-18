package leetcode48;

public class Solution {
	public static double pow2(double x,int n)
	{	if(x==0)
			return x;
	 	if(n==0)
	 		return 1.0;
		 double temp=pow2(x,n/2);//¶þ·Ö
		 if(n%2==0)
			 return temp*temp;
		 else
			 return x*temp*temp;
				 
	}
	 public static double pow(double x, int n) { 
			
	        if(n<0)
	        	return 1.0/pow2(x,-n);
	        return pow2(x,n);
	    }
	 public static void main(String args[])
	 {
		System.out.println(pow(0,0)); 
	 }
}
