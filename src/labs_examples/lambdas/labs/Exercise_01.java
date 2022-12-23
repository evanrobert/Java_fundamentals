package labs_examples.lambdas.labs;

import labs_examples.lambdas.examples.functional_interfaces.FunctionalInterfaceExample;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Lambdas Exercise 1:
 * <p>
 * 1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 * * done
 * <p>
 * 2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 * an anonymous inner class from this interface.
 * DONE
 * <p>
 * <p>
 * <p>
 * 3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 * value of the same type as the parameter
 * DONE
 * 4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 * an anonymous inner class from this interface.
 * DONE
 * <p>
 * 5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 * value DONE
 * <p>
 * 6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 * an anonymous inner class from this interface.
 * DONE
 * <p>
 * 7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 * DONE
 */


public class Exercise_01 {
    public static void main(String[] args) {
        twoExamples2();
        twoExamples1();
        twoParamInterface two = (num1, num2) -> num1 * num2;
        System.out.println(two.twoInts(5.32, 7));


        oneParamInterface o = (num) -> num + 10;
        System.out.println(o.addTen(20));


        empty cool = () -> {
            System.out.println(" this is a lambda ");

        };
        cool.calculate();

    }

    public static void twoExamples1() {
        BiFunction<Integer, Integer, Integer> c = (val1, val2) -> {
            int x = val1 * val2;
            return x;
        };
        System.out.println(c.apply(22, 22));
    }

    public static void twoExamples2() {
        Supplier<Double> random = () -> Math.random();
        System.out.println(random.get());
    }

    @FunctionalInterface
    public interface empty {
        void calculate();
    }

    @FunctionalInterface
    interface oneParamInterface {
        int addTen(int a);


    }

    @FunctionalInterface
    interface twoParamInterface {
        double twoInts(double a, double b);

    }

}
















