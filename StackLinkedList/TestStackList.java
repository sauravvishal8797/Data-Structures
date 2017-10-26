public class TestStackList
{
	public static void main(String [] args)
	{
		StackLinkedList s1=new StackLinkedList();
 		s1.push(9);
 		s1.push(10);
 		s1.push(8);
 		s1.pop();
 		s1.push(11);
 		System.out.println(s1.peek());
		s1.print();
	}
}
