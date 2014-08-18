package leetcode34;

public class Solution {
	  public boolean isValidSudoku(char[][] board) {
		  char temp;
		  boolean rs=true;
	        for(int i=0;i<board.length;i++)
	        {
	        	for(int j=0;j<board[0].length;j++)
	        	{
	        		if(board[i][j]=='.')
	        			continue;
	        		temp=board[i][j];
	        		rs=tell(board,i,j,temp);
	        		board[i][j]=temp;
	        		if(!rs)
	        			return false;
	        		
	        	}
	        }
	        return rs;
	   }
	  public boolean tell(char[][] board,int x,int y,int temp)
	  {
		  int circle_x=x/3;
		  int circle_y=y/3;//the position of nine space
		  int xx;
		  int yy;
		  for(int k=0;k<9;k++)
		  {
			  if((board[x][k]==temp&&k!=y)||(board[k][y]==temp&&k!=x))
				  return false;
		  }//row and line not equal;
		  for(int w=0;w<9;w++)
		  {
			  xx=circle_x*3+w/3;
			  yy=circle_y*3+w%3;
			  if(board[xx][yy]==temp&&(xx!=x&&yy!=y))
			  {
				  return false;
			  }//nine space different numbers;
		  }
		  return true;
	  }
	  public static void main(String args[])
	  {
		  System.out.println();
	  }
}
