package LinkedList;

public class SinglyLinkedList {
	public Node head=null;
	public void insert_At_Head(int value) {
		Node newnode=new Node(value);
		if(head==null)
		{
			head=newnode;
		}else
		{
			newnode.next=head;
			head=newnode;
		}
		
	}
	public void insert_At_Tail(int value) {
		Node newnode= new Node(value);
		if(head==null)
		{
			head=newnode;
		}else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newnode;	
		}
	}
	public void insert_At_Position(int value,int k)
	{
		Node newnode=new Node(value);
		Node temp=head;
		if(k==1)
		{
			newnode.next=head;
			head=newnode;
		}else
		{
			int i=1;
			while(i<k-1)
			{
				if(temp.next==null)
				{
					System.out.println("Can't insert at this position");
					return;
				}
				//System.out.println("hello");
				temp=temp.next;
				i++;
				
			}
			newnode.next=temp.next;
			temp.next=newnode;
		}
		
	}
	public void delete_At_Position(int k)
	{
		if(k>0)
		{
		Node temp=head;
		int i=1;
		if(k==1)//deleting head
		{
			head=temp.next;
		}
		while(i<k-1)
		{
			temp=temp.next;
			i++;
		}
		temp.next=temp.next.next;
		}else
		{
			System.out.println("enter a positive index");
			return;
		}
	}
	public int no_Nodes()
	{
		int count=1;
		if(head==null)
		{
			System.out.println("0");
		}else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				count=count+1;
				temp=temp.next;
			}
			//System.out.println("No of nodes:"+count);
			
		}
		return count;
	}
	public void changeData(Node x,int value)
	{
		if(head==null)
		{
			System.out.println("list is empty");
		}else
		{
			Node temp= head;
			while(temp.next!=null)
			{
				if(temp==x)
				{
					
				}
			}
		}
	}
	public void search(int value)
	{
		int count=1;
		Node temp=head;
		if(head.data==value)
		{
			System.out.println("1");
		}else
		{
			while(temp.next!=null)
			{
				if(temp.data==value)
				{
					System.out.println("The value is at pos:"+count);
				}
				count++;
				temp=temp.next;
				
			}if(temp.data==value)
			{
				System.out.println("The value is at pos:"+count);
			}
		}

	}
	public void shift_Max()
	{
		Node temp =head;
		//Node maximum=head;
		int max=head.data;
		while(temp.next!=null)
		{
			temp=temp.next;
			if(temp.data>max)
			{
				max=temp.data;
				//maximum=temp;				
			}
		}
		if(temp.data>max)
		{
			max=temp.data;
		}
		System.out.println(max);
		temp=head;
		while(temp.next.data!=max)
		{
			temp=temp.next;
		}
		Node newnode= new Node(max);
		Node temp1=head;
		while(temp1.next!=null)
		{
			temp1=temp1.next;
		}
		temp1.next=newnode;	
		temp.next=temp.next.next;
	}
	public void sum()
	{
		int sum =0;
		Node temp=head;
		while(temp.next!=null)
		{
			sum =sum+temp.data;
			temp=temp.next;
		}
		sum=sum+temp.data;
		System.out.println("The sum of elements of linked list :"+sum);
	}
	public void  concat(SinglyLinkedList s2)
	{
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=s2.head;
	}
	public void print()
	{
		if(head==null)
		{
			System.out.println("Empty list");
			return;
		}else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println(temp.data);
		}
	}
	public void delete_Even()
	{
		int i=2;
		Node temp=head;
		while(temp!=null)
		{
			
			{
				delete_At_Position(i);
			}	
			i++;
			temp=temp.next;
		}
	}
	
	

}
