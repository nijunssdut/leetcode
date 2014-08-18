package leetcode114;

public class Solution {
	 public static int numDistinct(String S, String T) {
	     if(S==null||T==null) {  
	            return 0;  
	        } 
	     int len1=S.length();
	     int len2=T.length();
	        if(len1<len2) {  
	            return 0;  
	        }  
	        int [][] rs = new int[len1+1][len2+1];  
	        rs[0][0] = 1;  
	        //任意一个字符串变换成一个空串都只有一种变换方法  
	        for(int i=0;i<len1;i++) {  
	            rs[i][0] = 1;      
	        }  
	        //递推公式  
	        for(int i=1;i<=len1;i++) {  
	            for(int j=1;j<=len2;j++) {  
	                //如果S和T的当前字符相等，那么有两种选法；否则S的当前字符不能要  
	                rs[i][j] = rs[i-1][j];  
	                if(S.charAt(i-1)==T.charAt(j-1)) {  
	                    rs[i][j] += rs[i-1][j-1];  
	                }  
	            }  
	        }  
	        return rs[len1][len2];  
	    }  
	    public static void main(String args[])
	    {
	    	System.out.println( numDistinct("rabbbit","rabbit"));
	    }
}
