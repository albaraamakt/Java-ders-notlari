package vizeCalismasi;

public class Main {

	public static void main(String[] args) {
		DoublyCircualLL list = new DoublyCircualLL(10);
		
		list.addHead(new Node(4));
		
		list.deleteHead();
		
		list.display();
		
		System.out.println(list.tail);
	}

}
