package labs_examples.datastructures.stack.labs;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 *      Stacks - Exercise_02
 *
 *      Write a new custom (Generic) Stack class that uses a traditional Array as the underlying data structure
 *      rather than the LinkedList as in the example we have already seen.
 *
 *      Your custom Stack class must also do the following: (Ryan Take 2)
 *
 *      1) throw a custom exception when trying to pop an element from an empty Stack
 *      DONE
 *      2) resize the Stack (the underlying array) to be twice the size when the Stack is more than 3/4 full
 *      DONE
 *      3) resize the Stack (the underlying array) to be half the size when the Stack is more than 1/4 empty
 *      DONE
 *      4) contain the methods peekFirst() and peekLast()
 *      DONE
 *      5) contain a size() method
 *      DONE
 *      6) contain a method to print out the data of all elements in the Stack
 *      DONE
 *
 *      TIP: To initialize an new array of a Generic type you can use this:
 *           T[] data = (T[]) new Object[10];
 */


public class Exercise_02 <T> {

     public  T[] data = (T[]) new Object[10];

    public T pop() {
        T myObject = null;
        for (int i = data.length - 1; i <= 0; i--) {
            if (data[i] != null) {
                myObject = data[i];
                data[i] = null;


            }
        }
        return myObject;
    }

            public Object resizeFull() {
                int object = Integer.parseInt(null);
                for (int i = 0; i < data.length; i++) {
                    if (data.length >= .75) {
                        object = data.length * 2;


                    }
                }
                return object;
            }
            public int resizeEmpty () {
                int myObject = Integer.parseInt(null);
                for (int i = 0; i < data.length; i++) {
                    if (data.length < .25) {
                        myObject = data.length / 2;
                    }
                }
                return myObject;
            }
            public void peekFirst () {
                Arrays.stream(data).findFirst();


            }
            public Consumer<? super T> peekLast () {
                Arrays.stream(data).peek(peekLast());
                return null;
            }

            public double size (Double length ){
                double totalSize = data.length;
                return totalSize;
            }
            public void printElements () {
                for(int i=0; i<= data.length; i++){
                    System.out.println(i);
            }


        }

    }



