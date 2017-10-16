package linkedlist;

public class SinglylinkedList {
	public Node temp;
	public Node temp2;
	public int i=1;
	public Node head = null;
	
	public void insert_at_head(int value){
		Node newnode = new Node(value);
		
		if
		(head==null)
		{
		
		head=newnode;
		
		}
		else{
		newnode.next=head;
		head=newnode;
}
	}
	public void print() {
		if(head==null){
		System.out.println("Empty list");
		}
		else{
		Node temp=head;
		while (temp!=null)
		{
		System.out.println(temp.data);
		temp=temp.next;
		}
		}
	}
	public void insert_at_tail(int value){
		Node newnode = new Node(value);
		
		if(head == null){
			head = newnode;
		}
		else if(head.next == null)
			 head.next = newnode;
		else {
			temp =head;
		
		while (temp.next != null){
			temp = temp.next;
		}
		}
		
		
	}
	public void insert_at_position(int x , int k){
		Node newnode = new Node(x);
		temp = head;
		
		while(i<k-1){
			i = i+1;
			temp = temp.next;
			
		}
		newnode.next = temp.next;
		temp.next = newnode;
		
}
	public void deletion(int k){
		temp = head;
		if(k==1){
			head = temp.next;
		}
		else {
			i = 1;
			while (i<k-1){
				temp = temp.next;
				i = i+1;
			}
			temp2 = temp.next;
			temp.next = temp2.next;
		}
	}
	
}
