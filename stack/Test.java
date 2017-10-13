package stack;

public class Test {
	public static void main(String[] args){
		StackInt si=new StackInt(10);
		System.out.println("Stack top is"+si.top);
		System.out.println(si.arr.length);
		
		si.push(100);
		si.print();
		si.push(200);
		si.print();
		
		for(int i=1;i<=12;i++){
			si.push(i*100);
		}
		
		System.out.println(si.getTop());
		
		int item1 = si.pop();
		si.print();
		
		for(int i=0;i<13;i++){
			int item11 = si.pop();
			si.print();
		}
		
		
		System.out.println(si.peek());
		si.push(100);
		System.out.println(si.peek());
		si.push(200);
		System.out.println(si.peek());
		si.push(300);
		System.out.println(si.peek());
		
		StackInt si1 = new StackInt(5);
		StackInt si2 = new StackInt(5);
		si1.push(100);
		si2.push(100);
		si1.push(200);
		si2.push(200);
		if(si1.equals(si2))
			System.out.println("both stacks are equal");
		else
			System.out.println("Both stacks are diff");
		
		si1 = new StackInt(5);
		si2 = new StackInt(5);
		si1.push(100);
		si2.push(100);
		si1.push(200);
		si2.push(300);
		if (si1.equals(si2))
		System.out.println("Both si1 and si2 are same");
		else
		System.out.println("Both si1 and si2 are not the same");
	}
	
}
