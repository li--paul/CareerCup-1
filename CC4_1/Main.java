public class Main {
	public static void main(String[] args) {
		TreeNode rootBalance = new TreeNode(0, null, null); // Nodes for a balance tree
		TreeNode a = new TreeNode(1, null, null);
		TreeNode b = new TreeNode(2, null, null);

		TreeNode rootUnbalance = new TreeNode(0, null, null); // Nodes for a unbalance tree
		TreeNode c = new TreeNode(1, null, null);
		TreeNode d = new TreeNode(2, null, null);

		/* A balance binary tree */
		rootBalance.left = a;
		rootBalance.right = b;
		Tree balanceTree = new Tree(rootBalance);
		if (balanceTree.isBalanced(balanceTree.root)) {
			System.out.println("Balanced");
		} else {
			System.out.println("Wrong Result");
		}

		/* A unbalance binary tree */
		rootUnbalance.left = c;
		c.left = d;
		Tree unbalanceTree = new Tree(rootUnbalance);
		unbalanceTree.isBalanced(unbalanceTree.root);
		if (!unbalanceTree.isBalanced(unbalanceTree.root)) {
			System.out.println("Unbalanced");
		} else {
			System.out.println("Wrong Result");
		}
	}
}