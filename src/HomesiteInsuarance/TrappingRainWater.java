package HomesiteInsuarance;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrappingRainWater t = new TrappingRainWater();
		int[] heights = {0,1,0,2,1,0,1,3,2,1,2,1};
		int res = t.trap(heights);
		System.out.println(res);
		
	}
	
	public int trap(int[] heights) {
		if(heights == null || heights.length == 0) {
			return 0;
		}
		
		int left[] = new int[heights.length];
		int right[] = new int[heights.length];
		
		int max = heights[0];
		left[0] = heights[0];
		
		for(int i=1;i<heights.length;i++) {
			if(heights[i] < max) {
				left[i] = max;
			}else {
				max = heights[i];
				left[i] = heights[i];
			}
		}
		
		max = heights[heights.length-1];
		right[heights.length-1] = heights[heights.length-1];
		
		for(int i=heights.length-2;i>=0;i--) {
			if(heights[i] < max) {
				right[i] = max;
			}else {
				right[i] = heights[i];
				max = heights[i];
			}
		}
		
		int res = 0;
		
		for(int i=0;i<heights.length;i++) {
			res += Math.min(left[i], right[i]) - heights[i];
		}
		
		return res;
	}
	
	
}
