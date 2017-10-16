package circularqueue;

public class circulartest {
	public static void main(String args[])
	{
		circularqueue qi = new circularqueue();
        System.out.println("Queue Front is "+qi.front+ " and Rear is  " + qi.rear);
        circularqueue qi1 = new circularqueue(); 
        System.out.println(qi1.arr.length); 
        circularqueue qi2 = new circularqueue(15); 
        System.out.println(qi2.arr.length); 
        circularqueue qi3 = new circularqueue (); 
        qi3.enqueue(100); 
        qi3.print(); 
        qi3.enqueue(200); 
        qi3.print();
        qi3.print();
        qi3.print();
        qi3.enqueue(300);
        qi3.enqueue(400);
        qi3.enqueue(500);
        int item = qi3.dequeue();
        item = qi3.dequeue();
        qi3.print();
        circularqueue qi4 = new circularqueue (); 
        circularqueue qi5 = new circularqueue (); 
        qi4.enqueue(100); 
        qi5.enqueue(100); 
        qi4.enqueue(200); 
        qi5.enqueue(200); 
        if (qi4 == qi5) 
            System.out.println("Both qi4 and qi5 are same"); 
        else 
            System.out.println("Both qi4 and qi5 are not the same");
        if (qi4.check(qi5))
        {
        	System.out.println("Both qi4 and qi5 are same");
        }
        else
        {
        	System.out.println("Both qi4 and qi5 are not the same");
        }
        circularqueue even = new circularqueue();
        circularqueue odd = new circularqueue();
        qi3.print();
        qi3.split(even,odd);
        even.print();
        odd.print();
        qi3.getminelement();
	}
	
}
