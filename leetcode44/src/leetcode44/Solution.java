package leetcode44;

import java.util.ArrayList;

public class Solution {   
		  public static ArrayList<ArrayList<Integer>> permute(int[] S) {  
		        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();  
		        ArrayList<Integer> list = new ArrayList<Integer>();  
		        rec(S, ret, list);//递归  
		        return ret;  
		    }  
		       
		 public static void rec(int[] S, ArrayList<ArrayList<Integer>> ret, ArrayList<Integer> list){  
		        // 当数组长度为0时，添加入ret  
		        if(S.length == 0){  
		            ret.add(new ArrayList<Integer>(list));       
		            return;  
		        }             
		        // 遍历数组中的每一个数作为第一个元素  
		        for(int i=0; i<S.length; i++){  
		            // 构建一个新子数组来递归
		        	int[] sub = new int[S.length-1]; 
		            System.arraycopy(S, 0, sub, 0, i);  
		            System.arraycopy(S, i+1, sub, i, S.length-i-1);
		            	list.add(S[i]); 
		    
		            rec(sub, ret, list);  
		            list.remove(list.size()-1);
		            
		           
		        }  
		    }  
		 public static void main(String[] args) {  
		        int[] S = {1,2,3};  
		        System.out.println(permute(S));  
		    }  
}
	
