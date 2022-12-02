package labs_examples.multi_threading.labs;


/**
 * Multithreading Exercise 5:
 * <p>
 * Demonstrate the use of a wait() and notify()
 */


class Exercise_05 {
    public static void main(String[] args) {
        Exercise_05 to = new Exercise_05();
        Exercise ones = new Exercise("$", to);
        Exercise two = new Exercise("*", to);


        try {
            ones.thread.join();
            two.thread.join();
        } catch (InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }}


    String result;

    synchronized void one(boolean running) {
        if (!running) {
            result = "$";
            notify();
            return;
        }

        System.out.print("$");

        result = "$";

        notify();
        try {
            while (!result.equals("*"))
                wait();
        } catch (InterruptedException exc) {
            System.out.println("Thread interrupted.");
        }
    }

    synchronized void two(boolean running) {
        if (!running) {
            result = "*";
            notify();
            return;
        }

        System.out.println("*");

        result = "*";

        notify();
        try {
            while (!result.equals("$"))
                wait();
        } catch (InterruptedException exc) {
            System.out.println("Thread has been  interrupted.");
        }
    }
}

class Exercise implements Runnable {
    Thread thread;
    Exercise_05 OT;


    Exercise(String name, Exercise_05 to) {
        thread = new Thread(this, name);
        OT = to;
        thread.start();

    }


    public void run() {

        if (thread.getName().compareTo("$") == 0) {
            for (int i = 0; i < 5; i++)
                OT.one(true);
            OT.one(false);
        } else {
            for (int i = 0; i < 5; i++)
                OT.two(true);
            OT.two(false);
        }
    }
}




        






