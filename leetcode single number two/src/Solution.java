import java.util.Scanner;

//three up to high
public class Solution {
	 public int singleNumber(int[] A) {
	        int one=0;
	        int two=0;
	        int three=0;
	        for(int i=0; i<A.length; i++){  
	            two |= one&A[i];  
	            one^=A[i];    
	            three=one&two;  //clear zero 
	            one&= ~three;  //counter 1
	            two&= ~three; //counter2 
	        }  
	        return one;  
	    }
	 public static void main(String args[])
	 {
		 int []input=new int[5];
		 int rs;
		 Scanner sc=new Scanner(System.in);
	     for(int i=0;i<5;i++)
			input[i]=sc.nextInt();
	     rs=new Solution().singleNumber(input);
	     System.out.println(rs);
		 
	 }
}
