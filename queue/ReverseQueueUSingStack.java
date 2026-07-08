package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseQueueUSingStack {
    static void revQueue(Deque<Integer> q){
        Deque<Integer> s = new ArrayDeque<>();

        while(!q.isEmpty()){
            int t = q.poll();
            s.push(t);
        }

        while(!s.isEmpty()){
            int t = s.pop();
            q.offer(t);
        }

        System.out.println(q);
    
    }
    public static void main(String[] args) {
        Deque<Integer> q = new ArrayDeque<>();
        q.offer(5);
        q.offer(3);
        q.offer(1);
        q.offer(0);
        System.out.println(q);
        revQueue(q);
    }
}
