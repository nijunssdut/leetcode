package leetcode92;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<String> restoreIpAddresses(String s) {
	   	ArrayList<String> rs=new ArrayList<String>();
		String temp=new String();
		  if (s.length()<4||s.length()>12) 
			  return rs;  
		check(rs,temp,s,0);
		return rs;
    }
	 public static void check(ArrayList<String> rs,String temp,String s,int start){
		 //three "."to divide
		 	if (start == 3 && satify(s)) {  
	             rs.add(temp + s);  
			              return;  
	         }  
	         for(int i=0; i<3 && i<s.length()-1; i++){  
             String substr = s.substring(0,i+1);  
             if (satify(substr))
            	 check( rs,temp + substr + '.',s.substring(i+1, s.length()), start+1) ;  
	       }  
	    }
	 public static boolean satify(String s)
	 {
		    if (s.charAt(0)=='0')
		    	return s.equals("0");
		    int sum = Integer.parseInt(s);
	        if (sum >= 0 && sum < 256){
	            return true;
	        }
		 return false;
		 
	 }
	 public static void main(String args[])
	 {
		 System.out.println(restoreIpAddresses("24558733"));
	 }
}
