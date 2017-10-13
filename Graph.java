import java.util.Arrays;

public class Graph {
	private int [][]matrix;
	private final int Infinity = 9500;
	private int nodes;
	
	public Graph(int nodes) {
		this.nodes = nodes;
		matrix = new int[nodes][nodes];
		
		for(int i = 0; i < nodes; i++) {
			for(int j = 0; j < nodes; j++) {
				matrix[i][j] = Infinity;
			}
		}
	}
	
	int getSize() {
		return nodes;
	}
	
	void addArc(int v, int w, int cost) {
		matrix[v][w] = cost;
	}

	void removeArc(int v)
	{
		for(int i = 0; i < nodes; i++) {
			matrix[v][i] = Infinity;
			matrix[i][v] = Infinity;
		}
	}
	
	boolean isArc(int v, int w) {
		if(matrix[v][w] != Infinity) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		String result = "";
		result += nodes + "\n";
		for(int i = 0; i < nodes; i++) {
			for(int j = 0; j < nodes; j++) {
				if(matrix[i][j] == 9500) {
					result += "- ";
				} else {
					result += matrix[i][j] + " ";
				}
			}
			result += "\n";
		}
		return result;
	}
	
	public static void main(String [] args) {
		Graph graph = new Graph(8);
		
		graph.addArc(0, 6, 15);
		graph.addArc(0, 4, 1);
		graph.addArc(1, 2, 5);
		graph.addArc(2, 3, 6);
		graph.addArc(2, 5, 7);
		graph.addArc(3, 4, 2);
		graph.addArc(4, 6, 2);
		graph.addArc(4, 5, 3);
		graph.addArc(5, 1, 1);
		graph.addArc(5, 0, 6);
		graph.addArc(7, 4, 2);
		graph.addArc(7, 5, 4);
		
		System.out.println(graph);

		graph.removeArc(5);

		System.out.println(graph);
	}
}
