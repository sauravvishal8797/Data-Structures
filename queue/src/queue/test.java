package queue;

public class test {
	public static void main(String args[])
	{
		QueueInt qi = new QueueInt();
        System.out.println("Queue Front is " + qi.front+ " and Rear is  " + qi.rear);
        QueueInt qi1 = new QueueInt(); 
        System.out.println(qi1.arr.length); 
        QueueInt  qi2 = new QueueInt (15); 
        System.out.println(qi2.arr.length); 
        qi.enqueue(100); 
        qi.print(); 
        qi.enqueue(200); 
        qi.print();
        qi.enqueue(200); 
        qi.print();
        qi.enqueue(200); 
        qi.print();
        qi.enqueue(200); 
        qi.print();
        qi.enqueue(200); 
        qi.print();
        System.out.println(qi.getfront());
        qi.dequeue();
        qi.dequeue();
        qi.dequeue();
        qi.dequeue();
        qi.dequeue();
        qi.dequeue();
        qi.dequeue();
        qi.dequeue();
        if (qi1 == qi2) 
            System.out.println("Both qi1 and qi2 are same"); 
        else 
            System.out.println("Both qi1 and qi2 are not the same"); 
        QueueInt  qi3 = new QueueInt (5); 
        QueueInt  qi4 = new QueueInt (5); 
        qi3.enqueue(100); 
        qi4.enqueue(100); 
        qi3.enqueue(200); 
        qi4.enqueue(200); 
        if (qi3.equals(qi4)) 
            System.out.println("Both qi3 and qi4 are same"); 
        else 
            System.out.println("Both qi3 and qi4 are not the same");
	}
}
