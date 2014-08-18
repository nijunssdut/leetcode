package leetcode11;

import java.util.Scanner;

public class Solution {
public static  String intToRoman(int num) {
     String []Roman= {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
     int []integer={1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 }; 
     StringBuilder rs = new StringBuilder(); 
     for(int i=0;i<integer.length;i++)
     {
    	 while(num>=integer[i])
    	 {
    		 num-=integer[i];
    		 rs.append(Roman[i]);
    	 }
     }
     return rs.toString();
    }
public static void main(String args[])
{
	int input;
	String result;
	Scanner sc=new Scanner(System.in);
	input=sc.nextInt();
	result=intToRoman(input);
	System.out.println(result);
	
}

}
