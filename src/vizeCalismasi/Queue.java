package vizeCalismasi;

public class Queue {
	public Node rear;
	public Node front;
	public int capacity;
	public int size;
	
	public Queue(int capacity) {
		this.capacity = capacity;
		this.size = 0;
	}
	
	//Eleman ekleme
	public void enqueue(Node node) {
		if (isEmpty()) {
			front = rear = node;
		}
		else if (isFull()) {
			System.out.println("Liste doludur");
		}
		else {
			rear.next = node;
			rear = node;
		}
		size++;
	}
	
	//Eleman cikarma
	public void dequeue() {
		if (isEmpty()) {
			System.out.println("Liste bostur");
			return;
		}
		else if (front == rear) {
			front = rear = null;
		}
		else {
			front = front.next;
		}
		size--;
	}
	
	//Ekrana yazdirma
	public void display() {
		if (!isEmpty()) {
			Node temp = front;
			while (temp != rear) {
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
		else {
			System.out.println("Liste bostur");
		}
	}
	
	//Returning front
	public Node peek() {
		System.out.println(front.data);
		return front;
	}
	
	//Bos liste
	public boolean isEmpty() {
		return front == null;
	}
	
	//Bos liste
	public boolean isFull() {
		return size == capacity;
	}
}
