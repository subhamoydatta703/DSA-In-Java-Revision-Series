package stack;

import java.util.ArrayDeque;
import java.util.Deque;

class MinStack {

    Deque<Integer> s;
    Deque<Integer> m;

    public MinStack() {
        s = new ArrayDeque<>();
        m = new ArrayDeque<>();
    }
    
    public void push(int value) {
        s.push(value);

        if(m.isEmpty() || value <= m.peek()){
            m.push(value);
        }
    }
    
    public int pop() {
        int t = s.pop();

        if(!m.isEmpty() && m.peek() == t){
           int k = m.pop();
        }
        return t;
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return m.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
public class MinStackProblem {
    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(5);
        obj.push(3);
        obj.push(2);
        obj.push(7);
        System.out.println(obj.top());
        System.out.println(obj.getMin());
        System.out.println(obj.pop());
    }
}
