package leetcode151;
import java.util.Scanner;
public class leetcode151 {
	 public static String reverseWords(String s) {
		 String regex = "\\s+";  
	        String[] words = s.trim().split(regex);  
	        String reString = "";  
	        for(int i = words.length-1; i>-1; i--){  
	            if(i == 0){  
	                reString += words[i].trim();  
	            }else{  
	                reString += words[i].trim()+" ";  
	            }  
	        }  
	        return reString;  
	 }


	 public static void main(String args[]){
		 String s = null;
		 String ss;
		 Scanner sc=new Scanner(System.in);//Input
		 s=sc.nextLine();
		 ss=reverseWords(s);
		 System.out.println(ss);
	 }

}
