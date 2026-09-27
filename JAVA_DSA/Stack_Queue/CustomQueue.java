package JAVA_DSA.Stack_Queue;

public class CustomQueue {
    protected int[] data;

    private static final int DEFAULT_SIZE = 10;

    public CustomQueue () {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    
}
