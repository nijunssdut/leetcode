package leetcode75;

public class Solution {
	public static String minWindow(String S, String T) {
		        int sLen=S.length();  
		        int tLen=T.length();  
		        if(tLen==0 || sLen<tLen) 
		        	return "";  
		        int []needFind=new int[256];//reflect the ASCII  
		        int []hasFind=new int[256];  
		        int minWindowLength=Integer.MAX_VALUE;  
		        int minBegin=0;  
				int minEnd=sLen-1;  
		        int begin=0;  
		        int end=0;  
		        for(int i=0;i<tLen;i++)  
		        {  
		            needFind[T.charAt(i)-'0']++;  //sign it
		        }  
		          
		     
		        for(int count=0;end<sLen;end++)  
		        {  
		            //skip those not in T  
		            if(needFind[S.charAt(end)-'0']==0) 
		            	continue;  
		            hasFind[S.charAt(end)-'0']++;  
		             
		            if(hasFind[S.charAt(end)-'0'] <= needFind[S.charAt(end)-'0'])  
		                count++;  
		                  
		            //a window exists from begin to end  
		            if(count==tLen)  
		            {  
		                //move begin pointer to find the minimum window  
		                while(begin<end)  
		                {  
		                    if(needFind[S.charAt(begin)-'0']==0)   
		                    {  
		                        begin++;  
		                        continue;  
		                    }  
		                    if(hasFind[S.charAt(begin)-'0'] > needFind[S.charAt(begin)-'0'])  
		                    {  
		                        hasFind[S.charAt(begin)-'0']--;  
		                        begin++;  
		                        continue;  
		                    }//find one  
		                    else  
		                        break;  
		                }  
		                  
		                int tmpWindowLength=end-begin+1;  
		                  
		                if(tmpWindowLength < minWindowLength)  
		                {  
		                    minBegin=begin;  
		                    minEnd=end;  
		                    minWindowLength=tmpWindowLength;  
		                }  
		            }  
		        }  
		          
		        if(minWindowLength==Integer.MAX_VALUE)  
		            return "";  
		        return S.substring(minBegin,minEnd+1);  
		    } 
	public static void main(String args[])
	{
		System.out.println(minWindow("ADOBECODEBANC","ABC"));
	}
	}

