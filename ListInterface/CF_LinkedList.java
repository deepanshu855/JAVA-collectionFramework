package ListInterface;

import java.util.LinkedList;

//add(x) → insert element at the end
//addFirst(x) → insert element at the beginning
//addLast(x) → insert element at the end (explicit tail insert)
//get(i) → get element at index i
//getFirst() → get first element
//getLast() → get last element
//remove() → remove and return first element
//removeFirst() → remove first element
//removeLast() → remove last element
//remove(i) → remove element at index i
//size() → returns number of elements
//isEmpty() → checks if list is empty
//peek() / peekFirst() → return first element without removing (used in queue/stack logic)
//poll() / pollFirst() → remove and return first element (used in queue logic)

public class CF_LinkedList {
    static void main(String[] args) {
        LinkedList<Integer> ll= new LinkedList<>();
        ll.add(10);
        ll.add(14);
        ll.add(7);
        ll.addFirst(2);
        System.out.println(ll);
    }
}
