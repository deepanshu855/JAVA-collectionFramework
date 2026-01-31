package Set;
// Tree set is a DS that stores unique element in a sorted order.
// All operations are done in O(log N) time

import java.util.HashSet;
import java.util.TreeSet;

public class treeSet {
    static void main(String[] args) {
        TreeSet<Integer> ts= new TreeSet<>();
        ts.add(5);
        ts.add(9);
        ts.add(0);
        ts.add(-10);
        ts.add(1);
        System.out.println(ts);
        System.out.println(ts.floor(3)); // returns the largest element ≤ x in the TreeSet.
        System.out.println(ts.ceiling(4)); // returns the smallest element ≥ x in the TreeSet.
        for (var num: ts){
            System.out.print(num+ " ");
        }
    }
}
