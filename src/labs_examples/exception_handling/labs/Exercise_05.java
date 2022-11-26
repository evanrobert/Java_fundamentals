package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Example {
    public static void main(String[] args) {
        try {
            one();
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Exception was caught ");

        }
    }

    public static void one() throws ArrayIndexOutOfBoundsException {
        two();
    }


    public static void two() throws ArrayIndexOutOfBoundsException {
        int[] coolArray = {2, 5, 8, 10, 12 };
        try {
            int a = coolArray[10];
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Caught in two method ");
            System.out.println("throwing back up to main method");
            throw exc;
        }
    }
}