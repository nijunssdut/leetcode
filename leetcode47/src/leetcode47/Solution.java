package leetcode47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Solution {
	   public ArrayList<String> anagrams(String[] strs) {  
	        // Start typing your Java solution below  
	        // DO NOT write main() function  
	        Map<String, LinkedList<String>> map = new HashMap<String, LinkedList<String>>();  
	        ArrayList<String> rel = new ArrayList<String>();  
	          
	          
	        for( int i=0; i<strs.length; i++) {  
	            char[] c = strs[i].toCharArray();  
	            Arrays.sort(c);  
	            String s = new String(c);  //!!!!alert!!! super important. != t.toString(){ [C@6e1408 }  
	            if( map.containsKey(s) ) {  
	                map.get(s).add( strs[i]);   // add() will return false or true;   
	            } else {  
	                LinkedList<String> ll = new LinkedList<String>();  
	                ll.add( strs[i] );  
	                map.put(s, ll);  
	            }  
	        }  
	          
	        for(LinkedList<String> ll : map.values() ) {  
	            if( ll.size() > 1) {  
	                rel.addAll( ll );  
	            }  
	        }  
	          
	        return rel;  
	    }    
 public static void main(String args[])
 {
	 System.out.println();
 }
}
