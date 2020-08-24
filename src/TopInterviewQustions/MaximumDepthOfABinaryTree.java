package TopInterviewQustions;

import java.util.Stack;

public class MaximumDepthOfABinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int depthOfBinaryTree(TreeNode root) {
		Stack<Integer> depth = new Stack<>();
		Stack<TreeNode> stack = new Stack<>();
		
		stack.push(root);
		depth.push(1);
		
		int maxDepth = 0;
		int currDepth = 0;
		
		while(!stack.isEmpty()) {
			TreeNode node = stack.pop();
			currDepth = depth.pop();
			
			if(node!=null) {
				maxDepth = Math.max(maxDepth, currDepth);
				stack.add(node.left);
				stack.add(node.right);
				depth.add(currDepth+1);
				depth.add(currDepth+1);
			}
		}
		return maxDepth;
				
	}

}
