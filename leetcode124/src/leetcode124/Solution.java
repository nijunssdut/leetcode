package leetcode124;

public class Solution {
	  public static boolean isPalindrome(String s) {
		  int left = 0;
	        int right = s.length()-1;
	        boolean flag = true;
	        while(left<right)
	        {
	            if(!num_check((s.charAt(left))))
	            {
	                left++;
	                continue;
	            }
	            if(s.charAt(left)>='a'&&s.charAt(left)<='z')
	             s=s.replace(s.charAt(left),(char) ('A'+s.charAt(left)-'a') );//change big
	            if(!num_check(s.charAt(right)))
	            {
	                right--;
	                continue;
	            }
	            if(s.charAt(right)>='a'&&s.charAt(right)<='z')
	             s=s.replace(s.charAt(right),(char) ('A'+s.charAt(right)-'a'));
	            if(s.charAt(left)!=s.charAt(right))
	            {
	                flag = false;
	                break;
	            }
	            left++;
	            right--;
	        }
	        return flag;
	    }
	  public static boolean num_check(char A)
	  {
		  if((A>='0'&&A<='9')||(A>='a'&&A<='z')||(A>='A'&&A<='Z'))
	            return true;
	        return false;
	  }
	  public static void main(String args[])
	  {
		  System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	  }
}
