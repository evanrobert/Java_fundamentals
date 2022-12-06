package labs_examples.generics.labs;

import java.util.ArrayList;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList. Demonstrate how to call this method from the main() method.
 */

class Demo {
    public static <E> void genericMethod(E[] nums) {
        for (E evan : nums) {
            System.out.printf("%s", evan);

        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3, 4, 5};

        int sum = 0;
        for(int i = 0; i < integerArray.length; i++) {
            sum += integerArray[i];
        }

            System.out.println( " sum is " + sum );


}}