package leetcode33;

import java.util.Scanner;

public class Solution {
	  public static int searchInsert(int[] A, int target) {
			if (A == null || A.length == 0) {
				return -1;
			}
		  int low = 0;
		  int high = A.length - 1;
			while (low <= high) {
				int mid = low + (high - low) / 2;
				if (A[mid] >= target) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}//¶þ·Ö·¨
			return low;
	    }
	  public static void main(String args[])
		{
			int []A=new int[4];
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<4;i++)
			{
				A[i]=sc.nextInt();
			}
			System.out.println(searchInsert(A,5));
		}
}
