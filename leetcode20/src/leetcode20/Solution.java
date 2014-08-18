package leetcode20;
/*
 n=1    ()
 n=2    (f(1)),f(1)+f(1)
 n=3    (f(2)),f(1)+f(2),f(2)+f(1)
 */
import java.util.ArrayList;
import java.util.Scanner;
//递归思想
public class Solution {
	 public static ArrayList<String> generateParenthesis(int n) {
		   ArrayList<String> rs = new ArrayList<String>();  
	        generate(rs, "", 0, 0, n);  
	        return rs;  
	    }
	 public static void generate(ArrayList<String> res, String temp, int left, int right, int n)
	 {
		 if(left == n)  
	        {  
	            for(int i = 0; i < n - right; i++)  
	            {  
	                temp += ")";  
	            }  
	            res.add(temp);  
	            return ;  
	        }  //n组则结束
	        generate(res, temp + "(", left + 1, right, n);  
	        if(left > right)  
	            generate(res, temp + ")", left, right + 1, n);  
	 }
	 public static void main(String args[])
	 {
		 int input;
		 Scanner sc=new Scanner(System.in);
		 input=sc.nextInt();
		 System.out.println(generateParenthesis(input));
	 }

}
