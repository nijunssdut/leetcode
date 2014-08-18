package leetcode74;

public class Solution {
	 public static void sortColors(int[] A) {
		 int len=A.length;
		 int i = 0; // red
         int j = len - 1; // white
         int k = len - 1; // blue        
         while (i <= j)
        {
        	 if (A[i] == 2)
		          {
	                 int temp = A[k];
	                 A[k] = A[i];
	                 A[i] = temp;
	                 k--;
	                 if (k < j)
	                	 j = k;
	             }//the last
             else if (A[i] == 1)
             {
                 int temp = A[j];
                 A[j] = A[i];
                 A[i] = temp;
                 j--;
             }
             else
                 i++;
         }
     }
	 public static void main(String args[])
	 {
		 int []A=new int[5];
		 sortColors(A);
		 System.out.println();
	 }
 }
	

