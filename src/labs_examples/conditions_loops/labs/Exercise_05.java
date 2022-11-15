package labs_examples.conditions_loops.labs;
import java.util.Scanner;
/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 1st number");
        int num1 = scan.nextInt();
        System.out.println("Enter second number  ");
        int num2 = scan.nextInt();
        int sum = 0;
        float avg = 0;
        //calculate the sum*
        for (int calc = num1; calc <= num2; calc++) {
            sum = sum + calc;
        }
        System.out.println("This is the sum: " + sum);
       // calculate the average*
        avg = (num1+num2)/2f;
        System.out.println("This is the average: "+avg);
    }}