package leetcode9;

import java.util.Scanner;

public class Solution {
	
	public boolean isPalindrome(int x) {
			if(x < 0)	
				return false;        
			int num=1;
			 while (x / 10 >= num)
			 {
			        num *= 10;
			  }
			while(x != 0)
			{  
				if(x / num != x % 10)     
					return false;//start and end are different,so not 
				x =x % num;           
				x =x/10;//remove the start and end; 
				num /= 100;
			}    
			return true;  
}        
	public static void main(String args[])
	{
		boolean result;
		int s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextInt();
		result=new Solution().isPalindrome(s);
		System.out.print(result);
	}
}
