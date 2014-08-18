package leetcode32;

import java.util.Scanner;

public class Solution {
	public static int[] searchRange(int[] A, int target) {
		int[] rs=new int[] { -1, -1 };
	if (A == null || A.length == 0) {
		return rs;
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
	int left = (low < A.length && A[low] == target) ? low : -1;
	if (left == -1) {
		return rs;
	}//fix the left
	low = 0;
	high = A.length - 1;
	while (low <= high) {
		int mid = low + (high - low) / 2;
		if (A[mid] <= target) {
			low = mid + 1;
		} else {
			high = mid - 1;
		}
	}
	rs=new int[] { left, high };
	return rs;
	}
	public static void main(String args[])
	{
		int []A=new int[6];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<6;i++)
		{
			A[i]=sc.nextInt();
		}
		System.out.println(searchRange(A,8));
	}
}
