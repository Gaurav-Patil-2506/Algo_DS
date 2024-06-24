package question.one;

public class Question1 {

	public static void main(String[] args) {
		
		SCLL ll = new SCLL();
		ll.addLast(30);
		ll.addLast(20);
		ll.addLast(10);
		ll.addFirst(40);
		ll.deleteFirst();
		ll.deleteLast();

		ll.display();

	}

}
