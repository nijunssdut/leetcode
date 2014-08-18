package leetcode107;
 
public class Solution {
	   public static TreeNode sortedArrayToBST(int[] num) {
		   int len=num.length;
		   TreeNode res;
		   if(len==0)
			   return null;
		   res=check(num,null,0,len-1);
			return  res;
	        
	    }
	   public static TreeNode check(int[]num,TreeNode rs,int left,int right)
	   {
		   if(left>right)
			   return null;
		   int mid=(left+right)/2;
		   rs=new TreeNode(num[mid]);
		   rs.right=check(num,rs,mid+1,right);
		   rs.left=check(num,rs,left,mid-1);
		   return rs;
	   }
	   public static void main(String args[]){
		   int []A={1,2,3};
		   System.out.println(sortedArrayToBST(A));
	   }
	   
}
