package JAVA_DSA.Stack_Queue;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int top = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item) throws Exception {
        if (isFull()) {
            throw new Exception("- STACK IS FULL - CANNOT INSERT NEW ITEM -");
        }
        
        this.data[++top] = item;
        return true;
    }
    
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("- STACK IS EMPTY - CANNOT REMOVE ANOTHER ITEM -");
        }

        return(this.data[top--]);
    }

    public void display() {
        if (isEmpty()){
            System.out.println("- STACK IS EMPTY -");
            return ;
        }
        for (int i = 0; i <= top; i++){
            System.out.print(data[i] + " -> ");
        }
        System.out.print("TOP");
        System.out.println();
    }

    protected  boolean isFull() {
        return top == data.length - 1;
    }

    protected  boolean isEmpty() {
        return top == -1;
    }
}
