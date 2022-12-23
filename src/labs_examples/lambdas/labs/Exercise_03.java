package labs_examples.lambdas.labs;

import java.util.function.BiFunction;

/**
 * Lambdas Exercise 3:
 * <p>
 * 1) Demonstrate the use of a static method reference
 * 2) Demonstrate the use of an instance method reference
 * 3) Demonstrate the use of a constructor reference
 */


public class Exercise_03 {


    public static <users> void main(String[] args) {
        BiFunction<Integer, Integer, Integer> integerBiFunction = Exercise_03::multiply;
        int x = multiply(10, 10);
        System.out.println(x);
        Exercise_03 obj = new Exercise_03();
        thisInterface ref = obj::instanceMethod;
        ref.print();

//Error here???
     //   userGenerator userGenerator = people :: new;
     //   people evan = userGenerator.createUser("Evan", "lindsay");
     //   people elijah = userGenerator.createUser("Elijah", "Lindsay");
     //   System.out.println(elijah.toString());
      //  System.out.println(evan.toString());


    }


    public static int multiply(int a, int b) {
        return a * b;
    }

    public void instanceMethod() {
        System.out.println("this is an instance Method !! ");
    }


    @FunctionalInterface
    interface thisInterface {
        void print();
    }
    @FunctionalInterface
    interface userGenerator {
        people createUser(String firstName, String lastName);
    }

   public class people {
        String firstName;
        String lastName;


        public people(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        @Override
        public String toString() {
            return "User{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';


        }
    }
    }




