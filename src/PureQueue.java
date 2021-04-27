/**
 * PureQueue interface
 * @author lawrenceliu
 *
 * @param <E>
 */

public interface PureQueue<E> {
	
	/**
	 * 
	 * @return object removed from queue
	 */
	E dequeue();
	
	/**
	 * add an object to the queue
	 * @param object
	 */
	void enqueue(E object);
	
	/**
	 * 
	 * @return top object in the queue
	 */
	E peek();
	
	/**
	 * 
	 * @return queue empty or not
	 */
	boolean isEmpty();
	
}
