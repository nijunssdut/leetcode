package leetcode6;

import java.util.Scanner;

public class Solution {
	 public String convert(String s, int nRows) {
		 int n;
		 int k;
		 int m;
		 String rs="";
		 n= s.length();
		 if(nRows==1)
			 return s;
		 k=n/(2*nRows-2);//k,the amount of zig
		 m=n%(2*nRows-2);//the rest
		 for(int w=0;w<nRows;w++)
		 {
			 for(int i=0;i<k;i++)
			 {
				 rs+=s.charAt((2*nRows-2)*i+w);
				 if(w>=1&&w<nRows-1&&nRows!=2)
					 rs+=s.charAt((2*nRows-2)*(i+1)-w);
				
			 
			 }
			 if(m>=w+1)
			 {
				 rs+=s.charAt((2*nRows-2)*k+w);
				 if(m>nRows&&m>=2*nRows-w-1&&w!=nRows-1)
				 {
					 rs+=s.charAt((2*nRows-2)*(k+1)-w);
				 }
			 }
		 }
		 return rs;
	    }
	 public static void main(String args[])
	 {
		 String r;
		 String result;
		 Scanner sc=new Scanner(System.in);//Input
		 r=sc.nextLine();
		 result=new Solution().convert(r, 4);
		 System.out.println(result);
	 }
}
