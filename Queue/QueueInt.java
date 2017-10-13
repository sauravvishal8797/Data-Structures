
public class QueueInt {
	int[] arr;
	int front = -1;
	int rear = -1;
	QueueInt(){
		arr = new int[10];
	}
	
	QueueInt(int size){
		arr = new int[size];
		
	}
	
	public void print(){
		for(int i=front;i<=rear;i++){
			System.out.print(arr[i]+ " ");
			
		}
		System.out.println("");
	}
	
	public void enqueue(int item){
		if(rear == arr.length - 1){
			System.out.println("Can't enqueue");
			return;
		}
		else if (rear == -1){
			front++;
			rear++;
		}
		else{
			rear++;
		}
		arr[rear] = item;
	}
	
	public int getFront(){
		if (front != -1) {
			return arr[front];
		}
		else{
			return -1;
		}
			
	}
	
	public int getRear(){
		if(rear != -1){
			return arr[rear];
		}
		else{
			return -1;
		}
	}
	
	public int dequeue(){
		if(front == - 1){
			System.out.println("Can't dequeue");
			return -1;
		}
		else if(front == rear){
			int prev = front;
			front++;
			front=rear=-1;
			return arr[prev];
		}
		else{
			int prev = front;
			front ++;
			return arr[prev];
		}
	}
	
	public static boolean equals(QueueInt a, QueueInt b){
		if(a.getFront() == b.getFront() && a.getRear() == b.getRear()){
			for(int i=a.front,j=b.front;i<=a.rear && j<=b.rear;i++,j++){
				if(a.arr[i] != b.arr[j]){
					return false;
				}
			}
			return true;
		}
		else{
			return false;
		}
	}
	
	
}
