package leetcode10;

public class Solution {
	public static int maxArea(int[] height) {
		int res=0;
		int left=0;
		int right=height.length-1;
		int temp=0;
		while(left<right)
		{
			if(height[left]<height[right])
			{
				temp=height[left]*(right-left);
				left++;
			}
			else{
				temp=height[right]*(right-left);
				right--;
			}
			if(temp>res)
				res=temp;
		}
		return res;
		
    }
	 public static void main(String args[])
	 {
		 int []high={1,2,1};
		 System.out.println( maxArea(high));
		 
	 }
}
