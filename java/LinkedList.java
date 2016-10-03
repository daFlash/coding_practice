package linkedlistsonly.basics;

class Node {
	private String data;
	private Node next = null;
	
	Node(String data, Node next) {
		this.data = data;
		this.next = next;
	}
	
	Node(String data){
		this.data = data;
		this.next = null;
	}
	
	public String getData() {
		return this.data;
	}
	
	public Node getNext() {
		return this.next;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public String toString() {
		return data;
	}
}

public class LinkedList {
	
	private static Node list;
	 
	static String getThirdNode(Node list) {
		return list.getNext().getNext().getData();
	}
	
	static void insertSecond(Node list, String data) {
		list.setNext(new Node(data, list.getNext()));
	}
	
	static int getSize(Node list) {
		int count = 0;
		while(list != null) {
			count ++;
			list = list.getNext();
		}
		return count;
	}

	public static void main(String[] args) {
		Node thirdNode = new Node("datainthethirdnode", null);
		Node secondNode = new Node ("datainthesecondnode", thirdNode);
		Node mylist = new Node("datainthefirstnode", secondNode);
		System.out.println(mylist.getData());
		System.out.println(mylist.getNext().getData());
		System.out.println(getThirdNode(mylist));
		insertSecond(mylist, "newdata");
		System.out.println(mylist.getNext().toString());
		System.out.println("Length of the list is " + getSize(mylist));
	}

}
