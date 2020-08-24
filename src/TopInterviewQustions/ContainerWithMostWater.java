package TopInterviewQustions;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContainerWithMostWater c = new ContainerWithMostWater();
		int[] heights = {1,8,6,2,5,4,8,3,7};
		int area = c.maxArea(heights);
		System.out.println(area);
	}
	
	public int maxArea(int[] heights) {
		if(heights == null || heights.length == 0) {
			return 0;
		}
		
		int area = 0;
		
		int left = 0;
		int right = heights.length -1;
		
		while(left < right) {
			area = Math.max(area, Math.min(heights[left], heights[right])* (right - left));
			
			if(heights[left] > heights[right]) {
				right--;
			}else {
				left++;
			}
		}
		return area;
	}

}
