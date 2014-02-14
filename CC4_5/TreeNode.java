public class TreeNode {
	TreeNode parent;
	TreeNode left;
	TreeNode right;
	Object data;
    
    public TreeNode(TreeNode parent, TreeNode left, TreeNode right, Object data) {
        this.parent = parent;
        this.left = left;
        this.right = right;
        this.data = data;
    }
}