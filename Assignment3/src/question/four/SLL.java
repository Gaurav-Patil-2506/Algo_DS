package question.four;

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

	public void insertInSortedOrder(int data) {
        Node newNode = new Node(data);

        if (IsEmpty() || head.data >= data) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data < data) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }


	public void display() {
		Node trav = head;
		System.out.print("List :: ");
		while (trav != null) {
			System.out.print(trav.data + "->");
			trav = trav.next;
		}
	}
}
