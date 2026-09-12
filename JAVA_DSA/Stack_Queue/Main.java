package JAVA_DSA.Stack_Queue;

public class Main {
    public static void main(String[] args) throws Exception{
        // Stack<Integer> stack = new Stack<>();
        // stack.push(1);
        // stack.push(2);
        // stack.push(3);
        // stack.push(4);
        // stack.push(5);
        // System.out.println(stack.peek());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // // System.out.println(stack.pop());
        // System.out.println("------------------------");
        // Queue<Integer> que = new LinkedList<>();
        // que.add(1);
        // que.add(2);
        // que.add(3);
        // que.add(4);
        // que.add(5);
        // System.out.println(que.remove());
        // System.out.println(que.remove());
        // System.out.println(que.remove());
        // System.out.println(que.remove());
        // System.out.println(que.remove());
        // // System.out.println(que.remove());
        
        DynamicStack stack = new DynamicStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);

        stack.display();

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.display();
    }
}
