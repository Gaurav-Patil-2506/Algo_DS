package question1;

import question1.Stack;

public class Question01 {
public static void main(String[] args) {
		
        Stack stack = new Stack();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top : " + stack.peek()); 
        
        System.out.println("Pop : " + stack.pop()); 
        System.out.println("Pop : " + stack.pop()); 

        System.out.println("Is stack empty " + stack.isEmpty()); 
        
        
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Queue elements:");
        queue.display(); 

        System.out.println("Dequeued element: " + queue.dequeue()); 
        System.out.println("Queue elements after dequeue:");
        queue.display(); 

        System.out.println("Front element of queue: " + queue.peek()); 
        
    }
}
