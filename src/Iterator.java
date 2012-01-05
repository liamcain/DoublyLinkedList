public interface Iterator {
	public Object next(); //advances the Iterator and returns next
	public Object previous();//digresses the Iterator and returns prev
	public Object remove();
	public boolean remove(Object o);
	public boolean set(Object o);
	public Object getNext();//returns the next Obj (does not advance)
	public Object getPrev();//returns the prev Obj (does not digress)
	public boolean hasNext();
	public boolean hasPrev();
}
