package labs_examples.datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 2: Type conversion and casting
 *
 *      Write the necessary code to demonstrate type conversion:
 *
 *      Widening:
 *      1. Declare and initialize an int with the value 10
 *      2. Declare a double and set it equal to the int
 *      3. Print out the double
 *
 *      Narrowing (with casting):
 *      1. Declare and initialize a new double with the value 10.5
 *      2. Declare a new int and set it equal to the double (make sure to cast the double to an int)
 *      3. Print out the int
 *
 *      Notice how each type is converted. In which direction is information lost?
 *
 */

public class Exercise_02 {




        // write code here
        public static void main(String[] args) {

            int x = 100;
            double a = 100;
            System.out.print(a);
           //end of 1st section

            double number = 10.5;
           int num = (int) 10.5;
           System.out.print(num);
           // end of second section


    }
}
