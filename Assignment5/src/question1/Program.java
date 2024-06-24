package question1;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST bst = new BST();
		bst.addNodeRec(8);
		bst.addNodeRec(3);
		bst.addNodeRec(10);
		bst.addNodeRec(6);
		bst.addNodeRec(1);
		bst.addNodeRec(14);
		bst.addNodeRec(13);
		bst.addNodeRec(7);
		bst.addNodeRec(4);
			
		bst.preorder();
	}

}
