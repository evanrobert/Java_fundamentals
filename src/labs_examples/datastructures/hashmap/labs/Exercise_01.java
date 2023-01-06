package labs_examples.datastructures.hashmap.labs;

import java.util.HashMap;
import java.util.function.BiConsumer;

/**
 *  HashMaps Exercise_01
 *
 *  Demonstrate you're mastery of using Java's built-in HashMap class below.
 *
 *  Using a HashMap demonstrate the use of the following methods:
 *
 *  put()
 *  get()
 *  putAll()
 *  size()
 *  contains()
 *  keySet()
 *  entrySet()
 *  putIfAbsent()
 *  remove()
 *  replace()
 *  forEach()
 *  clear()
 *
 */


public class Exercise_01 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("store1", 1_000_004);
        hashMap.put("store3",222_423_333);
        System.out.println(hashMap.get("store1"));
        hashMap.putAll(hashMap);
        System.out.println(hashMap.size());
        hashMap.containsValue(1_000_004);
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.entrySet());
        System.out.println(hashMap.putIfAbsent("Store2",400_240_000));
        System.out.println(hashMap.remove("store3"));
        System.out.println(hashMap.replace("Store1",27));
        BiConsumer<String, Integer> action
                = new MyBiConsumer();

        // calling forEach method
        hashMap.forEach(action);
        hashMap.clear();
    }
}

// Defining Our Action in MyBiConsumer class
class MyBiConsumer implements BiConsumer<String, Integer> {

    public void accept(String key, Integer value)
    {
        System.out.print("Key = " + key);
        System.out.print("\t Value = " + value);
        System.out.println();

    }
}





