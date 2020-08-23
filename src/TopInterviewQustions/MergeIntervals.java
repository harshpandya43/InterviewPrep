package TopInterviewQustions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeIntervals m = new MergeIntervals();
		int[][] intervals = {
				{1,3}, {2,6}, {8,10}
		};
		
		int[][] res = m.merge(intervals);
	}
	
	public int[][] merge(int[][] intervals) {
		List<int[]> res = new ArrayList<>();
		if(intervals == null || intervals.length == 0) {
			return res.toArray(new int[res.size()][]);
		}
		
		Arrays.sort(intervals, (i1, i2) -> i1[0] - i2[0]);
		
		int[] curr = intervals[0];
		
		for(int[] next : intervals) {
			if(curr[1] > next[0] && next[1] > curr[1]) {
				curr[1] = next[1];
			}else if(curr[1] < next[0]) {
				res.add(curr);
				curr = next;
			}
		}
		res.add(curr);
		return res.toArray(new int[res.size()][]);
	}

}
