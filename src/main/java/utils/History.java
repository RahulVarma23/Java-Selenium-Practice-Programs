package utils;

import java.util.ArrayDeque;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * This class is for saving entity at some point and then clearing by calling a clear method and proving Consumer,
 * example usage History<MyObject> history = new History(); myObject = makePostRequest(someData);
 * history.add(myObject); ... running some tests; history.clear();
 * @param <T> definition of type that will be stored in History
 */
public class History<T> {

	private final ArrayDeque<T> deque;

	public History() {
		deque = new ArrayDeque<>();
	}

	public void add(T entity) {
		deque.add(entity);
	}

	public void addAll(List<T> entities) {
		deque.addAll(entities);
	}

	//

	/**
	 * Clear history using consumer function
	 * @param function desired actions that should be performed while clearing deque
	 */
	public void clear(Consumer<T> function) {
		T entity;
		while((entity = this.poll()) != null) {
			function.accept(entity);
		}
	}

	public T poll() {
		return deque.pollFirst();
	}

	public void remove(T entity) {
		this.deque.remove(entity);
	}
}
