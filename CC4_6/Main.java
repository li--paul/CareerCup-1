public class Main {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(0, null, null);
		TreeNode a = new TreeNode(1, null, null);
		TreeNode b = new TreeNode(2, null, null);
		TreeNode c = new TreeNode(3, null, null);
		TreeNode d = new TreeNode(4, null, null);
		TreeNode e = new TreeNode(5, null, null);
		root.left = a;
		root.right = b;
		a.left = c;
		b.left = d;
		b.right = e;

		/* The binary tree looks like this

					0
				1		2
			3		  4    5

		*/

		Tree tree = new Tree(root);
		TreeNode commanAncestor = tree.firstCommonAncestor(tree.root, a, b); // Should be node root with data 0
		if (commanAncestor != null)
			System.out.println(commanAncestor.data);
		else
			System.out.println("Wrong input");

		commanAncestor = tree.firstCommonAncestor(tree.root, d, e); // Should be node b with data 2
		if (commanAncestor != null)
			System.out.println(commanAncestor.data);
		else
			System.out.println("Wrong input");

		commanAncestor = tree.firstCommonAncestor(tree.root, a, a); // Should return null;
		if (commanAncestor != null)
			System.out.println(commanAncestor.data);
		else
			System.out.println("No comman Ancestor node"); // Should output this line

		commanAncestor = tree.firstCommonAncestor(tree.root, a, c); // Should return null;
		if (commanAncestor != null)
			System.out.println(commanAncestor.data);
		else
			System.out.println("No comman Ancestor node"); // Should output this line



	}
}