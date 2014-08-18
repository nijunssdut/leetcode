package leetcode98;
/*
public class Solution {
	 static TreeNode pre=null;
	 static TreeNode n1=null;  
     static TreeNode n2=null;
	 public static void recoverTree(TreeNode root) {
		  
		 check(root);
		 if(n1!=null && n2!=null)  
	        {  
	            int tmp=n1.val;  
	            n1.val=n2.val;  
	            n2.val=tmp;  
	        }  
	    }  
	  public static  void check(TreeNode root)  
	    {  
	        if(root==null)
	        	return;  
	          
	        check(root.left); 
	        if(pre==null)
	        	pre=root;
	        else  
	        {   if( pre.val > root.val){
	            n2=root; 
	            if(n1==null)  
	            {  
	                n1=pre;
	            } 
	        }
	            pre=root;
	       }  
	      
	        check(root.right);  
	       
	    }  
	 public static void main(String args[])
	 {
		 TreeNode A=new TreeNode(0);
		  TreeNode B=new TreeNode(1);
		 // TreeNode C=new TreeNode(1);
		  A.left=B;
		//  B.right=C;
		  recoverTree(A);
		 System.out.println();
	 }
}*/
public class Solution {
    TreeNode pre;
	TreeNode n1;  
    TreeNode n2;
	 public void recoverTree(TreeNode root) {
		  pre=null;
	      n1=null;  
          n2=null;
		 check(root);
		 if(n1!=null && n2!=null)  
	        {  
	            int tmp=n1.val;  
	            n1.val=n2.val;  
	            n2.val=tmp;  
	        }  
	    }  
	  public  void check(TreeNode root)  
	    {  
	        if(root==null)
	        	return;  
	          
	        check(root.left); 
	        if(pre==null)
	        	pre=root;
	        else  
	        {   if( pre.val > root.val){
	                if(n1==null)  
	                {  
	                    n1=pre;
	                } 
	             n2=root; 
	            }
	            pre=root;
	       }  
	      
	        check(root.right);  
	       
	    }  
	 public static void main(String args[])
	 {
		 System.out.println();
	 }

}