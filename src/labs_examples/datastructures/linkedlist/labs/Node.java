package labs_examples.datastructures.linkedlist.labs;

public class Node {
    public class Nodes<T> {
        T data;
        Nodes next;


        public Nodes(T data) {
            this.data = data;
            this.next = null;
        }

        public Nodes(T data, Nodes node) {
            this.data = data;
            this.next = node;

        }

    }
}
