package Map;
// HashMap → stores data as (key → value) pairs and lets you find a value using its key in O(1) average time.
// Use it when you need fast lookup / counting / mapping (like frequency of elements, index mapping, caching in DSA).
// It doesn't store the key in sorted order.

//put(key, value) → insert or update a key with a value
//get(key) → get the value for a key
//containsKey(key) → check if a key exists
//remove(key) → remove a key and its value
//size() → number of key-value pairs
//isEmpty() → check if the map is empty
//getOrDefault(key, defaultValue) → return value if key exists, otherwise default
//keySet() → get all keys (used to iterate over map in DSA)
//values() → get all values
//entrySet() → get all (key, value) pairs (used for traversal)

import java.util.HashMap;

public class CF_hashMap {
    static void main(String[] args) {
        // Roll no. is key
        // Name is value
        HashMap<Integer, String> hm= new HashMap<>();
        hm.put(2, "Deepanshu");
        hm.put(1, "Apeksha");
        hm.put(3, "Priyanshu");
        System.out.println(hm);
        System.out.println(hm.entrySet());
    }
}
