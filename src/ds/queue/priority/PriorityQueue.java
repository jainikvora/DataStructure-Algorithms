package ds.queue.priority;

/**
 * Created by Jainik on 1/13/2015.
 */
public class PriorityQueue {
    private int maxSize;
    private long[] queue;
    private int nItems;

    public PriorityQueue(int maxSize) {
        this.maxSize = maxSize;
        queue = new long[maxSize];
        nItems = 0;
    }

    public void insert(long element) {
        int j;
        if(nItems == 0) {
            queue[nItems++] = element;
        }
        else {
            for(j = nItems-1; j >=0 ; j--) {
                if(element > queue[j]) {
                    queue[j+1] = queue[j];
                } else {
                    break;
                }
            }
            queue[j+1] = element;
            nItems++;
        }
    }

    public long remove() {
        return queue[--nItems];
    }

    public long peekMin() {
        return queue[nItems];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }
}
