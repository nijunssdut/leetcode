package leetcode19;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
	 public static boolean isValid(String s){
		 int len = s.length();
		 boolean flag=false;
		 Stack<Character> stack = new Stack<Character>();   
		 for(int i = 0; i < len; i++)  
		 { 
			char m=s.charAt(i);
			
			 if(m=='(' ||m =='[' ||m =='{')  
	                stack.push(m);   
			else if(m==')' ||m ==']' ||m =='}'){
			if(stack.size()==0){
				return false;
			}//first must the left
			 char n=stack.pop();
			 if(n=='(' && m==')'){  
                 continue;  
             }else if(n=='[' && m==']'){  
                 continue;  
             }else if(n=='{' && m=='}'){  
                 continue;  
             }  //pop stack in order
             return false;   
			}
		}
		 if(stack.size()==0)
			 flag=true;
		   return flag;  
}  
	 public static void main(String args[])
	 {
		 String input;
		 Scanner sc=new Scanner(System.in);
		 input=sc.nextLine();
		 System.out.println(isValid(input));
	 }
}
