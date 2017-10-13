package queue;

public class QueueInt {
	int arr[] = new int[5];
	int front = -1;
	int rear = -1;
	QueueInt () { 
	    arr = new int[10]; 
	    front = -1; 
	    rear=-1; 
	}
	QueueInt(int b){
		arr = new int[b];
		front = -1;
		rear = -1;
	}
	public void print()
	{
		for (int i=front;i<=rear;i++)
		{
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		System.out.println("");
	}
	public void enqueue(int item)
	{
		if (rear + 1 >= arr.length)
		{
			System.out.println("Queue is Full");
		}
		else
		{
			if (front == rear)
			{
				front = 0;
			}
			rear = rear + 1;
			arr[rear] = item;
		}
	}
	public int getfront()
	{
		if (front != -1)
		{
			return arr[front];
		}
		return 0;
	}
	public int dequeue()
	{
		if (front == rear)
		{
			System.out.println("Can't pop");
			return 0;
		}
		int el = arr[front];
		front = front + 1;
		return front;
	}
	public boolean equals(QueueInt temp)
	{
		int i,j;
		for (i=front,j=temp.front;i<=rear && j<=temp.rear;i++,j++)
		{
			if (arr[i] != this.arr[j])
			{
				return false;
			}
		}
		if (i == rear+1 && j == temp.rear+1)
		{
			return true;
		}
		return false;
	}
}
