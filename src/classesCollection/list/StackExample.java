package classesCollection.list;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        // Peek (view top element)
        System.out.println("Top element: " + stack.peek());

        // Pop (remove top element)
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Stack after pop: " + stack);

        // Search an element
        System.out.println("Position of 10: " + stack.search(10));
        System.out.println("Position of 20: " + stack.search(20));
        System.out.println("Position of 50: " + stack.search(50));

        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.empty());

        // Push another element
        stack.push(40);
        System.out.println("Final Stack: " + stack);
    }
}