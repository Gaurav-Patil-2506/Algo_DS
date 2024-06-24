package question2;


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

	
	
	public boolean search(int data) {
        return searchRecursive(root, data);
    }

    public boolean searchRecursive(Node node, int data) {
        if (node == null) {
            return false;
        }
        if (data == node.data) {
            return true;
        }
        return data < node.data ? searchRecursive(node.left, data) : searchRecursive(node.right, data);
    }

	public boolean isEmpty() {
		return root == null;
	}
}

