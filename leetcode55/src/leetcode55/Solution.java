package leetcode55;

import java.util.ArrayList;
import java.util.ListIterator;

public class Solution {
	  public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
		  if(intervals==null||newInterval==null) {  
	            return intervals;  
	        }  
		  if(intervals.size()==0) {  
	            intervals.add(newInterval);  
	            return intervals;  
	        }  
		  ListIterator<Interval> item = intervals.listIterator();  
		  while(item.hasNext()) {  
	            Interval tempInterval = item.next();  //如果新区间的end < 当前区间的start，不用找下去了，把新区间插入到当前区间的前面，然后返回。
	            if(newInterval.end<tempInterval.start) {  
	                item.previous();  
	                item.add(newInterval);  
	                return intervals;  
	            } else {  
	                if(tempInterval.end<newInterval.start) {  
	                    continue;  
	                } else {  
	                    newInterval.start = Math.min(tempInterval.start, newInterval.start);  
	                    newInterval.end   = Math.max(tempInterval.end, newInterval.end);  
	                    item.remove();  
	                }  //如果当前区间和新区间发生重合，则start取两者最小的start，end取两者最大的end，生成一个新的 区间。  继续遍历。
	            }  
	        }  
	        intervals.add(newInterval);  
	        return intervals;  
	    }
	  public static void main(String args[])
	  {
		  System.out.println();
	  }

}
