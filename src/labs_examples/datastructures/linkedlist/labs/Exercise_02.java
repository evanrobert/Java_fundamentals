package labs_examples.datastructures.linkedlist.labs;

import labs_examples.datastructures.linkedlist.examples.Node;

/**
 * LinkedLists - Exercise_02
 * <p>
 * Write your own custom LinkedList class. Although it can mimic the CustomLinkedList
 * class we used here, it must be entirely unique. Please also add at least two
 * additional helper methods that you think could be useful. Refer to Java's built-in
 * LinkedList class for inspiration. Your new LinkedList class should ONLY allow users
 * to add and remove elements from the front of the list AND the end of the list.
 * Also, instead of using the index in the get() and remove() methods, these methods should
 * get() and remove() based by the Node's value, not it's index.
 */


public class Exercise_02<T> {
    private Node head;

    public Exercise_02(T... data) {

        if (data.length < 1) {

            head = null;
        } else {

            for (int x = 0; x < data.length; x++) {
                addMethod(data[x]);
            }
        }
    }
    public void addMethod(T data) {

        insertMethod(data);
    }


    public void insertMethod(T data) {

        if (head == null) {
            head = new Node(data);
        } else {

            Node cycle = head;


            while (((Node<?>) cycle).next != null) {
                cycle = cycle.next;
            }

            cycle.next = new Node (data);

        }
    }

    public void removeMethod(int pointer) {
        if (pointer == 0) {


            head = head.next;

        } else if (pointer < sizeMethod()) {

          try {
              int count = 0;
                Node previous = null;
                Node iterator = head;
                while (count != pointer) {
                    previous = iterator;
                    iterator = iterator.next;
                    count++;
                }


                previous.next = iterator.next;
            } catch (NullPointerException ex) {
                System.out.println("invalid pointer");
            }
        } else {

            Node iterator = head;


            while (iterator.next != null) {
                iterator = iterator.next;
            }
            iterator.next = null;
        }
    }
    public int sizeMethod() {
        int count = 0;
        Node iterator = head;


        while (iterator != null) {
            count++;
            iterator = iterator.next;
        }

        return count;
    }

}







