package question2;

public class PriorityQueue {
	
	private Heap h;
	private final int pSIZE;
	public PriorityQueue(int size) {
		pSIZE = size;
		h = new Heap(pSIZE);
	}
	
	public void push(int value) {
		h.addHeap(value);
	}
	
	public int pop() {
		return h.deleteHeap();
	}
	
	public int peek() {
		return h.getMin();
	}
	
	public boolean isEmpty() {
		return h.isEmpty();
	}

	public boolean isFull() {
		return h.isFull();
	}

}
