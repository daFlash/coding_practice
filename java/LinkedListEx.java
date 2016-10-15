package customlists;

class LinkedList {
	private Node node;

	private static class Node {
		private int data;
		
		private Node next = null;

		Node(int data) {
			this.data = data;
		}
		public void setNext(Node next) {
			this.next = next;
		}
	}

	public void add(int value) {
		Node newNode = new Node(value);
		if (node == null) {
			node = newNode;
		} else {
			Node temp = node;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	public void loopListWithNode(int value) {
		Node newNode = new Node(value);
		newNode.next = newNode;
		if (node == null) {
			node = newNode;
		} else {
			Node temp = node;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	public void display(Node node) {
		Node temp = node;
		System.out.print("[ ");
		while (temp != null) {
			System.out.format("%d ", temp.data);
			temp = temp.next;
		}
		System.out.print("]");
	}
	
	public Node getHead() {
		return node;
	}
	
	public void reverse(Node currentNode) {
		Node previousNode = null;
		Node nextNode;
		while(currentNode != null) {
			nextNode = currentNode.next;
			currentNode.next = previousNode;
			// Progress forward
			previousNode = currentNode;
			currentNode = nextNode;
		}
		display(previousNode);
	}
	
	public boolean doesLoopExist(Node node) {
		Node slow = node;
		Node fast = node;
		if (node == null) return false;
		while(slow.next != null && fast.next.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return true;
			}
		}
		return false;
	}
}

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(6);
		l.add(7);
		l.add(30);
		l.display(l.getHead());
		l.reverse(l.getHead()); // Gives back reversed list
		System.out.println(l.doesLoopExist(l.getHead()));
		l.loopListWithNode(100000);
		System.out.println(l.doesLoopExist(l.getHead()));
	}

}
