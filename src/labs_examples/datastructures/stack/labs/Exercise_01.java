package labs_examples.datastructures.stack.labs;

import java.util.Stack;

/**
 *      Demonstrate your mastery of Java's built-in Stack class by completing the following:
 *
 *      1) instantiate a new Stack
 *      2) demonstrate the use of EVERY method in the Stack class - there are 5
 */


public class Exercise_01 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("hello");
        stack.add("we");
        stack.add("are");
        stack.add("adding");
        stack.add("to");
        stack.add("the");
        stack.add("stack");
        System.out.println(stack.remove(5));
        System.out.println(stack);
        System.out.println(stack.peek());
       stack.pop();
        System.out.println(stack);
        stack.push("cool");
        System.out.println(stack);

    }
}