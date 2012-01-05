public class DoubleNode extends Node {
	
	private Node prevNode;

	public DoubleNode(Object obj){
		super(obj);
		prevNode = null;
	}
	public void setPrev(Node n){
		prevNode = n;
	}
	public Node getPrev(){
		return prevNode;
	}
}