package labs_examples.generics.labs;

import java.util.*;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *      done
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes
 *

 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *          Done.
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *      Done
 */
public class Exercise_03 {


    public static void main(String[] args) {
        double a = (2.4 + 3.2f);
        System.out.println(a);

        palindromesCollection(new HashSet<>());
        HashSet cool = new HashSet<>();
        cool.add("two");
        cool.add("three");
        cool.add("dad");
        cool.add("maam");
        palindromesCollection(cool);

        System.out.println(palindromesCollection(cool));





        List<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        strings.add("E");
        System.out.println("the original list : \n " + strings);
        switchPosition((ArrayList<?>) strings, 0, 4);
        ArrayList e = new ArrayList<>();
        e.add(22);
        e.add(21);
        e.add(27);
        e.add(2);
        e.add(100);

       System.out.println(largestElement(e,0,5));








    }


    public static <E extends Number, T extends Number> Double sum(E e, T t) {


        return e.doubleValue() + t.doubleValue();


    }

    public static String palindromesCollection(Collection<String> palindromes) {
        int totalCount = 0;
        for (String myString : palindromes) {
            int lastIndex = myString.length();

            for (int i = 0; i > myString.length() / 2; i++) {
                if (myString.charAt(i) != myString.charAt(myString.length() - 1 - i)) {

                    totalCount += 1;
                }
            }

        }

        return palindromes.toString();
    }

    public static void switchPosition(ArrayList<?> list, int indexOne, int indexTwo) {
        Collections.swap(list, indexOne, indexTwo);
        System.out.println(" New list is : \n " + list);

    }
    public static <E extends Comparable<? super E> > E largestElement(List <E> list, int start, int end ){
        return  list.subList(start,end).stream().max(Comparator.naturalOrder()).orElseThrow(IllegalAccessError::new);
        }




    }















