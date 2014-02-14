public class Tree {
	TreeNode root;

	public Tree(TreeNode root) {
		this.root = root;
	}

	public Boolean isBalanced(TreeNode node) {
		if (node == null)
			return false;
		if (maxDeep(root) - minDeep(root) < 2) { // If the max - min is either 0 or 1, the binary tree is a balance tree
			return true;
		}
		return false;
	}

	public int minDeep(TreeNode node) { // Calculate the minimun deep of a binary tree
		if (node == null) 
			return 0;
		return Math.min(minDeep(node.left), minDeep(node.right)) + 1;

	}

	public int maxDeep(TreeNode node) { // Calculate the maximum deep of a binary tree
		if (node == null) 
			return 0;
		return Math.max(maxDeep(node.left), maxDeep(node.right)) + 1;
	}

}