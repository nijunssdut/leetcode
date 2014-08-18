package leetcode94;

public class Solution {
	 public static int numTrees(int n) { 
         int rs = 1; 
         for (int i = 2; i <= n; i++) 
                rs = 2*(2*i-1)*rs/(i+1);
         return rs;
    }
	 public static void main(String args[])
	 {
		 System.out.println(numTrees(3));
	 }
}
