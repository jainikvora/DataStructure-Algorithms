package ds.queue;

/**
 * Created by Jainik on 1/13/2015.
 */
public class Queue {
    private int maxSize;
    private int front;
    private int rear;
    private long[] queue;
    private int nItems;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        front = 0;
        rear = -1;
        queue = new long[maxSize];
        nItems = 0;
    }

    public void insert(long element) {
        if(rear == maxSize -1) {
            rear = -1;
        }
        queue[++rear] = element;
        nItems++;
    }

    public long remove() {
        long temp = queue[front++];
        if(front == maxSize)
            front = 0;
        nItems--;
        return temp;
    }

    public long peekFront() {
        return queue[front];
    }

    public boolean isFull() {
        return (maxSize == nItems);
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public int size() {
        return nItems;
    }


}
