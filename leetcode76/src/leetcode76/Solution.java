package leetcode76;

import java.util.ArrayList;

public class Solution {
	 public static ArrayList<ArrayList<Integer>> combine(int n, int k) {
		 ArrayList<ArrayList<Integer>> rs = new ArrayList<ArrayList<Integer>>();  
	        search(n, k, 0, 0, rs, new ArrayList<Integer>());  
	        return rs;  
		
	    }
	 public static void search(int n, int k, int last, int step, ArrayList<ArrayList<Integer>> rs, ArrayList<Integer> cur){
		 if (step == k) {  
	            rs.add(cur);  
	            return;  
	        }     
	        for (int i = last + 1; i <= n; i++) {  
	            ArrayList<Integer> temp = new ArrayList<Integer>(cur);  
	            temp.add(i);  
	            search(n, k, i, step + 1, rs, temp);  //the last changed according to stepµÝ¹é
	        }  
	 }
	 public static void main(String args[])
	 {
		 System.out.println(combine(4,2));
	 }

}
