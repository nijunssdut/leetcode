package leetcode89;

public class Solution {
	public static int numDecodings(String s) {
		int len=s.length();
		int temp1=0;
		int temp2=1;
		int rs=0;
		if(len==0)
			return 0;
		if(s.charAt(len-1)!='0')  
            temp1 = 1;
		if(len==1)
			return temp1;
		 for(int i = 2; i <=len; i++)  
	        {  
	          //  int tmp =s.charAt(len-i)+s.charAt(len-i+1);  
	            rs = 0;  
	            if(s.charAt(len-i)!='0')  
	                rs += temp1;  
	            if(s.charAt(len-i)=='1' || s.charAt(len-i)=='2' && s.charAt(len-i+1) <= '6')  
	                rs += temp2;  
	            temp2= temp1;  
	            temp1= rs;  
	        }   
       // rs=base(s,0,len-1);
        return rs;
    }
/*	public static int base(String s,int a,int b)
	{
		for(int i=a;i<=b;i++)
		{	if(s.charAt(i)=='0')
				return 0;
			else if( s.charAt(i)=='2' && i + 1 <= b && s.charAt(i+1) <= '6' )
				return base(s,i+1,b)+base(s,i+2,b);
			else if( s.charAt(i)=='1' && i + 1 <= b )  
				return base(s,i+1,b)+base(s,i+2,b);
			
		}//将前n位不断看做整体去递归
		return 1;
	}*/
	public static void main(String args[])
	{
		System.out.println(numDecodings("012"));
	}
}
