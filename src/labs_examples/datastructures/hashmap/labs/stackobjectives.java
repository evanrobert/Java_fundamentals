package labs_examples.datastructures.hashmap.labs;

import java.util.*;

public class stackobjectives {
    public static long timer() {
        Long startTime = System.currentTimeMillis();


        stack();

        //removes();
        // searchingStack();
        // updateStack();
        Long endTIme = System.currentTimeMillis();
        System.out.println(" it took " + (endTIme - startTime) + " milliseconds " + stack());


        return timer();
    }

    public static int forLoopFor100Methods() {
        int count = 0;
        for (int i = 0; i <= 100; i++) {
            count = i;
        }
        return count;
    }

    public static Iterator stack() {
        Stack stack = new Stack();
        stack.add(forLoopFor100Methods());
        Iterator iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        return iterator;
    }

    public static Stack removes() {
        Stack stack = new Stack();
        stack.add(forLoopFor100Methods());
        stack.removeAll(stack);

        return stack;
    }

    public static int searchingStack() {
        Stack stack = new Stack();
        stack.search(forLoopFor100Methods());
        return stack.search(forLoopFor100Methods());
    }

    public static boolean updateStack() {
        Stack stack = new Stack();
        stack.retainAll(Collections.singleton(forLoopFor100Methods()));
        return stack.retainAll(Collections.singleton(forLoopFor100Methods()));
    }

}
