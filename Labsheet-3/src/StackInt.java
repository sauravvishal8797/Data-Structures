
public class StackInt {
	
	StackInt(int sz){
		arr = new int[sz];
		top = -1;
	}
	
	int[] arr = new int[10];
	int top = -1;
	int n;
	
	
	public void print(){
		if(top==-1)
			System.out.println("Stack Empty!");
		else
			for(int i=0;i<arr.length-n;i++)
				System.out.print(arr[i]+" ");
	}	
	
	public void push(int item){
		if(top==arr.length)
			System.out.println("Stack Overflow!");
		else
			top += 1;
			arr[top] = item;
	}
	
	public int pop(){
		if(top==-1){
			System.out.println("Stack Underflow Dumbo!");
			return top;
		}
		else{

			int tmp = arr[top];
			top = top - 1; 
			n=n+1;
			return tmp;
		}
	}
	
	public int peek(){
		return arr[top];
	}
	
	public int getminElement(){
		if(top==-1){
			System.out.println("The stack is empty!");
			return(-1);
		}
		else if(top==0)
			return(arr[top]);
		else{
			int min = arr[top];
			for(int i=0;i<arr.length;i++)
				if (arr[i]!=0){
				if(arr[i]<min)
					min=arr[i];
				}
			return(min);
		}
	}
	int flag;
	public void Equals(StackInt si, StackInt si1){
		
		for(int i=0;i<arr.length-n;i++){
			if(si.arr[i]==si1.arr[i]){
				flag = flag + 1;
			}
			else{
				System.out.println("Stacks are not Same");
			}
		if(flag==arr.length-n){
			System.out.println("Stacks are Same");
		}
		}
	}
	public void Reverse(){
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i] + " ");
		}
	}
}

