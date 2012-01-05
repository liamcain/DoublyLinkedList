public class Node {

	private Object info;
	private Node pointer;
	
	public Node(Object obj){
		this(obj,null);
	}
	public Node(Object obj, Node node){
		info = obj;
		pointer = node;
	}
	public Object getNode(){
		return info;
	}
	public void setNode(Object obj){
		info = obj;
	}
	public Node getNextNode(){
		return pointer;
	}
	public void pointTo(Node node){
		pointer = node;
	}
	public boolean hasNext(){
		return (pointer != null) ?true :false;
	}
	public String toString(){
		return (info.toString() + " ");
	}
}