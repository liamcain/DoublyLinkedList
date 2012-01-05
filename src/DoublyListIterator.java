public class DoublyListIterator extends ListIterator {
	
	public DoublyListIterator(DoublyLinkedList list){
		super(list);
	}
	public Object previous(){
		Node prev = super.getPrev();
		Node nextPrev = ((DoubleNode)prev).getPrev();
		super.setPrev(nextPrev);
		super.setNext(prev);
		return super.getPrev();
	}
}