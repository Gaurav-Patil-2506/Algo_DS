package question.three;

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
	
	public void reverse(Node trav) {
		if(trav == null) return;
		reverse(trav.next);
		System.out.print(trav.data + "->");
	}
	public void DisplayReverse() {
		System.out.print("Reve :: ");
		Node trav = head;
		reverse(trav);
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
