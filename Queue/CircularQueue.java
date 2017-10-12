
public class CircularQueue extends QueueInt {
	
	CircularQueue(){
		super();
	}
	
	CircularQueue(int size){
		super(size);
	}
	
	public void enqueue(int item){
		if(rear == front - 1 || (front == 0 && rear == arr.length - 1)){
			System.out.println("can't enqueue");
			return;
		}
		if(rear == -1){
			rear++;
		}
		else if(rear == arr.length - 1){
			rear = 0;
		}
		else{
			rear++;
		}
		arr[rear] = item;
	}
	
	public int dequeue(){
		if(front == arr.length-1){
			int prev = front;
			front = 0;
			return arr[prev];
		}
		else{
			return super.dequeue();
		}
	}
	
	public void print(){
		for(int i=front;i!=rear;i=(i+1)%(arr.length)){
			System.out.println(arr[i]);
		}
	}
	
	public static boolean equals(CircularQueue a, CircularQueue b){
		if(a.getFront() == b.getFront() && a.getRear() == b.getRear()){
			for(int i=a.front,j=b.front;i!=a.rear&&j!=b.rear;i=(i+1)%(a.arr.length),j=(j+1)%(b.arr.length)){
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
