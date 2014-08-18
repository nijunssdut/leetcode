package leetcode78;

public class Solution {
	  public static boolean exist(char[][] board, String word) {
		  if(word.length()==0) {  
		        return false;  
		    }    
		    boolean[][] flag = new boolean[board.length][board[0].length];  
		    for (int i=0;i<board.length;i++) {  
		        for (int j=0;j<board[i].length;j++) {  
		            flag[i][j] = false;  
		        }  
		    }  
		      
		    for (int i=0;i<board.length;i++) {  
		        for (int j=0;j<board[i].length;j++) {  
		            if(board[i][j]==word.charAt(0)) {  
		                flag[i][j] = true;  
		                if(word.length()==1 || search(board,i,j,word.substring(1),flag)) {  
		                    return true;  
		                }  
		                flag[i][j] = false;  
		            }  
		        }  
		    }  
		    return false;  
	    }
	  public static boolean search(char[][] board, int i, int j, String word, boolean [][]flag) {  
	  if(word.length()==0) {  
	        return true;  
	    }  
	    //四个走向  
	    int[][] direction = { {-1,0},{1,0},{0,-1},{0,1}};  
	      
	    for (int k=0;k<direction.length;k++) {  
	        int ii = i + direction[k][0];  
	        int jj = j + direction[k][1];//up,down,left,right  
	        if ( ii>=0&&ii<board.length&&  
	             jj>=0&&jj<board[i].length&&  
	             board[ii][jj]==word.charAt(0)&&  
	             flag[ii][jj]==false) {  
	            flag[ii][jj] = true;  
	            if (word.length()==1 || search(board,ii,jj,word.substring(1),flag)) {  
	                return true;  
	            }  
	            flag[ii][jj] = false;  
	        }  
	    }  
	    return false;
	  }
	  public static void main(String args[])
	  {
		  char[][]A={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		  System.out.println(exist(A,"SEE"));
	  }
}
