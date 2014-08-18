package leetcode41;

import java.util.Scanner;

public class Solution {
	  public static String multiply(String num1, String num2) {
		  if(num1.equals("0") || num2.equals("0"))//"=="not true,I do not know
			  return "0";  
		  int n1=num1.length();
		  int n2=num2.length();
		  int counter=0;
		  int []l1 = new int[n1];  
	      int []l2 = new int[n2];  
	      int[] res = new int[n1+n2]; 
	      for(int i=0;i<n1+n2;i++)
	      {
	    	  res[i]=0;
	      }
		  	String rs="";
		  for(int i=0; i<n1; ++i)  
	       l1[i] = num1.charAt(i) - '0';  
	      for(int i=0; i<n2; ++i)  
	            l2[i] = num2.charAt(i) - '0';  
	          
	        for(int i=0; i<n1; ++i)  
	            for (int j=0; j<n2; ++j)  
	             res[i+j+1] += l1[i]*l2[j];  
	 
	        for (int k=n1+n2-1; k>=0; --k)
	        {  
	            if(k>0) 
	            	res[k-1] += res[k]/10;    	
	            res[k] %= 10;
	            rs= (char)(res[k]+'0')+rs;  
	        }  
	        for(int k=0;k<n1+n2-1;k++)
	        {	if(rs.charAt(k)=='0')
	        		counter++;
	        	else
	        		break;
	        }//remove zero
	        return rs.substring(counter);
	    }
	  public static void main(String args[])
	  {
		  String nu1;
		  String nu2;
		  Scanner s1=new Scanner(System.in);
		  nu1=s1.nextLine();
		  Scanner s2=new Scanner(System.in);
		  nu2=s2.nextLine();
		  System.out.println(multiply(nu1,nu2));
	  }
}
