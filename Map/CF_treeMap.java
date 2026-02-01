package Map;
// TreeMap stores keys in sorted order and all main operations are O(log N).

//firstKey() → return smallest key
//lastKey() → return largest key
//floorKey(key) → greatest key ≤ given key
//ceilingKey(key) → smallest key ≥ given key
//entrySet() → iterate over all key-value pairs

import java.util.TreeMap;

public class CF_treeMap {
    static void main(String[] args) {
        TreeMap<Integer, String> tm= new TreeMap();
        tm.put(12, "Deepanshu");
        tm.put(1, "Apeksha");
        tm.put(6, "Priyanshu");
        System.out.println(tm.floorKey(7)); // 6
        System.out.println(tm.ceilingKey(5)); // 6
    }
}

