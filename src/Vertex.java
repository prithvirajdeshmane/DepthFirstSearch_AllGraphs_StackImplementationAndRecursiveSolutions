import java.util.ArrayList;
import java.util.List;

public class Vertex {
	private String name;
	private boolean visited;
	private List<Vertex> adjacencyList;
	
	public Vertex (String name) {
		this.name = name;
		this.adjacencyList = new ArrayList<Vertex>();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Vertex> getAdjacencyList() {
		return adjacencyList;
	}

	public void setAdjacencyList(List<Vertex> adjacencyList) {
		this.adjacencyList = adjacencyList;
	}
	
	public void addAdjacentVertex(Vertex vertex) {
		this.adjacencyList.add(vertex);
	}

	@Override
	public String toString() {
		return this.name;
	}
}