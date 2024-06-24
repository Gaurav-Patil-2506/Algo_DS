package question1;

public class BST {
	static class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int value) {
			data = value;
		}

	}

	private Node root;

	public BST() {
		root = null;
	}

	public void addNodeRec(Node trav, int value) {

		if (value < trav.data) {
			if (trav.left == null) {
				trav.left = new Node(value);
				return;
			} else
				addNodeRec(trav.left, value);
		} else {
			if (trav.right == null) {
				trav.right = new Node(value);
				return;
			} else
				addNodeRec(trav.right, value);
		}
	}

	public void addNodeRec(int value) {

		if (isEmpty()) {
			root = new Node(value);
		} else {
			addNodeRec(root, value);
		}
	}

	public void preorder(Node trav) {
		if (trav == null)
			return;
		System.out.print(trav.data + " ");
		preorder(trav.left);
		preorder(trav.right);
	}

	public void preorder() {
		System.out.print("preorder : ");
		preorder(root);
		System.out.println("");
	}

	public boolean isEmpty() {
		return root == null;
	}
}

