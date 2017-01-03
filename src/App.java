import java.util.ArrayList;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		Vertex v1 = new Vertex("1");
		Vertex v2 = new Vertex("2");
		Vertex v3 = new Vertex("3");
		Vertex v4 = new Vertex("4");
		Vertex v5 = new Vertex("5");
		
		List<Vertex> list = new ArrayList<Vertex>();
		
		v1.addAdjacentVertex(v2);
		v1.addAdjacentVertex(v3);
		v3.addAdjacentVertex(v4);
		v4.addAdjacentVertex(v5);
		
		list.add(v1);
		list.add(v2);
		list.add(v3);
		list.add(v4);
		list.add(v5);
		
		DFS dfs = new DFS();
		
		System.out.println("Solution with stack (Traverses right side of the tree first");
		dfs.runDFS(list);
		
		list = resetVisited(list);
		
		System.out.println("\nRecursive solution (Traverses left side of the tree first)");
		dfs.runDFS_Rec(list);
		
	}
	
	private static List<Vertex> resetVisited(List<Vertex> list) {
		for (Vertex v : list) {
			v.setVisited(false);
		}
		return list;
	}
}
