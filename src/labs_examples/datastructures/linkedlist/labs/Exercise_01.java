package labs_examples.datastructures.linkedlist.labs;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *      LinkedLists - Exercise_01
 *
 *      Demonstrate your mastery of Java's built-in LinkedList class by demonstrating the following:
 *
 *      1) create a LinkedList (from Java's libraries)
 *      DONE
 *      2) add()
 *      DONE
 *      3) addAll()
 *      DONE
 *      4) addFirst()
 *      DONE
 *      5) addLast()
 *      DONE
 *      6) getFirst()
 *      DONE
 *      7) getLast()
 *      DONE
 *      8) get()
 *      DONE
 *      9) set()
 *      DONE
 *
 *      10) push()
 *      DONE
 *      11) pop()
 *      DONE
 *      12) remove()
 *      DONE
 *      13) contains()
 *      DONE
 *      14) listIterator()
 *      DONE
 *      15) clear()
 */


public class Exercise_01 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(7);
        list.add(1);
        list.addAll(4,list);
        list.addFirst(11);
        list.addLast(11);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(3));
        System.out.println(list.set(4,22));
        list.push(4);
        System.out.println(list.get(4));
        list.pop();
        System.out.println("-----------------");
        list.remove(2);
        System.out.println("-------------------");
       System.out.println(list.contains(1));
        System.out.println("--------------------");
        Iterator iter = list.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
            System.out.println("--------------");
            list.clear();
        }




    }
}