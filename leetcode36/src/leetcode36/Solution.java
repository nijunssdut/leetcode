package leetcode36;

import java.util.Scanner;

public class Solution {
    public static String countAndSay(int n) {
        if(n<=0)
        	return null;
        String say="1";
        for(int i=1;i<n;i++)
        {
        	say=pass(say);
        }
        return say;
    }
    public static String pass(String say)
    {
    	 int count=1;
    	 StringBuffer sb = new StringBuffer(); 
    	  for (int i = 1; i < say.length(); i++) {  
              if (say.charAt(i) != say.charAt(i - 1)) {  
                  sb.append(count);  
                  sb.append(say.charAt(i - 1));  
                  count = 1;  
              } else {  
                  count++;  
              }  
          }  
          sb.append(count);  
          sb.append(say.charAt(say.length() - 1));  
          return sb.toString();  
    	 
    }
    public static void main(String args[])
    {
    	int k;
    	Scanner sc=new Scanner(System.in);
    	k=sc.nextInt();
    	System.out.println(countAndSay(k));
    	
    }
}