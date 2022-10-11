package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        int[][] twod = new int[5][5];
        for (int a = 3; a < twod.length; a = a * 3){
            for(int b = 0; b < twod[a].length; b++) {
                twod[a][b] = a * b;
                System.out.print(twod[a][b] + " | ");
            }
                System.out.println();


    }}}
