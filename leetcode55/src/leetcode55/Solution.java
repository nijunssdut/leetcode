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
	            Interval tempInterval = item.next();  //����������end < ��ǰ�����start����������ȥ�ˣ�����������뵽��ǰ�����ǰ�棬Ȼ�󷵻ء�
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
	                }  //�����ǰ����������䷢���غϣ���startȡ������С��start��endȡ��������end������һ���µ� ���䡣  ����������
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
