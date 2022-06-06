package linkedList;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class LRUCache {
	public int i;
	public  int capacity;
	Set<Integer> set;
	public LRUCache(int i) {
		this.capacity=i;
		set= new LinkedHashSet<Integer>(capacity);
	}

	public static void main(String[] args) {
		
		 LRUCache ca = new LRUCache(4);
	        ca.refer(1);
	        ca.refer(2);
	        ca.refer(3);
	        ca.refer(1);
	        ca.refer(4);
	        ca.refer(5);
	        ca.refer(6);
	        ca.display();
	}

	private void display() {
		 
		      LinkedList<Integer> list = new LinkedList<>(set);
		         Iterator<Integer> itr = list.descendingIterator();
		       
		      while (itr.hasNext())
		            System.out.print(itr.next() + " ");
		    
	}

	private void refer(int j) {
		
		if(get(j)==false)
			put(j);
			
	
		
	}
	private void put(int j) {
		if (set.size() == capacity) {
            int firstKey = set.iterator().next();
            set.remove(firstKey);
        }
 
        set.add(j);
	}

	private boolean get(int j) {
		if(set.contains(j))
		{	set.remove(j);
			set.add(j);
			return true;
		}else
			return false;
	}
}
