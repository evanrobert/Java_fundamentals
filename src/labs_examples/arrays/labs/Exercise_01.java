package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {

        Scanner nums = new Scanner(System.in);
        System.out.println("please list 10 numbers with space in between each " );
        int values  = nums.nextInt();
        nums.nextInt();
        int[] Array = new int[10];
        for(int i = 0; i <10; i++){
            Array[i]= i+1;
        }
            int sum = 0;
            for(int i = values; i <10; i++)
            {
                sum += Array[i];

            }
        System.out.println(sum);



        }


}

