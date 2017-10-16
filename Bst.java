public class Bst
{
	public Node head = new Node();

	public void insert(int l,Node n)
	{
		if(n == head && head.data == -1)
		{
			head.data = l;
		}
		else if(n.data > l)
		{
			if(n.left == null)
				n.left = new Node(l);
			else
				insert(l,n.left);
		}
		else if(n.data < l)
		{
			if(n.right == null)
				n.right = new Node(l);
			else
				insert(l,n.right);
		}
	}
	public void visit(Node n)
	{
		System.out.println(n.data);
	}
	public void print()
	{
		System.out.println(head.data);
		System.out.println(head.left.data);
		System.out.println(head.right.data);
		System.out.println(head.right.left.data);
			
	}
	public void inorder(Node n)
	{
		if(n == null)
			return;
		else
		{
		inorder(n.left);
		visit(n);
		inorder(n.right);
		}
	}
	public void postorder(Node n)
	{
		if(n == null)
			return;
		else
		{	
			inorder(n.left);
			inorder(n.right);
			visit(n);
		}
	}
	public void preorder(Node n)
	{
		if(n == null)
			return;
		else
		{
			visit(n);
			inorder(n.left);
			inorder(n.right);
		}
	}
	public int heightimb(Node n)
	{
		if(n == null)
			return -1;
		int l = heightimb(n.left);
		int r = heightimb(n.right);
		if(l>r)
		{
			return (l+1)-(r+1);
		}
		else
		{
			return (r+1)-(l+1);
		}
	}
	public void levelorder(Node n)
	{
		int h = heightimb(n);
		for(int i=0;i<=h;i++)
		{
			printlevel(n,i);
		}
	}
	public void printlevel(Node n,int level)
	{
		if(n == null)
			return;
		else if(level == 0)
			System.out.println(n.data);
		else if(level > 0)
		{
			printlevel(n.left,level-1);
			printlevel(n.right,level-1);
		}
	}
	public void prestack(Node n)
	{
		Stack s = new Stack();
		s.insert(n.data);
		for(int i=0;s.top !=-1;i++)
		{
			System.out.println(s.pop());
		}

	}
}