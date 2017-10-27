/*
 * Implementation of Singly Linked List
 */

public class SingleLinkedList<T extends Comparable<T>> {
	private Node<T> head;
	private int size;

	public SingleLinkedList() {
		head = null;
		size = 0;
	}

	//add new node to list
	public void insert(T x) {
		head = new Node(x, head);
		size++;
	}

	//insert node at a certain position
	public void insert(T x, int index) {
		if (index == 1) {
			insert(x);
		} else {
			Node tmp = getNode(index);
			Node newNode = new Node(x, tmp.getNext());
			tmp.setNext(newNode);
		}
		size++;
	}

	//replace node value
	public void replace(T x, int index) {
		getNode(index).setValue(x);
	}

	//get node value
	public T getValue(int index) {
		return getNode(index).getValue();
	}

	//get node from list at index position
	private Node<T> getNode(int index) {
		if (index > size)
			throw new IllegalArgumentException(
					"The index [" + index + "] is greater than the current list size [" + size + "].");

		Node current = head;
		for (int i = 1; i < index; i++) {
			current = current.getNext();
		}

		return current;
	}

	//delete node from list
	public void delete(int index) {
		Node tmp = head;
		if (index == 0) {
			head = tmp.getNext();
		} else {
			tmp = getNode(index);
			tmp.setNext(tmp.getNext().getNext());
		}
		size--;
	}

	public int getSize() {
		return size;
	}
	
	public Node getHead() {
		return head;
	}

	@Override
	public String toString() {
		Node<T> tmp = head;
		StringBuilder str = new StringBuilder();
		while (tmp != null) {
			str.append(tmp.getValue());
			tmp = tmp.getNext();
			if (tmp != null)
				str.append(", ");
		}
		return new String(str);
	}

	//Merge sort algorithm
	private Node sortedMerge(Node a, Node b) {
		Node result = null;

		if (a == null)
			return b;
		if (b == null)
			return a;

		if (a.getValue().compareTo(b.getValue()) < 0) {
			result = a;
			result.setNext(sortedMerge(a.getNext(), b));
		} else {
			result = b;
			result.setNext(sortedMerge(a, b.getNext()));
		}
		return result;
	}

	private Node getMiddle(Node head){
	    Node middle, fast;
	    middle = fast = head;

	    while (fast != null && fast.getNext() != null && fast.getNext().getNext() != null) {
	        middle = middle.getNext();
	        fast = fast.getNext().getNext();
	    }
	    return middle;
	}
	
	public Node mergeSort(Node head) {
		if (head == null || head.getNext() == null) {
			return head;
		}

		Node middle = getMiddle(head);
		Node first = head;
		Node second = middle.getNext();
		middle.setNext(null);
		
		Node left = mergeSort(first);
		Node right = mergeSort(second);

		return sortedMerge(left, right);
	}
	
	public void sort(){
		head = mergeSort(head);
	}

	//concatenation two lists, result is in first list
	public void addAll(SingleLinkedList list2){
		Node tail = getNode(size);
		tail.setNext(list2.getHead());
		size += list2.getSize();
	}
}


//for purpose of sorting T must extend Comparable
class Node<T extends Comparable<T>> {
	private T value;
	private Node next;
	
	public Node(T val, Node n) {
		value = val;
		next = n;
	}
	
	public T getValue() {
		return value;
	}
	
	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public void setValue(T value) {
		this.value = value;
	}
}


public class Test {

	public static void main(String[] args) {
		 SingleLinkedList<String> list1 = new SingleLinkedList<>();
		 SingleLinkedList<String> list2 = new SingleLinkedList<>();
		 list1.insert("aaa"); 
		 list1.insert("baa");
		 list1.insert("aga");
		 list1.insert("aat");
		 list2.insert("a1a");
		 list2.insert("aDa");
		 list2.insert("acv");
		 list2.insert("456");
		 
		 list1.addAll(list2);
		 list1.sort();
		 
		 System.out.println(list1);
	}
}
