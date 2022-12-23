package labs_examples.lambdas.labs;
import java.util.function.*;

/**
 * Lambdas Exercise 2:
 *
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 *
 */


public class Exercise_02 {
    public static void main(String[] args) {
        firstExample();
        secondExample();
        thirdExample();
        fourthExample();
        fifthExample();
        sixthExample();
        seventhExample();
        eightExample();
        ninthExample();
        tenthExample();

    }
    public static void firstExample(){
    BiFunction<Integer,Integer,Integer> multiply =( value1, value2) -> {
        int valTotal = value2 * value1;
        return valTotal;
    };

        System.out.println(multiply.apply(10,10));
    }
    public static void secondExample(){
        Supplier<Double> sqrt = ()-> Math.sqrt(100);
        System.out.println(sqrt.get());
    }
    public static void thirdExample(){
        DoubleToIntFunction doubleToInt = (value -> (int) value);
        System.out.println(doubleToInt.applyAsInt(1375.2857));


            }
            public static void fourthExample(){
        IntFunction<Integer> e =(value -> value);
        System.out.println(e.apply(27));
            }
            public static void fifthExample(){
        Predicate<Integer> lessthan =  i -> (i < 10);
        Predicate<String> than = t -> (t.length()<10);
        System.out.println(lessthan.test(9));
        System.out.println(than.test(" !!!"));
            }
            public static void sixthExample(){
        LongFunction<Long> longFunction = (value -> value);
        System.out.println(longFunction.apply( 277782222));
            }
            public static void seventhExample(){
        Comparable<Integer> compare = (Integer::intValue);
        System.out.println(compare.compareTo(2));
            }
            public static void eightExample(){
        IntFunction<Integer> intFUnction = (value -> value);
        System.out.println(intFUnction.apply(17));
            }
            public static void ninthExample(){
        ToDoubleBiFunction<Double,Double> doubleBiFunction = (val1 , val2) -> val1 * val2;

        System.out.println(doubleBiFunction.applyAsDouble(5.25,2.0));

            }
            public static void tenthExample(){
        ToIntBiFunction<Integer,Integer> toIntBiFunction = (val1,val2) -> val1 - val2;
        System.out.println(toIntBiFunction.applyAsInt(22,11));
            }

        }







