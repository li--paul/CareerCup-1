import java.util.ArrayList;

public class Tree {
	TreeNode root;
	ArrayList<LinkedListNode> result;

	public Tree(TreeNode root) {
		this.root = root;
	}

	public ArrayList<LinkedListNode> bSTToLinkedList(TreeNode root) { // The method does not require the Tree to be a BST, but BST is valid
		result = new ArrayList<LinkedListNode>();
		dFSNode (root, 0); // Construct the ArrayList of all LinkedList heads by DFS
		return result;
	}

	private void dFSNode(TreeNode root, int level) {
		if (root != null) {
			LinkedListNode node = new LinkedListNode(root.data, null);
			if (result.size() == level) { // If the current level has not been created
				result.add(node);
			} else {
				LinkedListNode temp = result.get(level);
				while (temp.next != null) // Find the tail of current level LinkedList
					temp = temp.next;
				temp.next = node;
			}
			if (root.left != null)
				dFSNode(root.left, level + 1); // Recursive call for the left child
			if (root.right != null)
				dFSNode(root.right, level + 1); // Recursive call for the right child
		}
	}

}