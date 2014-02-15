public class TreeNode {
	Object data;
	TreeNode left;
	TreeNode right;

	public TreeNode(Object data, TreeNode left, TreeNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public boolean equals(TreeNode node) {
		return (this.data == node.data);
	}
}