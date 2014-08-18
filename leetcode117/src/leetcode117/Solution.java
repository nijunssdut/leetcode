package leetcode117;

import java.util.ArrayList;

public class Solution {
	 public static ArrayList<ArrayList<Integer>> generate(int numRows) {
		 ArrayList<ArrayList<Integer>> rs=new ArrayList<ArrayList<Integer>>();
		 if(numRows<1)
	            return rs;
	        for(int deep=1;deep<=numRows;deep++)
	        {
	            ArrayList<Integer> item=set(rs,deep,numRows);
	            rs.add(item);
	        }
	        return rs;
	    }
	 public static  ArrayList<Integer>set(ArrayList<ArrayList<Integer>> rs,int deep,int numRows){
		 ArrayList<Integer> temp=new ArrayList<Integer>();
		 if(deep==1)
			 temp.add(1);
		 else
		 {
			 temp.add(1);
			 for(int i=1;i<deep-1;i++)
			 {
				 temp.add(rs.get(deep-2).get(i-1)+rs.get(deep-2).get(i));//Ñî»ÔÈý½ÇÖÐ¼ä
			 }
			 temp.add(1);
		 }
		return temp;	 
	 }
	public static void main(String args[])
	{
		System.out.println( generate(5));
	}
}
