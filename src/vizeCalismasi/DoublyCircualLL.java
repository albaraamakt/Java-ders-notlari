package vizeCalismasi;

public class DoublyCircualLL {
	public Node head;
	public Node tail;
	public int size;
	public int capacity;
	
	public DoublyCircualLL(int capacity) {
		this.capacity = capacity;
		this.size = 0;
	}
	
	//Basa ekleme
	public void addHead(Node node) {
		if (head == null) {
			head = tail = node;
		}
		else if (size > capacity) {
			System.out.println("Liste doludur.");
			return;
		}
		else {
			tail.next = head.prev = node;
			node.prev = tail;
			node.next = head;
			head = node;
		}
		size++;
	}
	
	//Sona ekleme
	public void addTail(Node node) {
		if (head == null) {
			head = tail = node;
		}
		else if (size > capacity) {
			System.out.println("Liste doludur.");
			return;
		}
		else {
			tail.next = head.prev = node;
			node.prev = tail;
			node.next = head;
			tail = node;
		}
		size++;
	}
	
	
	//Bastan silme
	public void deleteHead() {
		if (head == null) {
			System.out.println("Liste bostur");
			return;
		}
		else if (size == 2 || size == 1) {
			head = head.next = head.prev = null;
		}
		else {
			head = head.next;
			head.prev = tail;
			tail.next = head;
		}
		size--;
	}
	
	//Ekrana yazdirma
	public void display() {
		if (head != null) {
			Node temp = head;
			while (temp != tail) {
				System.out.print(temp.data + " => ");
				temp = temp.next;
			}
			System.out.println(tail.data);
		}
		else {
			System.out.println("Liste bostur");
			return;
		}
	}
	
	//Arama
	public void find(int data) {
		Node temp = head;
		boolean flag = false;
		for (int i = 0; i < size; i++) {
			if (temp.data == data) {
				System.out.println("LinkedList[" + i + "] = " + data );
				flag = true;
			}
			temp = temp.next;
		}
		
		if (!flag)
			System.out.println(data + " listede bulunmadi");
	}
}
