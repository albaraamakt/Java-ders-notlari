package vizeCalismasi;

public class Stack {
	public Node top;
	public int capacity;
	public int size;
	
	public Stack(int capacity) {
		this.capacity = capacity;
		this.size = 0;
	}
	
	//İtme
	public void push(Node node) {
		if (isEmpty()) {
			top = node;
			top.next = null;
		}
		else if (isFull()) {
			System.out.println("Liste doludur.");
			return;
		}
		else {
			node.next = top;
			top = node;
		}
		size++;
	}
	
	//Pop (eleman cikarma)
	public void pop() {
		if (isEmpty()) {
			System.out.println("Liste bostur");
			return;
		}
		else if (size == 1) {
			top = null;
		}
		else {
			top = top.next;
		}
		size--;
	}
	
	//Ekrana yazdirma
	public void display() {
		Node temp = top;
		while (temp.next != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
	
	//Peek
	public Node peek() {
		System.out.println(top.data);
		return top;
	}
	
	//Size
	public int size() {
		System.out.println(size);
		return size;
	}
	
	//Liste bos
	public boolean isEmpty() {
		return top == null;
	}
	
	//Liste dolu
	public boolean isFull() {
		return size == capacity;
	}
}
