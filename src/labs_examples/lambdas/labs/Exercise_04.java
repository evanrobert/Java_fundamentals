package labs_examples.lambdas.labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.IntPredicate;
import java.util.function.Supplier;
import java.util.logging.Filter;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Lambdas Exercise 4:
 * <p>
 * Stream API Labs
 * <p>
 * 1) Demonstrate the use of the range function to print out the numbers 1 through 15 (inclusive)
 * DONE
 * 2) Demonstrate the use of the sum function to determine the range of a set of numbers.
 * DONE
 * 3) Demonstrate the use of the map() function to alter each int in a List of Integers, then use the sum function
 * to get the sum of the modified list
 * DONE
 * 4) Demontrate the filter function by filtering out all Integers that are less than 10 - then use the average
 * function to average the remaining numbers, assign this result to an int variable.
 * DONE
 * 5) Demonstrate the reduce() function to determine the sum of a list of Integers
 * DONE
 * 6) Demontsrate how to Stream a text file and print out each line
 * DONE
 * <p>
 * 7) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 * the print out the element at the 1 index for each array.
 * NEED HELP
 * <p>
 * 8) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 * the print out the sum of all elements at index 2.
 * NEED HELP
 * 9) Demonstrate the anyMatch() function.
 * Done
 * 10) Demonstrate the allMatch() function.
 * DONE
 * 11) Demonstrate the collect() terminal operation to store resulting values into a List
 * DONE
 */

class Example {
    public static void main(String[] args) throws IOException {
        String files1 = "src/labs_examples/input_output/files/char_data.txt";
        String files2 = "src/labs_examples/input_output/files/char_data_copy.txt";
        System.out.println();
        IntStream
                .rangeClosed(1, 15)
                .forEach(System.out::print);

        System.out.println();
        System.out.println(IntStream.range(1, 5).sum());

        System.out.println("\n--------------6");
        int[] c = {1, 2, 2, 2, 2, 2, 2};
        System.out.println(Arrays.stream(c).map(a -> a - 1).sum());

        System.out.println("\n--------------");
        int total = Stream.of(3, 5, 7, 9)
                .reduce(0, (Integer a, Integer b) -> a + b);
        System.out.println("total is " + total);

        System.out.println(" \n -------------8");
        Stream<String> newFile = Files.lines(Paths.get(files1));
        newFile.forEach(System.out::println);
        newFile.close();
        String fileex = "src/labs_examples/lambdas/labs/stream_text_lab.csv";
        System.out.println("\n -----------------");
        //need to figure out  Stream<String> newfile2 = Files.lines(Paths.get(fileex));
        // newfile2
        //     .map(x -> x.split(String[]));

        System.out.println("\n------------9..");
        List<String> s = Arrays.asList("Sunday", "monday,", "tuesday", "wensday", "thursday", "friday", "Saturday");
        boolean isElement = s.stream()
                .anyMatch(x -> x.startsWith("S"));
        System.out.println(" matching elements in list s =  " + isElement);

        System.out.println("\n------------ 10...");
        List<String> t = Arrays.asList("Sunday", "monday,", "tuesday", "wensday", "thursday", "friday", "Saturday");
        boolean isElements = s.stream()
                .allMatch(y -> y.contains("T"));
        System.out.println(" do any begin with t " + isElements);
        System.out.println("\n----------------- 11..");
        List<String> vowels = List.of("A", "E", "I", "O", "U");
        StringBuilder result = vowels.stream().collect(StringBuilder::new, (x, y) -> x.append(y),
                (a, b) -> a.append(",").append(b));
        System.out.println(result);
        System.out.println("\n--------------4");
        List<Integer> cool = Arrays.asList(2, 4, 5, 6, 7, 8, 20, 50, 100);
        System.out.println("\n----------- 8");

        List<String> lines = new ArrayList<>();

        try {
            FileReader file = new FileReader( "src/labs_examples/lambdas/labs/stream_text_lab.csv");
            BufferedReader br = new BufferedReader(file);
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



        lines.stream().forEach(ln -> {
            List<String> words = List.of(ln.split(","));
            System.out.println(words.get(1));
        });



        //bands2.close();


    }


}




















    
