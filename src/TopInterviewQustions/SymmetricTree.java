package TopInterviewQustions;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
	TreeNode left;
	TreeNode right;
	int val;
	
	TreeNode(int x) {
		val = x;
	}
}

public class SymmetricTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SymmetricTree s = new SymmetricTree();
	}
	
	
	public boolean isSymmetric(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		q.add(root);
		
		while(!q.isEmpty()) {
			TreeNode t1 = q.poll();
			TreeNode t2= q.poll();
			
			if(t1 == null && t2 == null) {
				continue;
			}
			
			if(t2 == null || t1 == null) {
				return false;
			}
			
			if(t1.val != t2.val) {
				return false;
			}
			
			q.add(t1.left);
			q.add(t2.right);
			q.add(t1.right);
			q.add(t2.left);
		}
		return true;
	}

}
