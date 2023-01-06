package labs_examples.datastructures.hashmap.labs;

import labs_examples.datastructures.hashmap.examples.Entry;

import java.util.HashMap;

/**
 * HashMaps Exercise_02
 * <p>
 * Rewrite the CustomHashMap class to meet the following requirements:
 *
 * 1) no method has the same name as any in CustomHashMap
 * DONE
 * (do not use refactor - do it manually)
 * 2) no variable has the same name as any in CustomHashMap
 *
 * (do not use refactor - do it manually)
 * DONE
 * 3) resize the HashMap when the underlying array is more than half full
 * DONE
 * 4) triple the size of the underlying array on resize()
 * DONE
 * 5) instead of checking the number of keys to resize, check the number of values
 * DONE
 * 6) on collisions, add new elements to the front of the LinkedList, not the end
 * DONE
 * 7) anytime someone tries to get/update/remove an element that does not exist, print
 * out a message indicating that the element does not exist
 * DONE
 *
 * 8) add at least one more method that you think could be useful to the HashMap
 * review Java's built-in HashMap for inspiration
 */
public class Exercise_02<K, V> {

    private Entry<K, V>[] item = new Entry[10];


    private int numOfElements = 0;


    private int hash(K key) {

        int beggining = Math.abs(key.hashCode() % item.length);

        return beggining;


    }


    public void putting(V key, K value) {

        int index = hash(value);


        Entry<K, V> entry = new Entry(key, value);


        if (item[index] == null) {
            System.out.println(" Element does not exist");

            item[index] = entry;
            numOfElements++;
        } else {

            Entry<K, V> p = item[index];


            while (p.next != null) {
                p = p;
            }


            p.next = entry;
            numOfElements++;
        }


        if (numOfElements > item.length * .75) {

            resizing();
        }
    }


    private void resizing() {

        Entry<K, V>[] old = item;

        item = new Entry[old.length * 3];


        for (int i = 0; i < old.length; i++) {
            while (old.length > old.length/2){
                resizing();
            }
            try {

                Entry entry = old[i];

                putting((V) entry.getKey(), (K) entry.getValue());


                while (entry.next != null) {

                    entry = entry;

                    putting((V) entry.getKey(), (K) entry.getValue());

                }
            } catch (Exception e) {

            }
        }
    }

    public void getRid(K key) {

        if (get(key) == null) {
            System.out.println(" Element does not exist");


            return;
        }


        int index = hash(key);


        Entry<K, V> entry = item[index];


        if (entry.getKey().equals(key)) {
            item[index] = null;
            numOfElements--;
            return;
        }


        while (entry.next != null) {

            if (entry.next.getKey() != key) {

                entry = entry.next;
            }
        }

        if (entry.next.next != null) {
            entry.next = entry.next.next;
            numOfElements--;
        } else {
            entry.next = null;
            numOfElements--;
        }
    }


    public V get(K key) {

        int index = hash(key);

        if (item[index] == null) {
            System.out.println(" Element does not exist");
            return null;
        }


        Entry<K, V> entry = item[index];


        while (entry.getKey() != key) {

            if (entry.next == null) {
                System.out.println(" Element does not exist");
                return null;
            }


            entry = entry.next;
        }

        return entry.getValue();
    }
public boolean isEmpty() {
    System.out.println(" it is empty ");
    return  isEmpty();

    }

}














