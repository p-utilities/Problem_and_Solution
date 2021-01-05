package dynamicArrayImpl;

import java.util.Iterator;

@SuppressWarnings("unchecked")
public class DynamicArrayImpl<T> {
	private T staticArray[];
	private int capacity;
	private int len;
	private DynamicArrayImpl<T> helper;
	
	public DynamicArrayImpl(){
		this(16);
	}
	
	public DynamicArrayImpl(int initCapacity) {
		if(initCapacity < 0) throw new IllegalArgumentException("Illegal capacity : " + initCapacity);
		capacity = initCapacity;
		len = 0;
		staticArray = (T[]) new Object[initCapacity];
	}
	
	public DynamicArrayImpl(T[] inputArray) {
		if(inputArray == null) throw new NullPointerException();
		staticArray = inputArray;
		len = inputArray.length;
		capacity = len - 1;
	}
	
	//add, replace, get, delete, iterator, toString
	
	public void add(T element) {
		if (len > capacity+1) {
			if(capacity == 0) capacity = 1;
			else capacity *= 2;
			helper = new DynamicArrayImpl<T>(capacity);
			for(T el: staticArray)
				helper.add(el);
			staticArray = helper.staticArray;
		}
		staticArray[len] = element;
		len++;
	}
	
	public void replace(int index, T element) {
		if(index < 0 || index > len - 1) throw new IllegalArgumentException();
		staticArray[index] = element;
	}
	
	public T getAt(int index) {
		if(index < 0 || index > len - 1) throw new IllegalArgumentException();
		return staticArray[index];
	}
	
	public int indexOf(T element) {
		for(int i = 0; i < len; i++)
			if(element.equals(staticArray[i]))
				return i;
		return -1;
	}
	
	public boolean remove(T element) {
		for(int i = 0; i < len; i++)
			if(staticArray[i].equals(element)) {
				removeAt(i);
				return true;
			}
		return false;
	}
	
	public void removeAt(int index) {
		if(index < 0 || index >= len) throw new IllegalArgumentException();
		helper = new DynamicArrayImpl<>(capacity);
		for(int i = 0; i < len; i++)
			if(i != index)
				helper.add(staticArray[i]);
		staticArray = helper.staticArray;
		len--;
	}
	
	public void clear() {
		capacity = 0;
		len = 0;
	}
	
	public int getSize() {
		return len;
	}
	
	public Iterator<T> getIterator() {
		return new Iterator<T>() {
			int pointer = 0;
			
			@Override
			public boolean hasNext() {
				if(pointer < len)
					return true;
				return false;
			}

			@Override
			public T next() {
				if(pointer < len)
					return staticArray[pointer++];
				else
					throw new NullPointerException();
			}
		};
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.hashCode() + " [");
		for(T element: staticArray)
			builder.append(element + ", ");
		builder.delete(builder.length()-2, builder.length());
		builder.append("]");
		return builder.toString();
	}
	
	public static void main(String[] args) {
		var aaa = new DynamicArrayImpl<String>(new String[] {"bab", "aa"});
		aaa.add("aaa");
		aaa.add("aaa");
		aaa.add("aaa");
		aaa.add("aaa");
		System.out.println(aaa);
		System.out.println("Build finished");
	}
	
	
}
