package question1;

public class Queue {
	
	static class Node {
	    int data;
	    Node next;

	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}
	
	private Node front; 
    private Node rear;  

    public Queue() {
        this.front = null;
        this.rear = null;
    }

   
    public boolean isEmpty() {
        return front == null;
    }

  
    public void enqueue(int data) {
        Node newNode = new Node(data);
        
       
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
           
            rear.next = newNode;
            rear = newNode;
        }
    }

    
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        int dequeuedData = front.data;
        front = front.next;

       
        if (front == null) {
            rear = null;
        }

        return dequeuedData;
    }

   
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return front.data;
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