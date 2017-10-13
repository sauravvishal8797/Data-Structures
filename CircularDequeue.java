
public class CircularDequeue {
	private int rear;
	private int front;
	private int[] arr;
	private int size;
	
	public CircularDequeue(int n){
		rear=-1;
		front=-1;
		arr=new int[5];
		size=n;
	}
	
	public boolean isFull(){
		if((front+1)%size==rear)
			return true;
		return false;
	}
	
	private boolean isEmpty(){
		if(rear==-1 && front==-1)
			return true;
		return false;
	}
	
	public void insertFront(int x){
		if(front==-1 && rear==-1){
			front=0;
			rear=0;
		}
		if(!isFull()){
			front=(front+1)%size;
			arr[front]=x;
		}
		else
			System.out.println("q is full");
	}
	
	public void insertLast(int x){
		if(front==-1 && rear==-1){
			front=0;
			rear=0;
		}
		if(!isFull()){
			rear=(rear-1);
			rear%=size;
			if(rear<0)
				rear+=size;
			arr[rear]=x;
		}
		else
			System.out.println("q Full");
	}
	
	public void deleteFront(){
		if(isEmpty())
			System.out.println("Q is empty");
		else if(rear==front){
			rear=-1;
			front=-1;
		}
		else{
			front=(front-1)%size;
			if(front<0)
				front+=size;
		}
	}
	
	public void deleteLast(){
		if(isEmpty())
			System.out.println("Q is empty");
		else if(rear==front){
			rear=-1;
			front=-1;
		}
		else{
			rear=(rear+1)%size;
		}
	}
	
	public int getFront(){
		if(!isEmpty()){
			return arr[front];
		}
		return -1;	
	}
	
	public int getRear(){
		
		if(!isEmpty())
			return arr[rear];
		return -1;
	}
	
}
