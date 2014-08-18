package leetcode70;

import java.util.Stack;

/*Did you consider the case where path = "/../"?
In this case, you should return "/".
Another corner case is the path might contain multiple slashes '/' together, such as "/home//foo/".
In this case, you should ignore redundant slashes and return "/home/foo".
*/
public class Solution {
	 public static String simplifyPath(String path) {
		  	Stack<String> s =new Stack<String>();
		           String str="";
		           int i;
		           int j=0;
		          if(path.charAt(path.length()-1) != '/')
		               path+="/";
		           for(i = j+1; i <path.length(); i++)
		           {
		             if (path.charAt(i) == '/')
		              {
		            		 str = path.substring(j+1,i);
		                  if (str.equals(".."))
		                  {
		                      if (!s.empty())
		                          s.pop();
		                  }
		                 else if (str.length()!= 0&&!str.equals(".") )
		                  {
		                      s.push(str);
		                  }    
		                j=i;
		                str="";
		                
		              }/*
		             else
		              {
		                  str += path.charAt(i);
		              }*/
		            
		          }
		          
		           String rs = "";
		           for(int k = 0;k<s.size() ;k++)
		               rs += "/"+s.elementAt(k);
		           if(s.empty())
		               return "/";
		           else
		               return rs;
		       }
		      
	    
	public static void main(String args[] )
	{
		System.out.println(simplifyPath("/a/./b/../../c/"));
	}
		
}
///home/