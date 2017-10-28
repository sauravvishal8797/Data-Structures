import java.util.Scanner;

class Node
{
	private int data;
	private Node prev, next;
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public Node getPrev() {
		return prev;
	}
	
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
}

class LinkedList
{
	
	private Node start;
	private Node end;
	private int size;
	
	public Node getStart() {
		return start;
	}
	
	public void setStart(Node start) {
		this.start = start;
	}
	
	public Node getEnd() {
		return end;
	}
	
	public void setEnd(Node end) {
		this.end = end;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public boolean isEmpty() {

		return start==null;
	}
	
	public void insertAtStart(int data){
		
		Node node = new Node();
		node.setData(data);
		//if empty
		if(isEmpty())
		{
			node.setNext(null);
			node.setPrev(null);
			this.setEnd(node);
			this.setStart(node);
		}
		
		//if not empty
		else
		{
			
			node.setPrev(null);
			node.setNext(this.start);
			this.start.setPrev(node);
		}
		
		start = node;
		size++;
		
	}
	public void insertAtEnd(int data){
		
		Node node = new Node();
		node.setData(data);
		
		//if empty
		if(isEmpty()){
			node.setNext(null);
			node.setPrev(null);
			this.setEnd(node);
			this.setStart(node);
			
		}
		//not empty
		else
		{
			node.setNext(null);
			node.setPrev(this.end.getPrev());
			this.end.setNext(node);
		}		
		end=node;
		size++;	
		
	}
	public void insertAfterPosition(int data, int position){
		
		if(position > size){
			
			System.out.println("Invalid position");
			return;
		}
		if(position==1){
			insertAtStart(data);
			return;
		}
		
		Node tempStart = this.start;
		
		for(int i=2;i<=size;i++) {
			
			if(i==position){
				
				Node node = new Node();
				node.setData(data);
				node.setNext(tempStart.getNext());
				node.setPrev(tempStart);
				tempStart.setNext(node);
				
			}
			tempStart = tempStart.getNext();
			
		}
		size++;
	}
	public void deleteAtPosition(int position){
		
		if(position == 1){
			if(size==1){
				start=null;
				end=null;
				size=0;
				return;
			}
			start = start.getNext();
			start.setPrev(null);
			size--;
		}
		else{
			
			Node tempStart = this.start.getNext();
			for(int i=2;i<=size;i++){
				
				if(i==position){
					
					Node prev = tempStart.getPrev();
					Node next = tempStart.getNext();
					prev.setNext(next);
					next.setPrev(prev);
					size--;
				}
				tempStart = tempStart.getNext();
			}
		}
		
		
	}
	public void display(){
		
		Node node = start;
		System.out.print(node.getData());
		while(node.getNext()!=null){
			
			node = node.getNext();
			System.out.print("->"+node.getData());
			
		}
		
	}
	
}

public class DoubleLinkedList {

	public static void main(String[] args) {
		
		System.out.println("Double Linked List operations");
		LinkedList list = new LinkedList();
		
		Scanner scanner = new Scanner(System.in);
		char ch;
		
		do
		{
		
			System.out.println("Double Linked List operations");
			System.out.println("1 for insert at beginning");
			System.out.println("2 for insert at end");
			System.out.println("3 for insert at position");
			System.out.println("4 for delete at position");
			System.out.println("5 for display");
			
			int choice = scanner.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter integer element to insert");
				list.insertAtStart(scanner.nextInt());
				break;
			case 2:
				System.out.println("Enter integer element to insert");
				list.insertAtEnd(scanner.nextInt());
				break;
			case 3:
				System.out.println("Enter integer element to insert");
				int num = scanner.nextInt();
				System.out.println("Enter position to insert");
				int pos = scanner.nextInt();
				list.insertAfterPosition(num, pos);
				break;
			case 4:
				System.out.println("Enter position to delete");
				int position = scanner.nextInt();
				list.deleteAtPosition(position);
				break;
			case 5:
				list.display();
				break;
			default:
					System.out.println("Wrong Entry");
					break;
			}
			
			System.out.println("Do you want to continue Type(Y or N)");
			
			ch = (char) scanner.next().charAt(0);
			
		}while(ch=='Y'||ch=='y');
	}

}
