
public class Edge {
	
	private double weight;
	private Node startNode;
	private Node endNode;
	
	public Edge (double weight, Node startNode, Node endNode) {
		this.weight = weight;
		this.startNode = startNode;
		this.endNode = endNode;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Node getStartVertex() {
		return startNode;
	}

	public void setStartVertex(Node startNode) {
		this.startNode = startNode;
	}

	public Node getEndNode() {
		return endNode;
	}

	public void setEndVertex(Node endNode) {
		this.endNode = endNode;
	}
	
	
}
