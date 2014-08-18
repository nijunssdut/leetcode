package leetcode45;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {   
	  public static ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {  
	        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();  
	        ArrayList<Integer> list = new ArrayList<Integer>();  
	        Arrays.sort(num);
	        boolean[] flag = new boolean[num.length]; 
	        rec(num,0,ret, list,flag); 
	        return ret;  
	    }  
	       
		 public static void rec(int[] num,int index, ArrayList<ArrayList<Integer>> ret, ArrayList<Integer> list,boolean[]flag){
		        int n=num.length;
		        if(index ==n ){  
		            ret.add(new ArrayList<Integer>(list));       
		            return;  
		        }             
		        for(int i=0; i<n; i++){  
		 
		           if(flag[i]||(i>0&&!flag[i-1]&&num[i]==num[i-1]))
		        	   continue;
		           	list.add(num[i]); 
		           	flag[i]=true;
		            rec(num,index+1,ret,list,flag);  
		            list.remove(list.size()-1);
		            flag[i]=false;
		           
		        }  
		    }  
	 public static void main(String[] args) {  
	        int[] S = {-1,2,-1};  
	        System.out.println( permuteUnique(S));  
	    }  
}
	

