import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Driver {

	public static void demonstrate(LinkedList list, ListIterator iterator){
		if(iterator.hasNext()){
			iterator.next();
			iterator.next();
			System.out.println("Moved forward 2");
		}
		if(iterator.hasNext())
			System.out.println("Iterator location: " + iterator.getPrev() + " | " + iterator.getNext());
		if(iterator.hasPrev()){
			iterator.previous();
			System.out.println("Moved backward 1");
		}
		System.out.println("New iterator location: " + iterator.getPrev() + " | " + iterator.getNext());
		System.out.println("Removed: " + iterator.remove());
		
		iterator.set("SET");
		System.out.println("After Set: \t" +  list);

		list.removeLast();

		System.out.println("Remove Last: \t" + list);

		if(iterator.hasNext())
			System.out.println("Iterator location: " +  iterator.getPrev() + " | " + iterator.getNext());
	}
	public static DoublyLinkedList importArr(){
		DoublyLinkedList list = null;
		 try{
	            Scanner reader = new Scanner(new File("db.txt"));
	            reader.useDelimiter(" ");
	            list = new DoublyLinkedList(new Node(reader.next()));
	        
	             while(reader.hasNext()){
	            	 list.add(reader.next());
	             }
	        }
	        catch(IOException e){
	            System.out.println("Unable to read file. " + e.getMessage());
	        }
	    return list;
	}
	public static void main(String[] args) {
		DoublyLinkedList list = importArr();
		DoublyListIterator iterator = new DoublyListIterator(list);

		System.out.println("List:\t" + list);

		demonstrate(list, iterator);
	}
}