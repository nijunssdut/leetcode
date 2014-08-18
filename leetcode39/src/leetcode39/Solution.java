package leetcode39;

import java.util.Scanner;

public class Solution {
	public static int firstMissingPositive(int[] A) {  
        if (A == null || A.length == 0) return 1;  
          
        for (int i = 0; i < A.length; i++) {  
            while (A[i] != i + 1) {  
                //A[i] == A[A[i] - 1] handles the case where there are two identical values  
                if (A[i] <= 0 || A[i] >= A.length || A[i] == A[A[i] - 1])
                	break;  
                int temp = A[i];  
                A[i] = A[temp - 1];  
                A[temp -1]= temp;  //swap two values
            }  
        }  
          
        for (int i = 0; i < A.length; i++) {  
            if (A[i] != i + 1) {  
                return i+1;  
            }  
        }  
        return A.length + 1;          
    }  
	public static void main(String args[])
	{
		int []A=new int [4];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			A[i]=sc.nextInt();
		}
		System.out.println(firstMissingPositive(A));
	}
}
