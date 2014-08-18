package leetcode83;

public class Solution {
/*	 public static int largestRectangleArea(int[] height) {
		  if (height == null || height.length <= 0)
			  return 0;  
		    int res = 0;  
		    int temp;
		    for (int i = 0; i < height.length; i++) {  
		        int min = height[i];  
		        for (int j = i; j < height.length; j++) {  
		            if (height[j] < min) {  
		                min = height[j];  
		            }  
		             temp = min * (j - i + 1);  
		            if (temp > res) {  
		                res = temp;  
		            }  
		        }  
		    }  
		    return res;  
	    }*/
	 public static int largestRectangleArea(int[] height) {
	  int []lefts = new int[height.length+1];
      int []rights = new int[height.length+1];
      for(int i = 0; i < height.length;i++)
      {
          lefts[i] = i;
          while(lefts[i]-1 >= 0 && height[i] <= height[lefts[i]-1])
          {
              lefts[i] = lefts[lefts[i]-1];
          }
      }
      for(int i = height.length - 1;i >= 0;i--)
      {
          rights[i] = i;
          while(rights[i]+1 <= height.length-1 && height[i] <= height[rights[i]+1])
          {
              rights[i] = rights[rights[i] + 1];
          }
      }
      int res = -1;
      for(int i = 0; i < height.length;i++)
      {
          if(height[i] * (rights[i] - lefts[i] + 1) > res)
          {
              res = height[i] * (rights[i] - lefts[i] + 1);
          }
      }
      return res;
  }
	 public static void main(String args[])
	 {
		 int []high={2,1,5,6,2,3};
		 System.out.println(largestRectangleArea(high));
		 
	 }
}
