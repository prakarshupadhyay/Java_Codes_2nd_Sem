package Demo_Programs;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop() + " popped from stack");
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack elements: " + stack);
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("30 at position: " + stack.search(30));
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack elements: " + stack);
        stack.clear();
        System.out.println("Stack elements after clear: " + stack);
    }
}