package linkedlist;

public class Test {
	public static void main(String args[]){
		SinglylinkedList ob1 = new SinglylinkedList();
		ob1.insert_at_head(90);
		
		ob1.insert_at_head(10);
		ob1.print();
		SinglylinkedList  ob2 = new SinglylinkedList();
		ob2.insert_at_tail(20);
		
		ob2.insert_at_tail(32);
		ob2.print();
		
		
		ob2.insert_at_position(25,3);
		ob2.print();
		ob2.deletion(1);
		ob2.print();		}
		}


