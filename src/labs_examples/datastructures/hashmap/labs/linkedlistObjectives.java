package labs_examples.datastructures.hashmap.labs;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class linkedlistObjectives {
    public static int forLoopFor100Methods() {
        int count = 0;
        for (int i = 0; i <= 100; i++) {
            count = i;
        }
        return count;
    }

    public static Iterator stack() {
     LinkedList list = new LinkedList(Collections.singleton(forLoopFor100Methods()));
        list.add(forLoopFor100Methods());
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        return (Iterator) list;
    }

    public static LinkedList removes() {
        LinkedList list = new LinkedList(Collections.singleton(forLoopFor100Methods()));
        list.add(forLoopFor100Methods());
       list.removeAll(list);

        return list;
    }

    public static LinkedList searchingLinkedList() {
       LinkedList list = new LinkedList(Collections.singleton(forLoopFor100Methods()));
       list.get(forLoopFor100Methods());
        return  list;
    }

    public static boolean updatelinkedList() {
        LinkedList list = new LinkedList(Collections.singleton(forLoopFor100Methods()));
        list.retainAll(Collections.singleton(forLoopFor100Methods()));
        return list.retainAll(Collections.singleton(forLoopFor100Methods()));
    }

}
