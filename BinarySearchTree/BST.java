public class BST
{
	public BSTNode root =null;
	public BST()
	{
		root = null;
	}
	public void insert(int x)
	{
		BSTNode temp = new BSTNode(x);
		int count=1;
		if(root==null)
			root=temp;
		else
		{
			BSTNode cur =root;
			BSTNode parent =null;
			while(count!=0)
			{
				parent=cur;
				if(x<cur.data)
				{
					cur=cur.left;
					if(cur==null)
					{
						parent.left=temp;
						count=0;
					}
				}
				else if(x>cur.data)
				{
					cur=cur.right;
					if(cur==null)
					{
						parent.right = temp;
						count=0;
					}
				}
			}
		}
	}
	public void inorder(BSTNode root)
	{
		if(root!=null)
		{
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
	}
	public void preorder(BSTNode root)
	{
		if(root!=null)
		{
			System.out.print(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	public void postorder(BSTNode root)
	{
		if(root!=null)
		{
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data+" ");
		}
	}
	public void search(int x)
	{
		int count=1;
		BSTNode temp=root;
		while(count!=0 && count!=2)
		{
			if(x==temp.data)
				count=0;
			else if(x>temp.data)
			{
				temp=temp.right;
			}
			else if(x<temp.data)
			{
				temp=temp.left;
			}
			if(temp==null)
				count=2;
			//System.out.println(temp.data+" ");
		}
		if(count==0)
			System.out.println("Found");
		else if(count==2)
			System.out.println("Not Found");
	}
	public void minMax()
	{
		BSTNode temp=root;
		while(temp.left!=null)
			temp=temp.left;
		System.out.println("Minimum : "+temp.data);
		temp=root;
		while(temp.right!=null)
			temp=temp.right;
		System.out.println("Maximum : "+temp.data);
	}
	public void delete(int x)
	{
		int count=1;
		BSTNode temp=root;
		BSTNode n=temp;
		while(count!=0)
		{
			if(temp.data==x)
			{
				count=0;
				break;
			}
			n=temp;
			if(x<temp.data)
				temp=temp.left;
			else if(temp.data<x)
				temp=temp.right;
		}
		if(temp.left == null && temp.right==null)
			n.left=null;
		else if(temp.left==null || temp.right==null)
		{
			if(n.left.data==x)
			{
				if(temp.left==null)
					n.left=temp.right;
				else
					n.left=temp.left;
			}
			else
			{
				if(temp.left==null)
					n.right=temp.right;
				else
					n.right=temp.left;
			}
		}
		else
		{
			BSTNode temp1=temp.right;
			BSTNode p =temp1;
			while(temp1.left!=null)
			{
				p=temp1;
				temp1=temp1.left;
			}
			if(n.right.data==x)
				n.right.data=temp1.data;
			else if(n.left.data==x )
				n.left.data=temp1.data;
			else if(n.data==x)
				n.data=temp1.data;
			if(temp1.right!=null)
					p.left=temp1.right;
			else if(temp1==p)
				temp.right=null;
			else
				p.left=null;
		}
		
	}
}
