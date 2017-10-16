class linkedStack

{

    protected Node top ;

    protected int size ;

 

    /*  Constructor  */

    public linkedStack()

    {

        top = null;

        size = 0;

    }    

    /*  Function to check if stack is empty */

    public boolean isEmpty()

    {

        return top == null;

    }    

    /*  Function to get the size of the stack */

    public int getSize()

    {

        return size;

    }    

    /*  Function to push an element to the stack */

    public void push(int data)

    {

        Node nptr = new Node (data, null);

        if (top == null)

            top = nptr;

        else

        {

            nptr.setLink(top);

            top = nptr;

        }

        size++ ;

    }    

    /*  Function to pop an element from the stack */

    public int pop()

    {

        if (isEmpty() )

            throw new NoSuchElementException("Underflow Exception") ;

        Node ptr = top;

        top = ptr.getLink();

        size-- ;

        return ptr.getData();

    }    

    /*  Function to check the top element of the stack */

    public int peek()

    {

        if (isEmpty() )

            throw new NoSuchElementException("Underflow Exception") ;

        return top.getData();

    }    

    /*  Function to display the status of the stack */

    public void display()

    {

        System.out.print("\nStack = ");

        if (size == 0) 

        {

            System.out.print("Empty\n");

            return ;

        }

        Node ptr = top;

        while (ptr != null)

        {

            System.out.print(ptr.getData()+" ");

            ptr = ptr.getLink();

        }

        System.out.println();        

    }

}


