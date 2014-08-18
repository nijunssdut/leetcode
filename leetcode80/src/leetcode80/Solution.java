package leetcode80;

import java.util.Scanner;

public class Solution {
	 public static boolean search(int[] A, int target) {
	        int len=A.length;
	        if(len==0) 
	        	return false;
	        int left = 0; 
	        int right = len - 1;
	        while (left <= right) {  
	            int mid = left + (right - left) / 2;  
	            if (A[mid] == target) {  
	                return true;  
	            }   
	            else if(A[left] == A[mid])  
	            {  
	                for(int i = left; i< mid; i++)  
	                    if(A[i]==target)
	                    	return true;  
	                left = mid+1;  
	            }  
	            else if (A[left] <=A[mid]) {  
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
	        if(left==right && A[left]==target)  
	            return true;  
	        else  
	            return false;  
	 }
		public static void main(String args[])
		{
			int []AA=new int[2];
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<2;i++)
			{
				AA[i]=sc.nextInt();
			}
			System.out.println(search(AA,1));
		}
}
