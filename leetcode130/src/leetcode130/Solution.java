package leetcode130;

import java.util.ArrayList;

public class Solution {
    public static ArrayList<ArrayList<String>> partition(String s) {
    	ArrayList<ArrayList<String>> rs=new ArrayList<ArrayList<String>>();
    	ArrayList<String> temp=new ArrayList<String>();
    	check(rs,temp,s);
    	return rs;
    }
    public static void check(ArrayList<ArrayList<String>> rs,ArrayList<String> temp,String s){
    	if(s.length()==0)
    		rs.add(new ArrayList<String>(temp));
    	for(int i=1;i<=s.length();i++)
    	{
    		String tmp=s.substring(0, i);	
    		if(isPalindrome(tmp))
    		{
    			temp.add(tmp);
    			check(rs,temp,s.substring(i));
    			temp.remove(temp.size()-1);
    			
    		}
    	}
    }
    public static boolean isPalindrome(String s){  
        int i = 0;  
        int j = s.length()-1;  
        while(i<j){  
            if (s.charAt(i++) != s.charAt(j--))
            	return false;  
        }  
        return true;  
    }  
    public static void main(String args[])
    {
    	System.out.println( partition("aab"));
    }
}
