public class Tree {
	TreeNode root;

	public Tree(TreeNode root) {
		this.root = root;
	}

	public TreeNode firstCommonAncestor(TreeNode root, TreeNode firstNode, TreeNode secondNode) {
		if (root == null || firstNode == null || secondNode == null)
			return null;
		if ((inSubTree(root.left, firstNode) && inSubTree(root.right, secondNode)) || (inSubTree(root.left, secondNode) && inSubTree(root.right, firstNode)))
			return root;
		if (inSubTree(root.left, firstNode) && inSubTree(root.left, secondNode)) {
			return firstCommonAncestor(root.left, firstNode, secondNode);
		}
		else {
			return firstCommonAncestor(root.right, firstNode, secondNode);
		}
	}

	private boolean inSubTree(TreeNode root, TreeNode dest) {
		if (root == null)
			return false;
		if (root == dest)
			return true;
		if (root.left != null) {
			if (inSubTree(root.left, dest))
				return true;
		}
		if (root.right != null) {
			if (inSubTree(root.right, dest))
				return true;
		}
		return false;
	}
}