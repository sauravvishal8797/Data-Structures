package stack;

public class StackInt {
	int[] arr=new int[5];
	
	int top=-1;
	StackInt(int t) {
		arr = new int[t];
		top = -1;
		}
	public void print() {
		for(int i=0;i<=top;i++){
			System.out.print(arr[i]+"\t");
			
		}
		System.out.println("  ");
	}
	public void push(int item) {
		if(top<arr.length-1){
		top++;
		arr[top]=item;
		}
		else
			System.out.println("cant push");
	}
	public int getTop() {
		if(top>=0)
			return arr[top];
		else
			System.out.println("Empty");
		return -1;
	}
	public int pop() {
		// Your logic here
		if(top!=-1){
			top--;
			return arr[top+1];
		}
		System.out.println("cant pop");
		return -1;
	}
	
	public int peek() {
		if(top!=-1)
			return arr[top];
		System.out.println("cant peek");
		return -1;
	}
	
	public boolean equals(StackInt another) {
		if(top!=another.top)
			return false;
		for(int i=0;i<=top;i++){
			if(another.arr[i]!=arr[i])
				return false;
			
		}
		return true;
	}
}
