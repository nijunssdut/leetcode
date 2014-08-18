package leetcode1;
import java.util.Arrays;  
public class Solution { 
	  public int[] twoSum(int[] numbers, int target) {
		  int index1=0,index2=0;
	        int n=numbers.length;
	        int start=0;
	        int  end=n-1;
	        int[] tempArray = Arrays.copyOf(numbers, n);  
	        Arrays.sort(tempArray);  
	        int temp = tempArray[start]+tempArray[end];  
	        while(temp!=target) {  
	            if(temp > target) {  
	                end--;  
	            }  
	            else {  
	                start++;  
	            }  
	            temp = tempArray[start]+tempArray[end];  
	        }  
	        for(int i = 0;i<n;i++) {  
	            if(numbers[i]==tempArray[start] || numbers[i]==tempArray[end]) {  
	                if(index1 == 0) {  
	                    index1 = i+1;  
	                }  
	                else if(index2 == 0){  
	                    index2 = i+1;  
	                    break;  
	                }  
	            }  
	        }  
	        if(index2<index1){  
	            int tem = index2;  
	            index2 = index1;  
	            index1 = tem;  
	        }  
	        return new int[]{index1,index2};
	    }
	public static void main(String[] args) {
		
		 int[] numbers = {2,7,11,15};  
	        int target = 9;  
	        int []result=new Solution().twoSum(numbers,target);
	        System.out.println("index1="+result[0]+",index2="+result[1]);
	}

}//先拷出一数组，排序后，头尾加和，找到对应元素，在找到在原数组内的位置即可。
