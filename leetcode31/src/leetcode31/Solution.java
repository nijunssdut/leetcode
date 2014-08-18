package leetcode31;

import java.util.Scanner;

public class Solution {  
    public static int search(int[] A, int target) {
        if (A == null || A.length == 0) return -1;  
        int left = 0;  
        int right = A.length - 1;  
        while (left <= right) {  
            int mid = left + (right - left) / 2;  
            if (A[mid] == target) {  
                return mid;  
            }   
            if (A[left] <= A[mid]) {  
                if (A[left] <= target && target < A[mid]) {  
                    right = mid - 1;  
                } else {  
                    left = mid + 1;  
                }  
            } else {  
                if (A[mid] < target && target <= A[right]) {  
                    left = mid + 1;  
                } else {  
                    right = mid - 1;  
                }  
            }  
        }  
        return -1;  
}  
public static void main(String args[])
{
	int []AA=new int[5];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<5;i++)
	{
		AA[i]=sc.nextInt();
	}
	System.out.println(search(AA,1));
}
}
