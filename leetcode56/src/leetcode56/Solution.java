package leetcode56;

public class Solution {
	 public static int lengthOfLastWord(String s) {
	     int len=s.length();
	     int counter=0;
	     if(len==0)
	    	 return counter;
	   
	    	 int i=count(s,len-1);
	    	 if(i<0)
	    		 return counter;
	    	 for(int j=i;j>=0;j--)
	    	 {
	    		 if(s.charAt(j)==' ')
	    			 return counter;
	    		 counter++;
	    	 }
	     
	     return counter;
	    }
	 public static int count(String s,int n)
	 {
		 while(n>=0&&s.charAt(n)==' ')
		 {	 
			
			 n--;
		 }
		 return n;

	 }//remove the last " "
	 public static void main(String args[])
	 {
		 String s = "a ";
		 System.out.println(lengthOfLastWord(s));
	 }
}
