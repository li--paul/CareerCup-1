import java.util.ArrayList;

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
		b.right = d;
		c.left = e;

		/* The Tree is looks like this

					0
				1		2
			3				4
		5

		*/

		Tree tree = new Tree(root);
		ArrayList<LinkedListNode> result = tree.bSTToLinkedList (tree.root);

		for(int i = 0; i < result.size(); i++) {
			LinkedListNode node = result.get(i);
			while (node != null ) {
				System.out.print(node.data + " ");
				node = node.next;
			}
			System.out.println();
		}
	}
}