public class Stack {
    private int top;
    int size;
    int[] stack;

    public Stack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack is full, can't push a value");
            return;
        }
        top = top + 1;
        stack[top] = value;
    }

    public void pop() {
        if (!isEmpty()) {
            top = top - 1;
            return;
        }
        System.out.println("Can't pop...stack is empty");

    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void display() {
        if (isEmpty()){
            System.out.println("stack is empty");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}
