package queue;

import java.util.ArrayDeque;
import java.util.Deque;
class MyStack {
    Deque<Integer> q = new ArrayDeque<>();
    
    public MyStack() {
    
    }
    
    public void push(int x) {
        if(q.isEmpty()){
            q.offer(x);
        }
        else{
            q.offer(x);
            int i =q.size()-1;
            while(i>0){
                int t = q.poll();
                q.offer(t);
                i--;
            }

        }
    }
    
    public int pop() {
        if(q.isEmpty()) return-1;
       return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        if(q.size()==0) return true;
        return false;
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
public class QueueToStack {
    public static void main(String[] args) {
        
    }
}
