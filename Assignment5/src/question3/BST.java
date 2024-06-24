package question3;



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

	public void addNode(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			root = newnode;
		}

		else {

			Node trav = root;
			while (true) {

				if (value < trav.data) {
					if (trav.left == null) {
						trav.left = newnode;
						break;
					} else
						trav = trav.left;
				} else {
					if (trav.right == null) {
						trav.right = newnode;
						break;
					} else
						trav = trav.right;
				}
			}
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
	
	public Node binarySearch(int key) {
		Node trav = root;
		
		while(trav != null) {
			if(key == trav.data) return trav;
			else if(key < trav.data) trav = trav.left;
			else trav = trav.right;
		}
		return null;
	}
	
	public Node[] binarySearchWithParent(int key) {
		
		Node trav = root;
		Node parent = null;
		while(trav != null) {
			
			if(key == trav.data) {
				break;
			}
			parent = trav;
			
			if(key < trav.data) {
				trav = trav.left;
			}
			else {
				trav = trav.right;
			}
			
		}
		if(trav == null) {
			parent = null;
		}
		
		return new Node[] {trav, parent} ;
		
	}
	
	public void deleteNode(int key) {
		
		Node[] arr = binarySearchWithParent(key);
		Node temp = arr[0], parent = arr[1];
		
		//code for finding predeccessor 
//		if(temp.left != null && temp.right != null) {
//			
//			Node pred = temp.left;
//			parent = temp;
//			while(pred.right != null) {
//				parent = pred;
//				pred = pred.right;
//			}
//			temp.data = pred.data;
//			temp = pred;
//		}
//		
		//code for finding successor
		if(temp.left != null && temp.right != null) {
			Node succ = temp.right;
			parent = temp;
			while(succ.left != null) {
				parent = succ;
				succ = succ.left;
			}
			temp.data = succ.data;
			temp = succ;
		}
		
		if(temp.left == null) {
			if(temp == root) {
				root = temp.right;
			}
			else if(temp == parent.left) {
				parent.left = temp.right;
			}
			else {	// temp == prarent.right
				parent.right = temp.right;
			}
		}
		
		if(temp.right == null) {
			if(temp == root) {
				root = temp.left;
			}
			else if(temp == parent.left) {
				parent.left = temp.left;
			}
			else if(temp == parent.right) {
				parent.right = temp.left;
			}
		}
		
	}

	public boolean isEmpty() {
		return root == null;
	}
}
