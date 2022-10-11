package labs_examples.arrays.labs;

import java.util.Arrays;
import  java.util.ArrayList;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        int[] example = {1,2,3,4,5,6};
        int[] temp = new int[example.length];
        for(int i = example.length -1;i>0 ;i--){
            temp[example.length -i -1] = example[i];


        example= temp;
        System.out.println(i);
    }}}












