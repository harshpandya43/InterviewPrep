package HomesiteInsuarance;

public class ConvertSortedArrayToBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-10,-3,0,5,9};
		ConvertSortedArrayToBST c = new ConvertSortedArrayToBST();
		TreeNode root = c.heightBalancedTree(nums);
	}
	
	public TreeNode heightBalancedTree(int[] nums) {
		if(nums == null || nums.length == 0) {
			return null;
		}
		
		return heightBalancedTree(nums, 0, nums.length-1);
		
		
	}

	private TreeNode heightBalancedTree(int[] nums, int s, int e) {
		// TODO Auto-generated method stub
		if(s > e) {
			return null;
		}
		
		int mid = (s+e) / 2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = heightBalancedTree(nums, s, mid-1);
		root.right = heightBalancedTree(nums, mid+1, e);
		
		return root;
	}

}
