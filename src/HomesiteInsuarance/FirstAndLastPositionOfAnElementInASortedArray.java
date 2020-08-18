package HomesiteInsuarance;

public class FirstAndLastPositionOfAnElementInASortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,7,7,8,8,10};
		int target = 8;
		
		FirstAndLastPositionOfAnElementInASortedArray f = new FirstAndLastPositionOfAnElementInASortedArray();
		int[] res = f.findPositions(nums, target);
		
		for(int r : res) {
			System.out.print(r+ " ");
		}
	}
	
	public int[] findPositions(int[] nums, int target) {
		int[] targetRange = {-1,-1};
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == target) {
				targetRange[0] = i;
				break;
			}
		}
		
		if(targetRange[0] == -1) {
			return targetRange;
		}
		
		for(int j = nums.length-1;j>=0;j--) {
			if(nums[j] == target) {
				targetRange[1] = j;
				break;
			}
		}
		return targetRange;
	}

}
