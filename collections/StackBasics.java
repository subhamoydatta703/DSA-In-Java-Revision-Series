package collections;

import java.util.Stack;

public class StackBasics {
    public static void main(String[] args) {
        // stack  -> uses LIFO
        Stack<Integer> s = new Stack<>(); 
        // create a stack object

        // after push
        s.push(10);
        s.push(20);
        s.push(30);

        // System.out.println(s);
        
        // // after pop
        // s.pop();
        // System.out.println(s);
        // s.pop();
        // System.out.println(s);

        // System.out.println(s.isEmpty());

        // while(!s.isEmpty()) System.out.println(s.pop());
        // System.out.println(s.pop());

        // The stack.peek() method in Java is used to retrieve the element at the top of a stack without removing it.
        System.out.println(s.peek());
    }
}
