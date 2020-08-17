package HomesiteInsuarance;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int heights[] = {1,8,6,2,5,4,8,3,7};
		ContainerWithMostWater c = new ContainerWithMostWater();
		int maxarea = c.maxArea(heights);
		System.out.println(maxarea);
	}
	
	public int maxArea(int[] heights) {
		int maxArea = 0;
		int left = 0;
		int right = heights.length - 1;
		
		while(left < right) {
			maxArea = Math.max(maxArea, Math.min(heights[left], heights[right]) * (right - left));
			
			if(heights[left] > heights[right]) {
				right --;
			}else {
				left++;
			}
		}
		return maxArea;
		
		
	}

}
