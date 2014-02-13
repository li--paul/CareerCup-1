public class TreeNode {
	Object data;
	TreeNode left;
	TreeNode right;

	public TreeNode(Object data, TreeNode left, TreeNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public void dfsTree(TreeNode root) { // Print out the tree with in-order

		if (root != null) {
			System.out.println(root.data);
			dfsTree(root.left);
			dfsTree(root.right);
		} else
			System.out.println("#");
		
	}
}