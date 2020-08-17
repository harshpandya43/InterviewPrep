package HomesiteInsuarance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals = {
				{1,3},{2,6},{8,10}, {15,18}
		};
		
		MergeIntervals m = new MergeIntervals();
		int[][] res = m.mergeIntervals(intervals);
		
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res[0].length;j++) {
				System.out.println(res[i][j]+" "+res[i][j+1]);
			}
		}

	}
	
	public int[][] mergeIntervals(int[][]intervals) {
		List<int[]> res = new ArrayList<>();
		if(intervals == null || intervals.length == 0) {
			return res.toArray(new int[res.size()][]); 
		}
		
		Arrays.sort(intervals, (i1,i2) -> i1[0]-i2[0]);
		
		int[] curr = intervals[0];
		
		for(int[] next : intervals) {
			if(curr[1] > next[0] && curr[1] < next[1]) {
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
