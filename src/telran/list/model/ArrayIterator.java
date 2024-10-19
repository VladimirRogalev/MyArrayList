package telran.list.model;

import java.util.Iterator;

public class ArrayIterator<E> implements Iterator<E> {
	private int index = 0;
	E[]elements;
	
	public ArrayIterator(E[] elements) {
		this.elements = elements;
	}

	@Override
	public boolean hasNext() {
		return index< elements.length;
	}

	@Override
	public E next() {
		// TODO Auto-generated method stub
		return elements[index++];
	}
	

}
