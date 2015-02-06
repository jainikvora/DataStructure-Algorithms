package ds.queue.priority;

/**
 * Created by Jainik on 1/13/2015.
 */
public class PriorityQueueApp {
    public static void main(String args[]) {
        PriorityQueue queue = new PriorityQueue(10);
        queue.insert(30);
        queue.insert(50);
        queue.insert(10);
        queue.insert(40);
        queue.insert(20);

        System.out.println("Priority Queue Elements:");
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
