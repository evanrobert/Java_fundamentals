package labs_examples.conditions_loops.labs;
import java.util.Scanner;
/**
 * Conditions and Loops Exercise 3: Months of the year
 *
 *      Take in a number from the user and print "January", "February", ... "December", or "Other"
 *      if the number from the user is 1, 2,... 12, or other respectively. Use a "switch" statement.
 *
 */

public class Exercise_03 {
    public static void main(String[] args) {
      Scanner scan=  new Scanner(System.in);
      System.out.println("please print your number 1-5 september is " +
              "one, october is two november is 3, december is 4 and other is 5");
      int x = scan.nextInt();
      switch  (x){
            case 1:
                System.out.println("this is September");
                break;
          case  2:
              System.out.println("this is october");
              break;
          case 3:
              System.out.println("this is november" );
              break;
          case 4:
              System.out.println("this is december");
              break;
          case 5:
              System.out.println( "this the rest of the months ");
              break;

        }
    }

}
