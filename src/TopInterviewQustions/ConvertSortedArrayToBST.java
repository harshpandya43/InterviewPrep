package TopInterviewQustions;

public class ConvertSortedArrayToBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConvertSortedArrayToBST c = new ConvertSortedArrayToBST();
	}
	
	public TreeNode sortedArrayToBST(int[] nums) {
		if(nums == null || nums.length == 0) {
			return null;
		}
		
		return sortedArrayToBST(nums, 0, nums.length-1);
	}

	private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
		if(start > end) {
			return null;
		} 
		
		int mid = (start + end) / 2;
		TreeNode root = new TreeNode(nums[mid]);
		TreeNode left = sortedArrayToBST(nums, start, mid-1);
		TreeNode right = sortedArrayToBST(nums, mid+1, end);
		
		return root;
		
	}
	
	

}
