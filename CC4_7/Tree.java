public class Tree {
	TreeNode root;

	public Tree(TreeNode root) {
		this.root = root;
	}

	public boolean isSubTree(TreeNode bigTreeRoot, TreeNode smallTreeRoot) {
		if (bigTreeRoot == null)
			return false;

		if (bigTreeRoot.equals(smallTreeRoot)) {
			if (isSame(bigTreeRoot, smallTreeRoot))
				return true;
		}
		return (isSubTree(bigTreeRoot.left, smallTreeRoot) || isSubTree(bigTreeRoot.right, smallTreeRoot));
	}

	public boolean isSame(TreeNode bigTreeRoot, TreeNode smallTreeRoot) {
		if (smallTreeRoot == null && bigTreeRoot == null)
			return true;
		if (bigTreeRoot == null || smallTreeRoot == null) 
			return false;
		if (!bigTreeRoot.equals(smallTreeRoot))
			return false;
		return (isSame(bigTreeRoot.left, smallTreeRoot.left) && isSame(bigTreeRoot.right, smallTreeRoot.right));
	}
}