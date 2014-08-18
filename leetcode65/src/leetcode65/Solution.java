package leetcode65;

import java.util.Scanner;

/*
"0" => true
" 0.1 " => true
"abc" => false
"1 a" => false
"2e10" => true
*/
public class Solution {
	 public static boolean isNumber(String s) { 
		 s = s.trim();  //从当前 String 对象移除所有前导空白字符和尾部空白字符。
	     if(s==null||s.length()==0)
	    	 return false;
	     boolean hasE = false;  
	        boolean hasDot = false;  
	        boolean hasNumber = false;  
	          
	        for (int i = 0; i < s.length(); i++) {  
	            if (i == 0 && s.charAt(i) == 'e') return false;  
	            if (s.charAt(i) == 'e') {  
	                // e cannot be replicated nor placed before number  
	                if (hasE == true || hasNumber == false) {  
	                    return false;  
	                } else {  
	                    hasE = true;  
	                }  
	            }      
	            if (s.charAt(i) == '.') {  
	                // '.' cannot be replicated nor placed after 'e'  
	                if (hasDot == true || hasE == true) {  
	                    return false;  
	                } else {  
	                    hasDot = true;  
	                }  
	            }  
	            // the sign can be placed at the beginning or after 'e'  
	            if (i != 0 && s.charAt(i - 1) != 'e' && (s.charAt(i) == '+' || s.charAt(i) == '-'))
	            	return false;  
	            if ((s.charAt(i) > '9' || s.charAt(i) < '0') && s.charAt(i) != '+' && s.charAt(i) != '-' && s.charAt(i) != '.' && s.charAt(i) != 'e')  
	            return false;    
	              
	            // check whether numbers are included.  
	            if (s.charAt(i) <= '9' && s.charAt(i) >= '0') {  
	                hasNumber = true;  
	            }  
	        }   
	        if (s.charAt(s.length() - 1) == '-' || s.charAt(s.length() - 1) == '+' || s.charAt(s.length() - 1) == 'e')
	        	return false;  
	  
	        return hasNumber;  
	    }  
	/*     int len=s.length();
	     boolean flag=false;
	     int temp=0;
	     int temp2=len-1;
	     int j;
	     int []m=new int[len];
	     for(j=0;j<len;j++)
	    	 m[j]=0; 
	     while(temp<len&&s.charAt(temp)==' ') 
	    	 temp++;
	     for(int i=0;i<len;i++)
	     {	 
	    	 if(s.charAt(i)>'9'||(int)s.charAt(i)<'0')
	    	 { 
	    		if(s.charAt(i)==' ')
	    		{
	    			while(temp2>=0 && s.charAt(temp2)==' ')
	    				temp2--;
	              if(temp<=temp2)
	            	  continue;
	    		}
	    	 	if(s.charAt(i)=='-'&&i==0)
	    	 		continue;
	    	 	if(s.charAt(i)=='.'&&i!=len-1)
	    	 	{
	    	 		if(flag==true)
	    	 			return false;
	    	 		flag=true;
	    	 		continue;
	    	 	}
	    	 	if((s.charAt(i)=='e'||s.charAt(i)=='E')&&i!=0&&i!=len-1)
	    	 		continue;
	    	 	return false;
	    	 }
	    	 else
	    	 {
	    		 m[i]=1;
	    		 continue;
	    	 }
	     }
	     for(j=0;j<len;j++)
	     { if(m[j]==0)
	    		 continue;
	     	else
	     		break;
	     } 
	     if(j==len)
	    	 return false;
	     return true;
	  		 
	    }*/
	 public static void main(String args[])
	 {
		 String s;
		 Scanner sc= new Scanner(System.in);
		 s=sc.nextLine();
		 System.out.println(isNumber(s));
		 
	 }
}

