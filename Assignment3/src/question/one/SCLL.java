package question.one;

public class SCLL {
	static class Node {
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	private Node tail;
	private int count;
	
	public SCLL() {
		tail = null;
		count = 0;
	}
	
	public void addFirst(int value) {
		
		Node newnode = new Node(value);
		
		if(isEmpty()) {
			tail = newnode;
			tail.next = tail;
		}
		else {
			newnode.next = tail.next;
			tail.next = newnode;
		}
	}
	
	public void addLast(int value) {
		
		Node newnode = new Node(value);

		if(isEmpty()) {
			tail = newnode;
			tail.next = tail;
		}
		else {
			newnode.next = tail.next;
			tail.next = newnode;
			tail = newnode;
		}
		count++;
	}
	
	public void deleteFirst() {
		if(isEmpty()) {
			return;
		}
		else if(tail.next == tail) {
			tail = null;
		}
		else {
			tail.next = tail.next.next;
		}
	}
	
	public void deleteLast() {
		if(isEmpty()) {
			tail = null;
		}
		else if(tail.next == tail) {
			tail = null;
		}
		else {
			Node trav = tail.next;
			while (trav.next != tail) {
                trav = trav.next;
            }
			trav.next = tail.next;
			tail = trav;
		}
	}
	
	public  boolean isEmpty() {
		return tail == null;
	}
	
	public boolean search(int data) {
        if (tail == null) {
            return false;
        }
        Node current = tail.next;
        do {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        } while (current != tail.next);
        return false;
    }

	public void display() {
		Node trav = tail.next;
		do {
			System.out.print(trav.data + "->");
			trav = trav.next;
			
		}while(trav != tail.next);
		System.out.println("\n Count : " + count);
	}


}
