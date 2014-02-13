public class Main {
	public static void main(String[] args) {
		int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		BST bst = new BST();
		TreeNode root = bst.buildBST(sortedArray, 0, sortedArray.length - 1);
		root.dfsTree(root);
	}
}