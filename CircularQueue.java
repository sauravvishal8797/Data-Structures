
public class CircularQueue{
	int[5] arr;
	private int rear=-1,front=-1;
	private boolean isfull(){
		if((rear)%5==front && rear!=-1)
			return true;
		return false;
	}
	public void enqueue(int x){
		
		if(isfull()){
			System.out.println("Queue is full");
		}
		else{
			if(rear==-1 && rear==front){
			rear++;
			front++;

			}
			arr[rear]=x;
			rear=(rear+1)%5;
		}
	}
	private boolean isempty(){
		if(rear==-1)
			return true;
		if((rear+1)%5==front)
			return true;
		return false;
	}
	public void  dequeue(){
		if(!isempty)
			front=(front+1)%5;
		else
			System.out.println("Empty");
	}

}
