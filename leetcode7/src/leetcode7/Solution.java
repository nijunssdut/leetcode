package leetcode7;

import java.util.Scanner;

public class Solution {
	 public static int reverse(int x) {
		 int flag;
		 int rs=0;
		 int y;
		 if(x>0)
			 flag=1;
		 else 
			 flag=-1;//decide its symbol;
		 y=Math.abs(x);
		 String s=y+"";
		 for(int i=0;i<s.length();i++)//����while()����˵y������boolean�ͣ����Բ������·�����Щ�鷳
		 {
			 rs=rs*10+y%10;
			 y/=10;
			 
		 }
		 return flag*rs;
	 }
	 public static void main(String args[])
	 {
		 int number;
		 int result;
		 number = new Scanner(System.in).nextInt();//input
		 result=reverse(number);
		 System.out.println(result);
	 }
}
