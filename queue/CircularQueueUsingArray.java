package queue;

class CircularQueueArr {
    int arr[];
    int front;
    int rear;
    int sz;

    CircularQueueArr(int n) {
        arr = new int[n];
        sz = n;
        front = -1;
        rear = -1;
    }

    boolean isEmptyQ() {
        return front == -1;
    }

    boolean isFull() {
        return (rear + 1) % sz == front;
    }

    void enQ(int val) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        // First element
        if (front == -1) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % sz;
        }

        arr[rear] = val;
    }

    int deQ() {
        if (isEmptyQ()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int val = arr[front];

        // Last element removed
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % sz;
        }

        return val;
    }

    int peekQ() {
        if (isEmptyQ()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return arr[front];
    }

    void displayQ() {
        if (isEmptyQ()) {
            System.out.println("Queue is empty");
            return;
        }

        int i = front;

        while (true) {
            System.out.print(arr[i] + " ");

            if (i == rear)
                break;

            i = (i + 1) % sz;
        }

        System.out.println();
    }
}

public class CircularQueueUsingArray {
    public static void main(String[] args) {

        CircularQueueArr q = new CircularQueueArr(5);

        q.enQ(10);
        q.enQ(20);
        q.enQ(30);
        q.enQ(40);
        q.enQ(50);

        q.displayQ();

        System.out.println("DeQ: " + q.deQ());
        System.out.println("DeQ: " + q.deQ());

        q.displayQ();

        q.enQ(60);
        q.enQ(70);

        q.displayQ();

        System.out.println("Peek: " + q.peekQ());

        System.out.println("DeQ: " + q.deQ());
        System.out.println("DeQ: " + q.deQ());

        q.displayQ();

        q.enQ(80);
        q.enQ(90);

        q.displayQ();

        q.enQ(100);
    }
}
