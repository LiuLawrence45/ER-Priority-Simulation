/**
 * Priority Queue for Patients
 * @author lawrenceliu
 *
 */

import java.util.*;

public class PriorityQueueEdited<E extends Comparable<E>> implements PureQueue<E>{
	
//	private int queue.size() = -1;
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
		else if (queue.size() == 1) {

			E returnto = queue.get(0);
			System.out.println(returnto.toString());
			queue.set(0, null);
			return returnto;
		}
		else {

			E returnto = queue.get(0);
			System.out.println(returnto.toString());
			E temp = queue.get(queue.size()-1);
			//printArray();
			//queue.set(queue.size(), null);
			queue.remove(queue.size()-1);
			queue.set(0,temp);
			
			int current = 0;
			int largestChild = largestChild(current);
			while (largestChild != -1) {
				swap(current,largestChild);
				current = largestChild;
				largestChild = largestChild(current);
				
			}
			return returnto;
			
			
			
			
		}
	}
	
	/**
	 * Return the index of the greatest child with current as the parent
	 * @param current
	 * @return
	 */
	private int largestChild(int current) {
		if(getRight(current) < queue.size() && getLeft(current) < queue.size()) {
			if (getRightVal(current).compareTo(getLeftVal(current)) > 0) {
				return getRight(current);
			}
			return getLeft(current);
		}
		
		else if (getRight(current) < queue.size()) {
			return getRight(current);
		}
		
		else if(getLeft(current) < queue.size()) {
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
		return (current-1)/2;
	}
	private E getParentVal(int current) {
		return queue.get((current-1)/2);
	}


	public void enqueue(E object) {
		if (queue.size() == 0) {
			queue.add(object);
		}
		else {
			queue.add(queue.size(),object);
			int current = queue.size()-1;
			while (queue.get(current).compareTo(getParentVal(current)) > 0) {
				swap(current,getParent(current));
				current = getParent(current);
			}	
		}


		
		
		}

	public E peek() {
		return queue.get(0);
	}

	public boolean isEmpty() {
		return queue.size() == 0;
	}
	

}
