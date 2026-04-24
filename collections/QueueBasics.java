package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBasics {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        // Queue is an interface not a class in java -> we use linkedlist, priorityqueue, arraydequeue for creating queue

        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q);
        System.out.println(q.isEmpty());

        while(!q.isEmpty()) System.out.println(q.remove());

        System.out.println(q.isEmpty());
        

    }
}
