package leetcode29;

import java.util.Arrays;

public class Solution {
	public void nextPermutation(int[] num)  
    {  
		int temp;
        if(num.length <= 1)  
            return ;  
        for(int i = num.length - 2; i >= 0; i--)  
        {  
            if(num[i] < num[i+1])  
            {  
                int j;  
                for(j = num.length - 1; j >= i; j--)  
                    if(num[i] < num[j])  
                        break;  
                // swap the two numbers.  
                temp=num[i];  
                num[i] = num[j];  
                num[j] = temp;  
                //sort the rest of arrays after the swap point.  
                Arrays.sort(num, i+1, num.length);  
                return ;  
            }  
        }  
        //reverse the arrays.  
        for(int i = 0; i < num.length / 2; i++)  
        {  
            int tmp = num[i];  
            num[i] = num[num.length - i - 1];  
            num[num.length - i - 1] = tmp;  
        }  
        return ;  
    }  
	public static void main(String args[])
	{
		System.out.println();
	}
}
