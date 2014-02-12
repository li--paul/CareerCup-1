import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphNode {
	ArrayList<GraphNode> adjs = new ArrayList<GraphNode>();
	Object data;

	ArrayList<GraphNode> visited;
	Queue<GraphNode> bfsQ;

	public GraphNode(Object data, ArrayList<GraphNode> adjs) {
		this.data = data;
		this.adjs = adjs;
	}
	
	public boolean equals(GraphNode node) {
		if (this.data == node.data && this.adjs.size() == node.adjs.size()) {
			for (int i = 0; i < this.adjs.size(); i++) {
				if (node.adjs.get(i) != this.adjs.get(i))
					return false;
			}
			return true;
		}
		return false;
	}

	public boolean searchLink(GraphNode dest, int mode) { //mode = 0 for BFS, mode = 1 for DFS
		visited = new ArrayList<GraphNode>();
		
		if (mode == 0) {
			bfsQ = new LinkedList<GraphNode>();
			if (this.bfsSearchLink(this, dest))
				return true;
			return false;
		} else if (mode == 1) {
			if (this.dfsSerachLink(this, dest))
				return true;
			return false;
		} else {
			System.out.println("Wrong mode number");
			return false;
		}
			
	}

	private boolean bfsSearchLink(GraphNode source, GraphNode dest) {
		if (source == null || dest == null) 
			return false;
		if (bfsQ.element() == null && visited.isEmpty())
			bfsQ.offer(source);
		while (bfsQ.element() != null) {
			if (source.equals(dest))
				return true;
			for (int i = 0; i < source.adjs.size(); i++) {
				GraphNode childNode = source.adjs.get(i);
				if (!visited.contains(childNode)) {
					visited.add(childNode);
					bfsQ.offer(childNode);
				}
			}
			source = bfsQ.poll();
		}
		return false;
	}

	private boolean dfsSerachLink(GraphNode source, GraphNode dest) {
		if(source == null || dest == null)
			return false;
		return false;
	}
}
			
			