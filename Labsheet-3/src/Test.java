
public class Test {
	public static void main(String[] args) {
		
		StackInt si = new StackInt(10);
		System.out.println("Stack top is: "+ si.top);
		System.out.println("Array lenght : " + si.arr.length);
		System.out.println("1st Stack is: ");
		si.push(80);
		si.push(50);
		si.push(500);
		si.push(800);
		si.push(5);
		si.push(501);
		si.push(87);
		si.push(59);
		si.push(580);
		si.push(123);
		si.print();
		System.out.println();
		System.out.println();
		System.out.println("Peek element: "+ si.peek());
		System.out.println("Popped element: "+ si.pop());
		System.out.println();
		System.out.println("Now 1st Stack is: ");
		si.print();
		System.out.println();
		System.out.println("Peek element: "+ si.peek());
		int minimum = si.getminElement();
		System.out.println();
		System.out.println("The minimum element is: "+minimum);
		
		System.out.println();
		System.out.println("2nd Stack is: ");
		StackInt si1 = new StackInt(10);
		si1.push(80);
		si1.push(50);
		si1.push(500);
		si1.push(800);
		si1.push(5);
		si1.push(501);
		si1.push(87);
		si1.push(59);
		si1.push(581);
		si1.push(123);
		si1.pop();
		si1.print();
		System.out.println();
		
		
		si.Equals(si,si1);
		
		
		System.out.println();
		System.out.println("If 2nd Stack will be: ");
		StackInt si2 = new StackInt(10);
		si2.push(80);
		si2.push(50);
		si2.push(500);
		si2.push(800);
		si2.push(5);
		si2.push(501);
		si2.push(87);
		si2.push(59);
		si2.push(580);
		si2.push(123);
		si2.pop();
		si2.print();
		System.out.println();
		
		
		si.Equals(si,si2);
		
		System.out.println();
		System.out.println("The Reverse string is: ");
		si.Reverse();
	}

}
