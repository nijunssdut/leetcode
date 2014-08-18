package leetcode17;

import java.util.ArrayList;

public class Solution {
	 public static ArrayList<String> letterCombinations(String digits) {
		 String[] letter = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		ArrayList<String> rs = new ArrayList<String>();
		  if(digits.length() == 0)
           {
			  rs.add("");            
	           return rs;
	       }
		  convert(letter, rs, 0, digits, "");
		  return rs;
	    }
	 public static void convert(String[] letter, ArrayList<String> result, int depth, String digits, String tmp){
		         if(depth == digits.length()){
		              result.add(tmp);
		              return;
		          }//no digits
		         int index = digits.charAt(depth) - 48;//the first number change position
		         for(int i = 0; i < letter[index].length(); i++){
		              tmp += letter[index].charAt(i);
		              convert(letter, result, depth + 1, digits, tmp);//repeat the next position
		              tmp = tmp.substring(0, tmp.length() - 1);
		          }
		      }
		   
	
	 public static void main(String args[])
	 {
		
		 System.out.println(letterCombinations("23"));
	 }
}
