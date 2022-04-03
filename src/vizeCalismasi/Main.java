package vizeCalismasi;

public class Main {

	public static void main(String[] args) {
		Queue list = new Queue(10);
		
		list.enqueue(new Node(1));
		list.enqueue(new Node(2));
		list.enqueue(new Node(3));
		list.enqueue(new Node(4));
		
		list.display();
		list.peek();
		
		list.dequeue();
		list.display();
		list.peek();
		
		list.dequeue();
		list.display();
		list.peek();
		
		list.dequeue();
		list.display();
		list.peek();
		
		list.dequeue();
		list.display();
		
		
		
	}
}
