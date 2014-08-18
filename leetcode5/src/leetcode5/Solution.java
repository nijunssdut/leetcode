package leetcode5;

import java.util.Scanner;

//dong gui
public class Solution {
	/* public String longestPalindrome(String s) {
		char[] ss=new char[s.length()];
		boolean[] flag=new boolean[500];
	     for(int i=0;i<2*s.length();i++)
	     {
	    	 ss[i]=' ';
	    	 ss[i+1]=s.charAt(i);
	    	 i++;
	     }//make up a double number String
	     for(int j=1;j<s.length();j++)
	     {
	    	 for(int k=ss.length;k>s.length();k--)
	    	 {	 
	    		 if(ss[j]==ss[k])
	    		 {	 
	    			 break;
	    		 }
	    		 k--;
	    	 }
	    	 j++;
	    	 
	     }
	     
	    }*/
	 public String longestPalindrome(String s) {
		 int n = s.length();
	    int max = 0, start = 0, end = 0;
	    if (s == null || n == 0)
	    	return "";
	  boolean[][] c = new boolean[n][n];
	    for (int i = 0; i < n; i++) {
	    	for(int j=0;j<n;j++)
	    		c[i][j]=true;
	    }
	    //c[i][j] 记录从第i个到第j个是不是回文。
	    for (int j = 1; j < n; j++) {
	      for (int i = 0; i < j; i++) {
	        if (s.charAt(i) == s.charAt(j)&&c[i+1][j-1]){
	          c[i][j] = true;
	          if (j - i + 1 > max) {
	            max = j - i + 1;
	            start = i;
	            end = j;
	          }
	        }
	      else
	    	  c[i][j] = false;
	      }
	    }
	    return s.substring(start, end+1);
	  }
	 public static void main(String args[])
	 {
		 String r;
		 String rs;
		 Scanner sc=new Scanner(System.in);//Input
		 r=sc.nextLine();
		 rs=new Solution().longestPalindrome(r);
		 System.out.println(rs);
	 }
}
	
