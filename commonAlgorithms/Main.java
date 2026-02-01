package commonAlgorithms;

//Collections.sort(list) → sorts the list in ascending order
//Collections.reverse(list) → reverses the order of elements in the list
//Collections.max(list) → returns the maximum element from the list
//Collections.min(list) → returns the minimum element from the list
//Collections.frequency(list, x) → counts how many times x appears in the list
//Collections.binarySearch(list, x) → returns the index of x in a sorted list (or negative if not found); binarySearch() works correctly only if the list is already sorted.
//Arrays.sort(array) → sorts the array in ascending order (in-place).
//Math.pow(a, b) → returns a raised to the power b, it gives double.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<>();
        al.add(2);
        al.add(65);
        al.add(8);
        al.add(20);
        Collections.sort(al);
//        System.out.println(Collections.frequency(al, 7));
        int [] arr= {2, 65, 8, 20};
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
