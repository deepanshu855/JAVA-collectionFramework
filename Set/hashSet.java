package Set;
// Hash set is a DS that stores unique element in a random order.
// All operations are done in O(1) time

import java.util.HashSet;

public class hashSet {
    static void main(String[] args) {
        HashSet<Integer> hs= new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(1);
        System.out.println(hs);
        hs.add(0);
        System.out.println(hs);
        hs.remove(0);
        System.out.println(hs);
        // we can also use loop to print hs element.
        for(var num:hs) { // this is forEach loop
            System.out.println(num);
        }
        // we can use var because java automatically assumes that it is integer(required datatype).
    }
}
