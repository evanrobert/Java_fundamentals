package labs_examples.datastructures.queue.labs;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *      Demonstrate your mastery of Java's (sun's) built-in Queue class (as seen in the import statement
 *      above) by completing the following:
 *
 *      1) instantiate a new Queue
 *      2) demonstrate the use of EVERY method in the Queue class - there are 7
 */



public class Exercise_01 {
    public static void main(String[] args) {
        Queue queue = new PriorityQueue();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.add("7");
        queue.add("11");
        System.out.println(queue.peek());
        System.out.println("----------");
        System.out.println(queue.poll());
        System.out.println("-----------");
        boolean has = queue.contains("2");
        System.out.println("contains 2 is: " + has);
        System.out.println("-----------");
        for (Object s : queue) {
            System.out.println(s);
        }
        String s = (String) queue.remove();
        System.out.println(s);
        System.out.println("---------");
        String getElement = (String) queue.element();
        System.out.println(getElement);
        System.out.println("----------");
        queue.clear();
    }
    }
