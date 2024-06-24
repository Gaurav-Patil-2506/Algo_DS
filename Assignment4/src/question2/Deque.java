package question2;

public class Deque {
	
	class Node {
	    int data;
	    Node next;
	    Node prev;

	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	        this.prev = null;
	    }
	}
	
    private Node front; 
    private Node rear; 

    public Deque() {
        this.front = null;
        this.rear = null;
    }

   
    public boolean isEmpty() {
        return front == null;
    }

   
    public void addFront(int data) {
        Node newNode = new Node(data);
        
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
    }

    
    public void addRear(int data) {
        Node newNode = new Node(data);
        
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            newNode.prev = rear;
            rear.next = newNode;
            rear = newNode;
        }
    }

   
    public int removeFront() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }

        int removedData = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        } else {
            front.prev = null;
        }

        return removedData;
    }

   
    public int removeRear() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }

        int removedData = rear.data;
        rear = rear.prev;

        if (rear == null) {
            front = null;
        } else {
            rear.next = null;
        }

        return removedData;
    }

   
    public int peekFront() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        return front.data;
    }

    
    public int peekRear() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        return rear.data;
    }

    
    public void display() {
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}