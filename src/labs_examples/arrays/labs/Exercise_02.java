package labs_examples.arrays.labs;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.List;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.print("Array");
        printArray(array);
        System.out.print("Enter Searched Element: ");
        Scanner number = new Scanner(System.in);
        System.out.println("please enter a number 1-10");
        int item = number.nextInt();
        int index = -1;
        for(int i = 0; i < array.length; i++)
        {
            if (array[i]==item)
            {
                index = i;
                break;
            }
        }
        if(index== -1)
            System.out.println("index not found " + item);
            else
            System.out.println(" entered element is " + item + " which is present at index " + index);
        }
         static void printArray(int arr[])
         { for(int i = 0; i < arr.length; i++)
             System.out.print(arr[i]+" ");
             System.out.println();
        // write code here


    }
}