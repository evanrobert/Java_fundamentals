package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;
import java.util.Scanner;
public class MethodTraining {
    public static void main(String[] args) {



    }

    public void Method(double x, int y) {

    }

    public void Method(int a, double c, int b) {

    }

    {
        // pass by value
        int a = 5;
        int b = 2;
        System.out.println(" Before A " + a);
        System.out.println(" Before B " + b);

        someMethod(a, b);
        System.out.println(" After A " + a);
        System.out.println(" After B " + b);
    }

    public static void someMethod(int a, int b) {
        a = a * 10;
        System.out.println(a);
        b = b * 2;
        System.out.println(b);

    }

    {
// pass by reference
        person evan = new person(22, 72, "Evan ");
        System.out.println(evan);
    }

    public static void addHeightToPerson(person person) {
        person.height = person.height + 1;
    }


    //print largest number
    public static void nums(int a, int b, int c) {
        a = 1;
        a = 2;
        c = 3;
        if (a > b) {
            System.out.println(a);

        } else if (a < b) {
            System.out.println(b);
        } else if (c > a) {
            System.out.println(c);

        }
    }

    // print constants
    public static void count() {
        String Str = "example";
        int cCount = 0;
        Str = Str.toLowerCase();
        for (int i = 0; i < Str.length(); i++) {
            char ch = Str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                cCount++;
            }
            System.out.println(" Number of constants " + cCount);
        }
    }

    // find the constants
    public static void primeOrNot() {
        int i, enterNum, count = 0;
        Scanner Scan = new Scanner(System.in);
        enterNum = Scan.nextInt();

        System.out.println(" PLease enter a number ");
        for (i = 2; i <= enterNum / 2; i++) {
            if (enterNum % i == 0) {
                break;
            }
        }
        if (count == 0 && enterNum != 1) {
            System.out.println(enterNum + "is prime ");
        } else {
            System.out.println(enterNum + " is not prime ");
        }
    }


    static void reverse(int a[], int b) {
        int[] c = new int[b];
        int j = b;
        for (int i = 0; i < b; i++) {
            c[j - 1] = a[i];
            j = j - 1;
        }

        // printing the reversed array
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < b; k++) {
            System.out.println(c[k]);
        }

// Main method.
        int[] arr = {10, 20, 30, 40, 50};

        reverse(arr, arr.length);

    }

public static ArrayList<Integer> getDivisor(int maxNum, int divisor1, int divisor2) {
    ArrayList<Integer> divisibleValues = new ArrayList<>();
    for (int i = 0; i <= maxNum; i++) {
        if (i % divisor1 == 0 && i % divisor2 == 0) {
            divisibleValues.add(i);
        }}
    return divisibleValues;
}}












































