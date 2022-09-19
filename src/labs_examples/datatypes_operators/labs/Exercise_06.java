package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {
        double volume =Math.PI*3.14*3.14*5;
        System.out.println("volume equals " +volume);
        //volume =6.28
        double surface_area = 2* Math.PI* 3.14 * (3.14 + 5);
        System.out.println("surface area equals " +surface_area);

        // write code here

    }
}