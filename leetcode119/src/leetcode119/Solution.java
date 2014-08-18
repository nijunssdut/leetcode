package leetcode119;

import java.util.ArrayList;

public class Solution {
	  public static int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
	        int rs=0; 
	        if(triangle.size()==0)
	        	return rs;
	        ArrayList<Integer> temp=new ArrayList<Integer>();
	        for(int k=0;k<triangle.get(triangle.size()-1).size();k++)
	        	temp.add(0);
	        temp.set(0,triangle.get(0).get(0));
	        for(int i=1;i<=triangle.size()-1;i++){
	        	for(int j=triangle.get(i).size()-1;j>=0;j--)
	        	{
	            if (j == 0)
	            	temp.set(j,temp.get(j) + triangle.get(i).get(j));
	            else if (j == triangle.get(i).size() - 1)
	            	temp.set(j, temp.get(j-1) + triangle.get(i).get(j)) ;
	            else
	            	temp.set(j, Math.min(temp.get(j-1), temp.get(j)) + triangle.get(i).get(j));
	        	}
	        }
	        rs = Integer.MAX_VALUE;
	        for(int i = 0; i < temp.size(); i++)
                 rs = Math.min(rs, temp.get(i));
	        return rs;
	    }
	  public static void main(String args[])
	  {
		  ArrayList<ArrayList<Integer>> A=new ArrayList<ArrayList<Integer>>();
		  ArrayList<Integer> tmp=new ArrayList<Integer>();
		  ArrayList<Integer> tmp2=new ArrayList<Integer>();
		  ArrayList<Integer> tmp3=new ArrayList<Integer>();
		  tmp.add(-1);
		  A.add(0, tmp);
		  tmp2.add(2);
		  tmp2.add(3);
		  A.add(1, tmp2);
		  tmp3.add(1);
		  tmp3.add(-1);
		  tmp3.add(-3);
		  A.add(2,tmp3);
		  System.out.println(minimumTotal(A));
	  }
}
