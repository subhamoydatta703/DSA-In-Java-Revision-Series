package queue;

import java.util.Arrays;

class QueueArr {
    static int arr[];
    // static int front;
    static int rear;
    static int sz;

    QueueArr(int n) {
        arr = new int[n];
        // front =0;
        rear = -1;
        this.sz = n;
    }

    static boolean isEmptyQ() {
        if (rear == -1)
            return true;
        return false;
    }

    static boolean isFull() {
        if (rear == sz - 1)
            return true;
        return false;
    }

    static void enQ(int val) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = rear + 1;
        arr[rear] = val;
    }

    void displayQ() {
        if (isEmptyQ()) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0; i < rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    int peekQ() {
        if (isEmptyQ()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[0];
    }

    int deQ() {
        if (isEmptyQ()) {
            System.out.println("Queue is empty");
            return -1;
        }

        // int val = arr[front];\
        int front = arr[0];
        // front++;
        for (int i = 0; i <= rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        // sz--;
        return front;
    }
}

public class QueueUsingArray {

    public static void main(String[] args) {
        // enqueue
        // dequeue
        // peek
        // isempty
        // int q[] = new int[3];
        // System.out.println(Arrays.toString(enqueueOp(q, 10)));

        // System.out.println(Arrays.toString(enqueueOp(q, 20)));

        QueueArr q = new QueueArr(5);
        System.out.println(q.isFull());
        // // q.enQ(2);
        // q.displayQ();
        // q.enQ(5);
        // q.displayQ();
        // q.enQ(10);
        // q.displayQ();

        // q.peekQ();
        // System.out.println("DeQ: "+q.deQ());

    }
}
