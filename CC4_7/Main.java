public class Main {
	public static void main(String[] args) {
		TreeNode bigRoot = new TreeNode(0, null, null);
		TreeNode smallRoot = new TreeNode(1, null, null);
		TreeNode bigA = new TreeNode(1, null, null);
		TreeNode bigB = new TreeNode(2, null, null);
		TreeNode bigC = new TreeNode(3, null, null);
		TreeNode smallA = new TreeNode(2, null, null);
		TreeNode smallB = new TreeNode(3, null, null);
		TreeNode smallC = new TreeNode(4, null, null);

		/* smallTree is a sub tree of Big tree with smallRoot is node bigA */
		bigRoot.left = bigA;
		bigA.left = bigB;
		bigA.right = bigC;

		smallRoot.left = smallA;
		smallRoot.right = smallB; 

		Tree bigTree = new Tree(bigRoot);
		Tree smallTree = new Tree(smallRoot);

		if (bigTree.isSubTree(bigTree.root, smallTree.root))
			System.out.println("Is SubTree");
		else
			System.out.println("Is not SubTree");

		/* Add a new node to smallTree to make it is no longer a sub tree of bigTree */
		smallA.left = smallC;
		if (bigTree.isSubTree(bigTree.root, smallTree.root))
			System.out.println("Is SubTree");
		else
			System.out.println("Is not SubTree");
	}
}