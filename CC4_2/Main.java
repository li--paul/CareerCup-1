import java.util.ArrayList;

public class Main {
	
		public static void main(String[] args) {

			// Initialize the situation with 'a' is a single node and 'd' is connected to 'b' and 'c'
			GraphNode a = new GraphNode(0);
			GraphNode b = new GraphNode(1);
			GraphNode c = new GraphNode(2);
			ArrayList<GraphNode> adjD = new ArrayList<GraphNode>();
			adjD.add(b);
			adjD.add(c);
			GraphNode d = new GraphNode(4, adjD);

			if (d.searchLink(b, 0)) { // Mode 0 for BFS search, result should be "Linked" 
				System.out.println("Linked");
			} else {
				System.out.println("Unlinked");
			}
			
			if (d.searchLink(a, 0)) { // Mode 0 for BFS search, result should be "Unlinked"
				System.out.println("Linked");
			} else {
				System.out.println("Unlinked");
			}

			if (d.searchLink(c, 1)) { // Mode 1 for DFS search, result should be "Linked"
				System.out.println("Linked");
			} else {
				System.out.println("Unlinked");
			}

			if (d.searchLink(a, 1)) { // Mode 1 for DFS search, result should be "Unlinked"
				System.out.println("Linked");
			} else {
				System.out.println("Unlinked");
			}

			if (d.searchLink(c, 3)) { // Mode 3 makes no sence, result should be "Wrong mode number" and "Unlinked"
				System.out.println("Linked");
			} else {
				System.out.println("Unlinked");
			}
		}
}