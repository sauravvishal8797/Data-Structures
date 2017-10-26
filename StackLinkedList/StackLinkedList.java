public class StackLinkedList
{
	private Node top=null;
	public boolean isEmpty()
	{
		if(top==null)
			return true;
		else
			return false;
	}
	public void push(int x)
	{
		Node newtop=new Node(x);
		if(top==null)
		{
			top=newtop;
		}
		else
		{
			newtop.next=top;
			top=newtop;
		}
	}
	public void pop()
	{
		if(top==null)
		{
			System.out.println("Stack Empty");
		}
		else
		{
			top=top.next;
		}
	}
	public int peek()
	{
		if(top==null)
		{
			System.out.println("Stack Empty");
			return 0;
		}
		else
		{
			return top.data;
		}
	}
	public void print()
	{
		if(top==null)
		{
			System.out.println("Stack Empty");
			
		}
		else{
		Node temp=top;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
		}
	}
}
