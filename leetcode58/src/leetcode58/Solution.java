package leetcode58;
/*��һλÿ�����ֿ�ͷ�����ж��У�n-1���������У����n���������Թ���n�������С�
�Դ����ƣ��ڶ�λÿһ������ͷ���У�n-2���������С�
��Ϊ���ֲ����ظ�����sign��¼�����Ƿ�ʹ�ù���data��ײ��ֵ��
ÿ��ѭ���ҵ�ûʹ�ù������е�k/data[i]�������ǵ�ǰλ�����֡�*/
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


