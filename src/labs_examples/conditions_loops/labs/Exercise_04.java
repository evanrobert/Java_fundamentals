package labs_examples.conditions_loops.labs;

import java.util.ArrayList;
import java.util.List;

/**
 * Conditions and Loops Exercise 4: Even numbers
 *
 *      Using a "for-loop", print out all even numbers from 1-100.
 *
 */

public class Exercise_04 {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {

   //     for(int minions =2 ; minions<=100; minions= minions +2){
   //     System.out.println(minions +" minions "  );

        List<String> nums = new ArrayList<>();
        nums.add("1");
        nums.add("2");



        for (int n = 0; n <= 100; n++) {
            if (isEven(n)) {
                System.out.println("Minions: " + n);
            } else {
                System.out.println("Odd Minion");
            }


}}}
