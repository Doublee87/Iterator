import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator<Type> implements Iterator<Type> {
	private int pos = 0;
	private int size;
	private Type[] newList;
	ArrayIterator(Type [] list) {

		this.size = list.length;
		this.newList = list;
	}


	public boolean hasNext() {

		return (pos<size);

	}
	public Type next() {
		
		if (hasNext()) {
			// this line skips one number.
			pos++;
			if (hasNext()) {
			
			return newList[pos++];
		} 
		}else {
			throw new NoSuchElementException();
		}
		return null;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}	
}