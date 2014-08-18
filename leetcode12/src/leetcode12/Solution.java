package leetcode12;

import java.util.Scanner;

public class Solution {
	 public static int romanToInt(String s) {
		 int rs=0;
		 //int len;long
	     int temp=count(s,0);
	     int last;
	     int head=temp; 
	     for(int j=1;j<s.length();j++)
	     {
	    	 last=count(s,j);//add from head to end ;
	    	 if(last>head)
	    	 {
	    		 temp=last-head;//now the head is fixed
	    	 }
	    	 else if(head==last)
	    	 {
	    		temp+=head;
	    	 }
	    	 else if(head>last)
	    	 {	 rs+=temp;
	    		 temp=last;//the higher position should be changed to the next one; 
	    	 }
	    	 head=last;
	     }
	     rs+=temp;
	       
	       return rs; 
	    }
	
	public static int count(String s,int i){
		
			 char k=s.charAt(i);//get one char from head to end
			 switch(k)
			 {
	            case 'I':return 1;   
	            case 'V': return 5;  
	            case 'X': return 10;  
	            case 'L': return 50;  
	            case 'C': return 100;  
	            case 'D': return 500;  
	            case 'M': return 1000;  
	            default:  return 0;  
			 		
			 
			 }
	}
	 
	 public static void main(String args[])
	 {
		 int arr;
		 String s;
		 Scanner sc=new Scanner(System.in);//Input
		 s=sc.nextLine();
		 arr=romanToInt(s);
		 System.out.println(arr);
		
	 }

}
