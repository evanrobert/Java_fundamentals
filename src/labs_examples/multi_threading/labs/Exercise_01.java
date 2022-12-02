package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */



public class Exercise_01 {
    public static void main(String[] args) {
        System.out.println("system will begin running ");
      Exercise_001 ex = new Exercise_001("Test ");
      ex.thread.setPriority(Thread.NORM_PRIORITY + 1);
        System.out.println(" end of main method ");
        Exercise_001 ex1 =  new Exercise_001(" test method 2 ");
        ex1.thread.setPriority(Thread.NORM_PRIORITY + 2);
        ex1.run();

    }
    public static class Exercise_001 implements Runnable{
        Thread thread;

    public Exercise_001(String name) {
        thread = new Thread(this, name);
        thread.start();
    }



@Override
     public void run(){
        System.out.print(thread.getName() + " System starting ");
        try {
            for(int count =0; count< 6; count++){
                Thread.sleep(200);
                System.out.println(  thread.getName() + " count is " + count);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    }
}




