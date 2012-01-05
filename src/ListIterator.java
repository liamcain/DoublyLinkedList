public class ListIterator implements Iterator {

	private LinkedList list;
	private Node prevNode;
	private Node nextNode;
	
	public ListIterator(LinkedList list){
		this.list = list;
		prevNode = list.getFirst();
		nextNode = list.getFirst().getNextNode();
	}
	public Object next(){
		prevNode = nextNode;
		nextNode = nextNode.getNextNode();
		return prevNode.getNode();
	}
	public Object previous(){
		Node n = list.getFirst();
		while(n!=null){
			if(n.getNextNode() == prevNode){
				nextNode = n.getNextNode();
				prevNode = n;
				return prevNode.getNode();
			}
			
			n = n.getNextNode();
		}
		return prevNode.getNode();
	}
	public Object remove(){
		Object o = nextNode;
		prevNode.pointTo(nextNode.getNextNode());
		nextNode = prevNode.getNextNode();
		return o;
	}
	public boolean remove(Object obj){
		Node n = list.getFirst();
		Node p = n.getNextNode();
		while(p!=null){
			if(p.getNode() == obj)
				n.pointTo(p.getNextNode());
			n = p;
			p = p.getNextNode();
		}
		return true;
	}
	public void add(Object obj){
		Node node = new Node(obj, nextNode);
		prevNode.pointTo(node);
	}
	public boolean set(Object obj){
		prevNode.setNode(obj);
		return true;
	}
	public boolean hasNext(){
		return (nextNode != null);
	}
	public boolean hasPrev(){
		return (prevNode != null);
	}
	public Node getNext(){
		return nextNode;
	}
	public Node getPrev(){
		return prevNode;
	}
	protected void setPrev(Node n){
		prevNode = n;
	}
	protected void setNext(Node n){
		nextNode = n;
	}
}