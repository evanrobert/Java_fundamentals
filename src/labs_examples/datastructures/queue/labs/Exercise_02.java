package labs_examples.datastructures.queue.labs;

import java.util.Arrays;
import java.util.function.Consumer;

/**
 *      Queues - Exercise_02
 *
 *      Write a new custom (Generic) Queue class that uses a traditional Array as the underlying data structure
 *      rather than the LinkedList as in the example we have already seen.
 *
 *      Your custom Queue class must also do the following:
 *
 *      1) throw a custom exception when trying to pop  an element from an empty Queue
 *      2) resize the Queue (the underlying array) to be twice the size when the Queue is more than 3/4 full
 *      3) resize the Queue (the underlying array) to be half the size when the Queue is more than 1/4 empty
 *      4) contain the methods peekFirst() and peekLast()
 *      5) contain a size() method
 *      6) contain a method to print out the data of all elements in the Queue
 *
 */
public class Exercise_02<T> {
    private boolean isEmpty;

    T[] data = (T[]) new Object[100];

    public boolean isEmpty() {
        isEmpty = true;
return isEmpty=true;
    }

    public int resizeFull() {
        int x = Integer.parseInt(null);
        for(int i =0; i < data.length; i++){
            if(data.length > .75){
                x = data.length * 2;
            }

        }
        return(x);

    }
    public int resizeEmpty() {
        int x = 0;
        for (int i = 0; i < data.length; i++) {
            if (data.length <= 25) {
                x = data.length / 2;
            }
        }
        return (x);
    }
    public void peekFirst(){
        Arrays.stream(data).findFirst();



    }
    public Consumer<? super T> peekLast(){
        Arrays.stream(data).peek(peekLast());
        return null;
}
    public double size(Double length ){
        double totalSize =   data.length;
        return totalSize;
    }
    public void printElements() {
        System.out.println(data.toString());
    }}
