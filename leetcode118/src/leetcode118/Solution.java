package leetcode118;

import java.util.ArrayList;

public class Solution {
	   public static ArrayList<Integer> getRow(int rowIndex){
		   ArrayList<Integer> rs=new ArrayList<Integer>();
		   if(rowIndex<0)
			   return null;
		   rs.add(1);
		 if(rowIndex==0)
			 return rs;
		 int i=0;
		 while(i<rowIndex)//row
		  {
		   int len = rs.size();
		   for(int j = len-1;j>0;--j){
		    rs.set(j, rs.get(j-1)+rs.get(j));//make use of the before row  
		   
		   }
		           rs.add(1);
		   ++i;
		  }
		  return rs;
	    }
	   public static void main(String args[])
	   {
		   System.out.println(getRow(1));
	   }
}
