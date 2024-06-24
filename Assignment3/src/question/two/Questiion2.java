package question.two;

//2. In singly linear list implement following operations. i. insert a new node after a given node ii. insert a
//new node before a given node

public class Questiion2 {


		public static void main(String[] args) {
			
			SLL ll = new SLL();
			ll.addFirst(40);
			ll.addFirst(30);
			ll.addFirst(20);
			ll.addFirst(10);
			ll.addAfter(100, 30);
			ll.addBefore(200, 20);
			ll.display();

		}

}
