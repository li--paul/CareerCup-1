public class BST {
	public TreeNode buildBST(int[] sortedArray, int start, int end) {
		if (end < start) { // If end < start then the node 
			return null;
		}
		int mid = (start + end) / 2; // Find out the current middle value index of the array
		TreeNode node = new TreeNode(sortedArray[mid], null, null);
		node.left = buildBST(sortedArray, start, mid -1);
		node.right = buildBST(sortedArray, mid+1, end);
		return node;
	}
}