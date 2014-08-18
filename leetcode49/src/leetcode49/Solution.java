package leetcode49;

import java.util.ArrayList;

public class Solution {
	  public ArrayList<String[]> solveNQueens(int n) {
		   ArrayList<String[]> ret = new ArrayList<String[]>();  
	        int[] queenList = new int[n];  
	        placeQueen(queenList, 0, n, ret);  
	        return ret;  
	    }
	  // �ݹ����8�ʺ󣬹ؼ���¼�µ�������һ����  
	    public static void placeQueen(int[] queenList, int row, int n, ArrayList<String[]> ret){  
	        // Base Case, �Ѿ����������  
	        if(row == n){  
	            StringBuilder[] sol = new StringBuilder[n];  
	               
	            // ��������ÿһ������Ҫnew�������  
	            for(int i=0; i<n; i++){  
	                sol[i] = new StringBuilder();  
	                for(int j=0; j<n; j++){  
	                    sol[i].append(".");  
	                }  
	            }  
	            // ����Ӧ�ĵط�����queen  
	            for(int i=0; i<n; i++){  
	                sol[i].setCharAt(queenList[i], 'Q');  
	            }  
	            String[] ss = new String[n];  
	            for (int i=0; i<n; i++) {  
	                ss[i] = sol[i].toString();  
	            }  
	            ret.add(ss);  
	            return;  
	        }  
	           
	        // ��ʼ��һ�еĲ���  
	        // ������row�е������У�������һ��λ���ǰ�ȫ��  
	        for(int col=0; col<n; col++){  
	            if(isSafe(queenList, row, col)){  
	                queenList[row] = col;  
	                placeQueen(queenList, row+1, n, ret);  
	            }  
	        }  
	    }  
	       
	    // �ж��Ƿ�����(row,col)��λ���ǰ�ȫ�ģ�����У��У������Խ��ߣ�  
	    // queenList�������У�������pair����queenList[row] = col  
	    public static boolean isSafe(int[] queenList, int row, int col){  
	        for(int preRow=0; preRow<row; preRow++){  
	            int preCol = queenList[preRow];  
	            if(preRow == row){      // �����ϲ��ؼ�飬��ΪpreRow������С��row��  
	                return false;  
	            }  
	            if(preCol == col){          // ����Ƿ���ͬһ��  
	                return false;  
	            }  
	            if(row-preRow == col-preCol){       // ���Խ���  
	                return false;  
	            }  
	            if(preRow+preCol == row+col){       // ���Խ���  
	                return false;  
	            }  
	        }  
	        return true;  
	    }  
}
