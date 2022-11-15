package labs_examples.arrays.labs;
import java.util.ArrayList;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        int[][] twoD = new int[5][8];
        for(int x =1; x < twoD.length; x++){
            for(int y =2; y< twoD[x].length; y= y +2) {
                twoD[x][y] = x * y;
                System.out.print(twoD[x][y] + "|"  + "|" );
            }
                System.out.println();

            }
        }}


