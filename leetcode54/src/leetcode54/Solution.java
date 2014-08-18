package leetcode54;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
	 public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
	        // Start typing your Java solution below
	        // DO NOT write main() function              
	        int len = intervals.size();
	        if (len == 0 || len == 1) return intervals;
	        ArrayList<Interval> ans = new ArrayList<Interval>();
	         
	        Collections.sort(intervals, new IntervalComparator());
	         
	        Interval tmp = intervals.get(0);
	        for (int i = 1; i < len; i++) {
	            Interval itv = intervals.get(i);
	            if (tmp.end >= itv.start) { // mergeable
	                int left = Math.min(tmp.start, itv.start);
	                int right = Math.max(tmp.end, itv.end);
	                tmp = new Interval(left, right);
	            }
	            else {
	                ans.add(tmp);
	                tmp = intervals.get(i);
	            }
	        }
	        ans.add(tmp);
	        return ans;
	    }
	 public static void main(String args[])
	 {
		 System.out.println();
	 }
	}
	 
	class IntervalComparator implements Comparator<Interval>
	{
	    public int compare(Interval a, Interval b) {
	        return a.start - b.start;
	    }
	}


