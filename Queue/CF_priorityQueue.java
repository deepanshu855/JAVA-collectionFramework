package Queue;
// PriorityQueue is a min-heap by default
// it is a DS that stores element and whenever we use peek it gives the smallest element.

//offer(x) → insert element into the priority queue
//add(x) → insert element (same as offer for DSA use)
//poll() → remove and return the highest-priority element (in Java: smallest element by default – min-heap)
//peek() → return the highest-priority element without removing
//size() → number of elements in the queue
//isEmpty() → check if the queue is empty

import java.util.PriorityQueue;

public class CF_priorityQueue {
    static void main(String[] args) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        pq.offer(0);
        pq.offer(6);
        pq.offer(2);
        pq.offer(1);
//        System.out.println(pq);
//        System.out.println(pq.peek());
//        pq.poll();
//        System.out.println(pq);
//        System.out.println(pq.peek());
//        pq.poll();
//        System.out.println(pq);
//        System.out.println(pq.peek());
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.poll();
        }
        // We cannot use a for-each loop because it uses an iterator internally, and while an iterator is running we must not modify the PriorityQueue.
    }
}
