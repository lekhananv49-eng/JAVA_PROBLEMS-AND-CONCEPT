package DAY5.Collections1;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String args[]) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(40);
        pq.offer(10);
        pq.offer(30);
        pq.offer(20);
        System.out.println("PQ output: " + pq);
        System.out.println("Peek elements: " + pq.peek());
        pq.poll();
        System.out.println("After Poll: " + pq);
        // For normal Queue operation
        Queue<Integer> adq = new ArrayDeque<>();
        adq.offer(88);
        System.out.println(adq.element());
        // Size()
        // Contains()

    }
}
