package question2;

public class Program {
	
	public static void main(String[] args) {

		PriorityQueue q = new PriorityQueue(9);
		
		
		q.push(6);
		q.push(14);
		q.push(3);
		q.push(26);
		q.push(2);
		
		System.out.println("Peeked data : " + q.peek());
		System.out.println("Poped data : " + q.pop());
		System.out.println("Peeked data : " + q.peek());
	}
}
