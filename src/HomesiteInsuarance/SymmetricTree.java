package HomesiteInsuarance;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(3);
		
		SymmetricTree s = new SymmetricTree();
		System.out.println(s.isSymmetric(root));
	}
	
	public boolean isSymmetric(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		queue.add(root);
		
		while(!queue.isEmpty()) {
			TreeNode t1 = queue.poll();
			TreeNode t2 = queue.poll();
			
			if(t1 == null && t2 == null) {
				continue;
			}
			
			if(t1 == null || t2 == null) {
				return false;
			}
			
			if(t1.val != t2.val) {
				return false;
			}
			
			queue.add(t1.left);
			queue.add(t2.right);
			queue.add(t1.right);
			queue.add(t2.left);
		}
		return true;
	
	}

}
