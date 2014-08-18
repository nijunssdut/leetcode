package leetcode26;

public class Solution {
	  public static String strStr(String haystack, String needle) {
		  String rs =null;
	     if(haystack.length()<needle.length()||haystack==null)
	    	 return null;
	     if(needle.length()==0)
	    	 return haystack;
	     boolean flag=true;
	     int i;
	     for(i=0;i<=haystack.length()-needle.length();i++)
	     {
	    	 flag=true;
	    	for(int j=0;j<needle.length();j++)
	    	{
	    		if(haystack.charAt(i+j)!=needle.charAt(j))
	    		{	
	    			flag=false;
	    			break;
	    		}
	    		
	    	}
	    	if(flag)
	    	{	rs=haystack.substring(i);
	    		return rs;
	    	}
	     }
	 
	  return rs;
	}
	  public static void main(String args[])
	  {
			  System.out.println(strStr("abcd","cd"));
	  }
}