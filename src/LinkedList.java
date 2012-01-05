public class LinkedList /*implements List*/{

	private Node firstNode;
	private Node lastNode;
	
	public LinkedList(Node n){
		firstNode = n;
		lastNode = firstNode;
	}
	public LinkedList(){
		this(null);
		lastNode = firstNode;
	}
	public void add(Node n){
		lastNode.pointTo(n);
		lastNode = n;
	}
	public void add(Object obj){
		Node newNode = new Node(obj);
		lastNode.pointTo(newNode);
		lastNode = newNode;
	}
	public void addFirst(Object obj){
		Node newNode = new Node(obj, firstNode);
		firstNode = newNode;
	}
	public void remove(){
		firstNode = firstNode.getNextNode();
	}
	public void removeLast(){
		Node n = firstNode;

		if(n == null)
			return;
		while(n.getNextNode()!=lastNode)
			n = n.getNextNode();
		
		n.pointTo(null);
		lastNode = n;
	}
	public String toString(){
		Node n = firstNode;
		String str = "";
		
		while(n != null){
			str += n.toString();
			n = n.getNextNode();
		}
		return str;
	}
	public Node getFirst(){
		return firstNode;
	}
	public Node getLast(){
		return lastNode;
	}
	public void setFirst(Node n){
		firstNode = n;
	}
	public void setLast(Node n){
		lastNode = n;
	}
}