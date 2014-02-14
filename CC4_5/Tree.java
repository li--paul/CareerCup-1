public class Tree {
	TreeNode root;

	public Tree(TreeNode root) {
		this.root = root;
	}

	private TreeNode minNode(TreeNode node) { // For a BST, the minimum node of input tree which node as root is the most left child
		while (node.left != null)
			node = node.left;
		return node;
	}

	public TreeNode findSuccessor(TreeNode node) {
		if (node == null)
			return null;
		if (node.right != null) // The minumum node of right child is the answer
			return minNode(node.right);
		if (node.parent != null) { 
			if (node == node.parent.left) // The parent is the answer
				return node.parent;
			if (node.parent.parent != null)
				return node.parent.parent; // The parent of the parent is the answer
		}
		return null;
	}
}