/**
 * Priority Queue for Patients
 * @author lawrenceliu
 *
 */

import java.util.*;

public class PriorityQueue<E extends Comparable<E>> implements PureQueue<E>{
	
	private int count = -1;
	private ArrayList<E> queue = new ArrayList<E>();
	
	
	public void printArray() {
		System.out.println(Arrays.toString(queue.toArray()));
	}
	
	/**
	 * Dequeue value from root
	 * @return E
	 */
	public E dequeue() {
		
		if (isEmpty()) {
			throw new NoSuchElementException("Queue is empty");
			
		}
		else if (count == 0) {
			E returnto = queue.get(0);
			queue.set(0, null);
			count--;
			return returnto;
		}
		else {

			E returnto = queue.get(0);
			E temp = queue.get(count);
			//printArray();
			queue.set(count, null);
			queue.set(0,temp);
			
			int current = 0;
			int largestChild = largestChild(current);
			while (largestChild != -1) {
				swap(current,largestChild);
				current = largestChild;
				largestChild = largestChild(current);
				
			}
			count--;
			return returnto;
			
			
			
			
		}
	}
	
	/**
	 * Return the index of the greatest child with current as the parent
	 * @param current
	 * @return
	 */
	private int largestChild(int current) {
		if(getRight(current) < count && getLeft(current) < count) {
			if (getRightVal(current).compareTo(getLeftVal(current)) > 0) {
				return getRight(current);
			}
			return getLeft(current);
		}
		
		else if (getRight(current) <count) {
			return getRight(current);
		}
		
		else if(getLeft(current) < count) {
			return getLeft(current);
		}
		else {
			return -1;
		}
	}

	/**
	 * Swap two indices
	 * @param one
	 * @param two
	 */
	private void swap(int one, int two) {
		E temp = queue.get(one);
		queue.set(one, queue.get(two));
		queue.set(two, temp);
	}

	private int getRight(int current) {
		return (current*2+2);
	}
	private int getLeft(int current) {
		return (current*2+1);
	}
	
	private E getRightVal(int current) {
		return queue.get(current*2+2);
	}
	private E getLeftVal(int current) {
		return queue.get(current*2+1);
	}
	
	private int getParent(int current) {
		return current/2;
	}
	private E getParentVal(int current) {
		return queue.get(current/2);
	}


	public void enqueue(E object) {
			count++;
			queue.add(count,object);
			int current = count;
			while (queue.get(current).compareTo(getParentVal(current)) > 0) {
				swap(current,getParent(current));
				current = getParent(current);
			}	

		
		
		}

	public E peek() {
		return queue.get(0);
	}

	public boolean isEmpty() {
		return count == -1;
	}
	

}
