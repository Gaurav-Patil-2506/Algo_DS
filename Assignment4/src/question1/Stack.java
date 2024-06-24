package question1;


public class Stack {
	
		static class Node {
	    int value;
	    Node next;

	    public Node(int value) {
	        this.value = value;
	        this.next = null;
	    }
	}
	    private Node top;  // Top of the stack

	    public Stack() {
	        this.top = null;
	    }

	    public boolean isEmpty() {
	        return top == null;
	    }

	    public void push(int value) {
	        Node newNode = new Node(value);
	        newNode.next = top;
	        top = newNode;
	    }

	    public int pop() {
	        if (isEmpty()) {
	            System.out.println("Stack is Empty");
	        }
	        int poppedValue = top.value;
	        top = top.next;
	        return poppedValue;
	    }

	    public int peek() {
	        if (isEmpty()) {
	        	System.out.println("Stack is Empty");
	        }
	        return top.value;
	    }
	}



