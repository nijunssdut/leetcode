package leetcode58;
/*第一位每个数字开头的序列都有（n-1）！个序列，因此n个数字所以共有n！个序列。
以此类推，第二位每一个数开头都有（n-2）！个序列。
因为数字不能重复，用sign记录数字是否使用过，data存阶层的值。
每次循环找到没使用过的数中第k/data[i]个数就是当前位的数字。*/
public class Solution {
	public static String getPermutation(int n, int k) {
		  int i,j; 
		  String s="";
		  int data[]=new int[10];
		  int sign[]=new int[10];//whether repeated or not;  
	      data[0]=1;  
	      for( i=1;i<=n;++i)
	    	  data[i]=data[i-1]*i;  
	      	for(int m=0;m<10;m++)
	    	  sign[m]=0;   
	        i-=2;  
	        --k;  
	        while(i>=0)  
	        {  
	            int temp=k/data[i];  
	            for(j=1;j<10;++j)  
	            {  
	                if(sign[j]==0)temp--;  
	                if(temp<0)
	                	break;  
	            }  
	            sign[j]=1;  
	            s+=(char)(j+'0');  
	            k%=data[i];  
	            i--;  
	        }  
	        return s;  
	    }  
	public static void main(String args[])
	{
		System.out.println(getPermutation(3,1));
	}
}


