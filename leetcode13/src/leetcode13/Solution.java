package leetcode13;

import java.util.Scanner;

public class Solution {
	  public String longestCommonPrefix(String[] strs) {  
	        if (strs == null || strs.length == 0) return "";  
	        if (strs.length == 1) return strs[0];  
	          
	        int minLength = Integer.MAX_VALUE;  
	        int index = -1;  
	        for (int i = 0; i < strs.length; i++) {  
	            if (strs[i].length() <= minLength) {  
	                minLength = strs[i].length();  
	                index = i;  
	            }  
	        }  //found the minlength in strs[];
	        String shortestStr = strs[index];  
	        int[] all = new int[minLength];  
	          
	        for (int i = 0; i < strs.length; i++) {  
	            String eachStr = strs[i];  
	            for (int j = 0; j < minLength; j++) {  
	                if (eachStr.charAt(j) == shortestStr.charAt(j)) {  
	                    all[j]++;  
	                } else {  
	                    break;  
	                }  
	            }  
	        }  //the length of prefix
	          
	        String prefixStr = "";  
	        for (int j = 0; j < minLength; j++) {  
	            if (all[j] == strs.length) {  
	                prefixStr += shortestStr.charAt(j);  
	            } else {  
	                break;  
	            }  
	        }  
	        return prefixStr;  
	    }  
	  public static void main(String args[])
	  {
		  String[] s= new String[2];
		  String result;
		  Scanner sc=new Scanner(System.in);//Input
		  Scanner sc1=new Scanner(System.in);
		  s[0]=sc.nextLine();
		  s[1]=sc1.nextLine();
			result=new Solution().longestCommonPrefix(s);
			System.out.println(result);
	  }
//test
}
