package labs_examples.datastructures.hashmap.labs;

import java.util.*;

public class queueobjectives {

    public static long timer() {
        Long startTime = System.currentTimeMillis();



//queue();
// searchingQueue();
// updateQueue();
// removes();

        Long endTIme = System.currentTimeMillis();
        System.out.println(" it took " + (endTIme - startTime) + " milliseconds " + queue());

return  timer();

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
        }
        return iterator;
    }

    public static Queue removes() {
      Queue queue = new PriorityQueue();
        queue.add(forLoopFor100Methods());
        queue.removeAll(queue);

        return queue;
    }

    public static int searchingQueue() {
 Queue queue = new PriorityQueue();
 queue.containsAll(Collections.singleton(forLoopFor100Methods()));
 return searchingQueue();
    }

    public static boolean updateQueue() {
        Queue queue = new PriorityQueue();
        queue.retainAll(Collections.singleton(forLoopFor100Methods()));
        return queue.retainAll(Collections.singleton(forLoopFor100Methods()));
    }

}
