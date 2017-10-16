package circularqueue;

public class circularqueue {
	int arr[] = new int[5];
	int front = -1;
	int rear = -1;
	circularqueue()
	{
		arr = new int[10];
		front = -1;
		rear = -1;
	}
	circularqueue(int a)
	{
		arr = new int[a];
		front = -1;
		rear = -1;
	}
	public void print()
	{
		for (int i=front;i<=rear;i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
	public void enqueue(int a)
	{
		if ((rear + 1)%arr.length == front)
		{
			System.out.println("Queue is Full");
			return;
		}
		if (front == rear)
		{
			if (front == -1)
			{
				front = 0;
			}
		}
		rear = (rear + 1)%arr.length;
		arr[rear] = a;
	}
	public int getfront()
	{
		if (front == rear)
		{
			System.out.println("Queue is empty");
			return -254;
		}
		return arr[front];	
	}
	public int dequeue()
	{
		if (front == rear)
		{
			System.out.println("Queue is empty");
			return -254;
		}
		int el = arr[front];
		front = (front + 1)%arr.length;
		return el;
	}
	public boolean check(circularqueue temp)
	{
		int i,j;
		int size = arr.length;
		for (i=front,j=temp.front;i<=rear && j<=temp.rear;i=(i+1)%size,j=(j+1)%size)
		{
			if (arr[i] != temp.arr[j])
			{
				return false;
			}
		}
		if (i == rear + 1 && j == temp.rear + 1)
		{
			return true;
		}
		return false;
	}
	public void split(circularqueue a,circularqueue b)
	{
		for (int i=front;i<=rear;i=(i+1)%arr.length)
		{
			if (i%2 == 0)
			{
				a.enqueue(arr[i]);
			}
			else
			{
				b.enqueue(arr[i]);
			}
		}
	}
	public void getminelement()
	{ 
		int min=0;
		for (int i = front;i<=rear;i++)
		{
			if (i == front)
			{
				min = arr[i];
			}
			else
			{
				if (arr[i] < min)
				{
					min = arr[i];
				}
			}
		}
		System.out.println("mininum element is " + min);
	}
	
}
