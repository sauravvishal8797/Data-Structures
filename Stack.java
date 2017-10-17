package LinkedList;

public class Stack {
	SinglyLinkedList s1=new SinglyLinkedList();
	public void push(int x)
	{
		s1.insert_At_Tail(x);
	}
	public void pop()
	{
		int temp =s1.no_Nodes();		
		s1.delete_At_Position(temp);
	}
	public int get_top()
	{
		Node temp=s1.head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		return temp.data;
	}
	public void print()
	{
		s1.print();
	}
	public boolean IsEmpty()
	{
		if(s1.no_Nodes()==0)
		{
			return true;
		}else
		{
			return false;
		}
	}
	

}
