package Queue;

import java.util.ArrayDeque;

//offer(x) → insert element at the tail (queue insert)
//offerFirst(x) → insert element at the front
//offerLast(x) → insert element at the end
//poll() → remove and return front element
//pollFirst() → remove and return front element
//pollLast() → remove and return last element
//peek() → return front element without removing
//peekFirst() → return front element without removing
//peekLast() → return last element without removing
//size() → number of elements
//isEmpty() → check if deque is empty

public class CF_arrayDeque {
    static void main(String[] args) {
        ArrayDeque<Integer> ad= new ArrayDeque<>();
        // Main methods are offer, peek and poll
        ad.offer(2);
        ad.offer(7);
        ad.offer(10);
        System.out.println(ad);
        System.out.println(ad.peek());
        ad.poll();
        System.out.println(ad);
    }
}
