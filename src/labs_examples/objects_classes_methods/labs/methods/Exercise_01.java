package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;

import java.util.Scanner;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {






        // please create the methods as instructed below then
        // call each of those methods from here, within the main()




    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * bstatic int Multiply(int a ,int b){
    }  public static int multiply(int a, int b ){
        a = 5;
        b = 2;
        return (a * b );}












    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
 public static int divide(int c, int d ){
    c= 5;
    d= 2;
    return (c / d );
}


    // 3) Create a static void method that will print of joke of your choice to the console

   public static String joke (){
        String knockknock = " knock knock, whose their? ...... crickets";
        return knockknock;
   }




    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
public static int yearstosecs  (String[]yearstoseconds) {
    int seconds = 31536000;
    Scanner scan = new Scanner(System.in);
    System.out.println(" Please enter the number of years ");
    int years = scan.nextInt();

    return (years * seconds);
}


    // 5) Create a varargs method that will return the length of the varargs array passed in
public  static ArrayList varargs(String[] args) {
    ArrayList vars = new ArrayList();
    vars.add("bill");
    vars.add("santa ");
    vars.add("geico");
    return vars;


}}









