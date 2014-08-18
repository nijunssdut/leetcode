package leetcode64;

public class Solution {
	 public static String addBinary(String a, String b) {
		 int flag = 0;         
		          int aIndex = a.length() - 1;
		          int bIndex = b.length() - 1;
		      
		         String rs="";
		         
		         while(aIndex >= 0 && bIndex >= 0)
		        {
		             int num = a.charAt(aIndex) - '0' + (b.charAt(bIndex) - '0') + flag;//change interval
		             flag = num / 2;//the next
		             num %= 2;
		             
		             rs = (char)(num + '0') + rs;
		             
		             aIndex--;
		             bIndex--;
		         }
		         
		         while(aIndex >= 0)
		         {
		             int num = a.charAt(aIndex) - '0' + flag;
		             flag = num / 2;
		             num %= 2;
		             
		             rs= (char)(num + '0') + rs;
		             
		             aIndex--;
		         }
		         
		         while(bIndex >= 0)
		         {
		             int num = b.charAt(bIndex) - '0' + flag;
		             flag = num / 2;
		             num %= 2;		             
		             rs = (char)(num + '0') + rs;
		             
		             bIndex--;
		         }
		         
		         if (flag > 0)
		             rs = (char)(flag + '0') + rs;
		             
		         return rs;   
	    }
	 public static void main(String args[])
	 {
		 String a="11";
		 String b="1";
		 System.out.println(addBinary(a,b));
	 }
}
