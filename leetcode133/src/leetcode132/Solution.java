package leetcode132;

public class Solution {
	 public static int canCompleteCircuit(int[] gas, int[] cost) {
	     int len1=gas.length;
	     for(int j=0;j<len1;j++)  
	        {  
	            int tank = 0;  
	            boolean work = true;  
	            int i=j;  
	            do  
	            {  
	                tank+=gas[i];  
	                tank-=cost[i];  
	                if(tank < 0)  
	                {  
	                    work = false;  
	                    break;  
	                }  
	                i=(i+1)%len1;  
	            }while(i!=j);  
	            if(work)  
	            {  
	                return j;  
	            }  
	        }  
	        return -1;  
	    }  
	 public static void main(String args[]){
		 int []A={1,3,4};
		 int []B={1,2,5};
		 System.out.println( canCompleteCircuit(A,B));
	 }
}
