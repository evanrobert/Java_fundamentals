package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */
class first {
    private int total;

 int first(int nums[]) {
     total = 0;

        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            System.out.println("the total is " + Thread.currentThread().getName() + total);

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println("thread interrupted ");
            }
        }
        return total;
    }
}


class second implements Runnable{
    Thread thread;
    static first b = new first();
    int a[];
    int answer;


second(String name , int answer[]){
    thread = new Thread(this , name);
    a = answer;
    thread.start();
}
public void run(){
    int sum;
    System.out.println(thread.getName() + "name ");
    answer = b.first(a);
    System.out.println("Sum for " + thread.getName() +
            " is " + answer);

    System.out.println(thread.getName() + "ending now ");
}
}












public class Exercise_04 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        second one = new second(" Christmas ",a);
      second two = new second(" Time ", a);
      try {


          one.thread.join();
          two.thread.join();
      }catch (InterruptedException exc){
          System.out.println("the main thread has been interrupted ");
      }



    }
}