public class Main {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(null, null, null, 5);
		TreeNode a = new TreeNode(root, null, null, 3);
		TreeNode b = new TreeNode(root, null, null, 8);
		TreeNode c = new TreeNode(a, null, null, 2);
		TreeNode d = new TreeNode(a, null, null, 4);
		TreeNode e = new TreeNode(b, null, null, 6);
		TreeNode f = new TreeNode(e, null, null, 7);
		root.left = a;
		root.right = b;
		a.left = c;
		a.right = d;
		b.left = e;
		e.right = f;

		/* The BST is like this
										5
								/				\
						3								8
					/		\						/
				2				4				6
												  \
													7
		*/

		Tree tree = new Tree(root);
		if (tree.findSuccessor(a) != null)
			System.out.println("The inorder successor of Node a(3) is " + tree.findSuccessor(a).data); // Should be 4
		if (tree.findSuccessor(c) != null)
			System.out.println("The inorder successor of Node c(2) is " + tree.findSuccessor(c).data); // Should be 3
		if (tree.findSuccessor(d) != null)
			System.out.println("The inorder successor of Node d(4) is " + tree.findSuccessor(d).data); // Should be 5
		if (tree.findSuccessor(d) != null)
			System.out.println("The inorder successor of Node f(7) is " + tree.findSuccessor(f).data); // Should be 8


	}
}