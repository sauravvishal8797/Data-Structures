public class StackExample {
    public static void main(String[] args) {
        Stack stack = new Stack(3);

        stack.push(10); //  10
        stack.push(1);  //  10  1
        stack.push(50); //  10  1   50

        stack.display();

        stack.push(50); //  error: stack is full

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();    //  error: stack is empty

        stack.display();
    }
}
