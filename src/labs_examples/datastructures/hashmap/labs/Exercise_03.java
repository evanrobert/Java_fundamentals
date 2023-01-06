package labs_examples.datastructures.hashmap.labs;

import java.util.*;

/**
 * HashMaps Exercise_02
 * <p>
 * Create a new class that does the following:
 * <p>
 * 1) create a LinkedList
 * 2) create a Stack
 * 3) create a Queue
 * 4) create a HashMap
 * <p>
 * Then, add millisecond timers before and after each data structure above and print out
 * how long it takes for each to complete EACH the following tasks, and the total time for
 * each data structure:
 * <p>
 * 1) add 100 elements
 * 2) update 100 elements
 * 3) search for 100 elements
 * 4) delete 100 elements
 */


public class Exercise_03 {


    public static void main(String[] args) {



        Long startTime = System.currentTimeMillis();

        //queue();
        //stack();
hash100();

        Long endTIme = System.currentTimeMillis();
        System.out.println(" it took " + (endTIme - startTime) + " milliseconds ");

    }

    public static int forLoopFor100Methods() {
        int count = 0;
        for (int i = 0; i <= 100; i++) {
            count = i;
        }
        return count;
    }

    public static Iterator queue() {
        Queue queue = new PriorityQueue();
        queue.add(forLoopFor100Methods());
        Iterator iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            System.out.println(queue.size());

        }

        return iterator;
    }


    public static Stack stackremove() {
        Stack stack = new Stack();
        stack.add(forLoopFor100Methods());
        stackremove();
        return stack;
    }

    public static HashMap hash100() {
        HashMap hashMap = new HashMap();
        hashMap.put(forLoopFor100Methods(), 100);
        System.out.println(hashMap);
        return hashMap;
    }
}




























