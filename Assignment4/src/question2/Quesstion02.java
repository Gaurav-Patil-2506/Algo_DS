package question2;

public class Quesstion02 {
	
public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	Deque deque = new Deque();

    deque.addRear(10);
    deque.addRear(20);
    deque.addFront(5);
    deque.addFront(15);

    System.out.println("Deque elements:");
    deque.display();
    System.out.println("Removed element from front: " + deque.removeFront()); 
    System.out.println("Removed element from rear: " + deque.removeRear()); 

    System.out.println("Front element of deque: " + deque.peekFront()); 
    System.out.println("Rear element of deque: " + deque.peekRear()); 
            
}

}
