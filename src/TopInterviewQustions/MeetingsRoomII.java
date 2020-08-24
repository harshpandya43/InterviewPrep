package TopInterviewQustions;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingsRoomII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MeetingsRoomII m = new MeetingsRoomII();
		int[][] intervals = {
				{0,30}, {5,10}, {15,20}
		};
		
		int sol = m.minRoomRequired(intervals);
		System.out.println(sol);
	}
	
	public int minRoomRequired(int[][] intervals) {
		if(intervals == null || intervals.length == 0) {
			return 0;
		}
		
		Arrays.sort(intervals, (i1, i2) -> i1[0]-i2[0]);
		
		PriorityQueue<int[]> pq = new PriorityQueue<int[]>((i1, i2) -> i1[1]-i2[1]);
		pq.add(intervals[0]);
		
		for(int i=1;i<intervals.length;i++) {
			if(intervals[i][0] >= pq.peek()[1]) {
				pq.remove();
			}
			
			pq.add(intervals[i]);
		}
		return pq.size();
		
	}

}
