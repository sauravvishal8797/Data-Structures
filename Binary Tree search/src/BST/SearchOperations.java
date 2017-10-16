package BST;

public class SearchOperations{
	Node root;
	SearchOperations(){
		root =null;
	}
	Node Insert(int x,Node root)
	{
		if(root==null)
		{
			
		Node newnode=new Node(x);
		root=newnode;
		return root;
		}	
		if(x<=root.data)
		{
			root.left=Insert(x,root.left);
		}
		else 
		{
			
			root.right=Insert(x,root.right);
		}
		return root;
	}
	void print(Node root)
	{
		if(root==null)
			return;
		System.out.print(root.data+" ");
		print(root.left);
		print(root.right);
	}
	 
}
