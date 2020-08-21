package HomesiteInsuarance;

import java.util.Stack;

class TreeNode{
	TreeNode left;
	TreeNode right;
	int val;
	
	TreeNode(int x) {
		val = x;
	}
}

public class MaximumDepthOfABinaryTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		
		MaximumDepthOfABinaryTree m = new MaximumDepthOfABinaryTree();
		int depth = m.maxDepth(root);
		System.out.println(depth);

	}
	
	public int maxDepth(TreeNode root) {
		if(root == null) {
			return 0;
		}
		
		Stack<TreeNode> stack = new Stack<>();
		Stack<Integer> depths = new Stack<>();
		
		int maxD = 0;
		int curr_depth = 0;
		
		stack.push(root);
		depths.push(1);
		
		while(!stack.isEmpty()) {
			TreeNode node = stack.pop();
			curr_depth = depths.pop();
			
			if(node != null) {
				maxD = Math.max(maxD, curr_depth);
				stack.push(node.left);
				stack.push(node.right);
				depths.push(curr_depth+1);
				depths.push(curr_depth+1);
			}
		}
		return maxD;
	}

}
