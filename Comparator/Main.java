package Comparator;

// A Comparator tells Java how to compare two objects when you want a custom order.
//It defines your own sorting rule (instead of the default natural order).
//Use a Comparator when: you want to sort objects, but not by their default order

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static Comparator<Integer> getComparator(){
        return new Comparator<Integer>() {
            @Override
            // [num1, num2]
            public int compare(Integer num1, Integer num2) {
                if(num1< num2) { // order is wrong
                    return 1; // reverse the order
                } else if (num1> num2) { // order is correct
                    return -1; // order is same
                } else { // order is same
                    return 0;
                }
            }
        };
    }

    static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<>();
        al.add(2);
        al.add(9);
        al.add(0);
        al.add(4);
        // Sort by descending order.
        Collections.sort(al, getComparator());
//        System.out.println(al);

        // priorityQueue can be converted to maxheap using comparator.
        PriorityQueue<Integer> pq= new PriorityQueue<>(getComparator());
        pq.offer(2);
        pq.offer(9);
        pq.offer(0);
        pq.offer(4);
        System.out.println(pq.peek()); // gives 9 instead of 0 i.e. max heap.
    }
}
