package question.two;

public class SLL {
	static class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node head;
	private int count;

	public SLL() {
		head = null;
		count = 0;

	}

	public boolean IsEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);
		newnode.next = head;
		head = newnode;
		count++;
	}

	public void addLast(int value) {
		Node newnode = new Node(value);
		if (IsEmpty())
			head = newnode;
		else {
			Node trav = head;
			while (trav.next != null)
				trav = trav.next;
			trav.next = newnode;
		}
		count++;
	}
	
	public void addAfter(int value, int after) {
		Node trav = head;
		while(trav != null && trav.data != after) {
			trav = trav.next;
		}
		if(trav == null) System.out.println("Node not found");
		else {
			Node newnode = new Node(value);
			newnode.next = trav.next;
			trav.next = newnode;
			count++;
		}
	}
	
	
	public void addBefore(int value, int before) {
		
		if (head == null) {
            System.out.println("List is empty.");
            return;
        }
		
		if (head.data == before) {
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
            return;
        }
		
		Node trav = head;
		while(trav.next != null && trav.next.data != before) {
			trav = trav.next;
		}
		if (trav.next == null) {
        } else {
            Node newNode = new Node(value);
            newNode.next = trav.next;
            trav.next = newNode;
        }
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	public void display() {
		Node trav = head;
		System.out.print("List :: ");
		while (trav != null) {
			System.out.print(trav.data + "->");
			trav = trav.next;
		}
		System.out.println("\nCount : " + count);
	}
}
