package leetcode88;

import java.util.ArrayList;
/*二进制码->格雷码（编码）：从最右边一位起，依次将每一位与左边一位异或（XOR），作为对应格雷码该位的值，最左边一位不变（相当于左边是0）；
格雷码->二进制码（解码）：从左边第二位起，将每位与左边一位解码后的值异或，作为该位解码后的值（最左边一位依然不变）。*/
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
