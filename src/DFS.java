import java.util.List;
import java.util.Stack;

public class DFS {
	
	private Stack<Vertex> stack;
	
	public DFS() {
		this.stack = new Stack<Vertex>();
	}
	
	public void runDFS(List<Vertex> vertexList) {
		
		for (Vertex v : vertexList) {
			if(!v.isVisited()) {
				v.setVisited(true);
				runDFSWithStack(v);
			}
		}
	}
	
	public void runDFS_Rec(List<Vertex> vertexList) {
		
		for (Vertex v : vertexList) {
			if(!v.isVisited()) {
				v.setVisited(true);
				runDFSRecursive(v);
			}
		}
	}

	private void runDFSRecursive(Vertex v) {
		System.out.print(v + " ");
		for (Vertex vertex : v.getAdjacencyList()) {
			vertex.setVisited(true);
			runDFSRecursive(vertex);
		}
	}

	private void runDFSWithStack(Vertex rootVertex) {
		
		this.stack.add(rootVertex);
		rootVertex.setVisited(true);
		
		while(!stack.isEmpty()) {
			Vertex poppedVertex = this.stack.pop();
			System.out.print(poppedVertex + " ");
			
			for (Vertex v : poppedVertex.getAdjacencyList()) {
				if(!v.isVisited()) {
					v.setVisited(true);
					this.stack.push(v);
				}
			}
		}
	}
}
