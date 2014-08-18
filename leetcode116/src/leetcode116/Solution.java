package leetcode116;


public class Solution {
    public void connect(TreeLinkNode root) {
    	 if(root==null)  
             return;  
         TreeLinkNode  last = null, next = null;  
         while(root!=null)  
         {  
             if(root.left!=null)  
             {  
                 if(last==null)  
                     last = root.left;  
                 else  
                     last = last.next = root.left;  
                 if(next==null)  
                     next = root.left;  
             }  
             if(root.right!=null)  
             {  
                 if(last==null)  
                     last = root.right;  
                 else  
                     last = last.next = root.right;  
                 if(next==null)  
                     next = root.right;  
             }  
             root= root.next;  
         }  
         connect(next);  
  	}
    public static void main(String args[])
    {
    	System.out.println();
    }
}
