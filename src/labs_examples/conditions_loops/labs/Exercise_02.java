package labs_examples.conditions_loops.labs;

import com.sun.jdi.Value;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {
    public static void main(String[] args) {


        // write completed here


        Scanner num1 = new Scanner(System.in);
        System.out.println("enter a number 1-7: ");

        int x = num1.nextInt();


            if(x ==1)  {
                System.out.println("Monday");
            }else if (x==2)  {
                System.out.println("tuesday");
            }else if (x==3) {
                System.out.println("wensday");
            } else if (x==4) {
                System.out.println("thursday");
            } else if (x==5) {
                System.out.println("friday");
            } else if (x==6) {
                System.out.println("saturday");
            }else {System.out.println("other");}

            num1.close();

            }

        }















