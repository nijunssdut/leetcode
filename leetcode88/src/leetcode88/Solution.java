package leetcode88;

import java.util.ArrayList;
/*��������->�����루���룩�������ұ�һλ�����ν�ÿһλ�����һλ���XOR������Ϊ��Ӧ�������λ��ֵ�������һλ���䣨�൱�������0����
������->�������루���룩������ߵڶ�λ�𣬽�ÿλ�����һλ������ֵ�����Ϊ��λ������ֵ�������һλ��Ȼ���䣩��*/
public class Solution {
	 public static ArrayList<Integer> grayCode(int n) {
		  	ArrayList<Integer> res=new ArrayList<Integer>();  
	        int nSize = 1 << n;  
	        for (int i = 0; i < nSize; ++i)  
	        {  
	            res.add((i>>1)^i);  
	        }  
	        return res;  
	    }
	 public static void main(String args[])
	 {
		 System.out.println(grayCode(2));
	 }
}
