package question3;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST bst = new BST();
		bst.addNode(8);
		bst.addNode(3);
		bst.addNode(10);
		bst.addNode(6);
		bst.addNode(1);
		bst.addNode(14);
		bst.addNode(13);
		bst.addNode(7);
		bst.addNode(4);
			
		bst.preorder();
		bst.deleteNode(8);
		bst.preorder();
	}

}
