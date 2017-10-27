class MergeLL
{

	// Node class which has data and address of next node
	class Node
	{
		int data;
		Node next;
	}

	// method to merge two linked lists
	// it returns root of the merged linked list
	public Node merge(Node a,Node b)
	{
		Node temp=a;
		while(temp.next!=null)
		{
			temp=temp.next;
		}

		temp.next=b;
		return a;
	}

}