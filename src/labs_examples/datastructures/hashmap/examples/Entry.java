package labs_examples.datastructures.hashmap.examples;

/**
 * A Key-Value Pair
 */
public class Entry<K, V> {
    private K key;
    private V value;
    // it means this is a LinkedList
    public Entry next = null;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
