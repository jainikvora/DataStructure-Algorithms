package ds.queue;

/**
 * Created by Jainik on 1/13/2015.
 */
public class QueueApp {
    public static void main(String args[]) {
        Queue queue = new Queue(10);

        queue.insert(3);
        queue.insert(5);
        queue.insert(10);
        queue.insert(12);
        queue.insert(1);
        queue.insert(2);

        while (!queue.isEmpty()) {
            System.out.println("Front Queue Element: " + queue.remove());
        }
    }
}
