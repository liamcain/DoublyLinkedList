public class DoublyLinkedList extends LinkedList {

	public DoublyLinkedList(Object obj){
		super(new DoubleNode(obj));
	}
	public void add(Object obj){
		DoubleNode newNode = new DoubleNode(obj);
		newNode.setPrev(getLast());
		super.add((Node)newNode);
	}
}