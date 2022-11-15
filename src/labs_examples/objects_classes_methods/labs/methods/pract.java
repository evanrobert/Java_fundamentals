package labs_examples.objects_classes_methods.labs.methods;

import java.util.Arrays;

// Basic Java program that reverses an array

public class pract{

    // function that reverses array and stores it
    // in another array
    public static void main(String[] args) {

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


        int[] arr = {10, 20, 30, 40, 50};

        reverse(arr, arr.length);

    }
}
