import java.util.Scanner;


public class Solution {
	 public int singleNumber(int[] A) {
	        int rs = 0;
	        int n=A.length;
	        for (int i=0;i<n;i++) {
	            rs ^= A[i];
	        }
	        return rs;
	    }
	 public static void main(String[] args) {
	     int  s[]=new int[5];
	     int result;
	     Scanner sc=new Scanner(System.in);
	     for(int i=0;i<5;i++)
			s[i]=sc.nextInt();
	     result=new Solution().singleNumber(s);
		 System.out.println(result);
	    }

}
