package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 *
 *
 */
class Exercise_02 extends Thread {
    Exercise_02(String name){
        super(name);
        start();
    }
    public void run() {

        System.out.println(getName() + "Starting now ");
        try {
            for (int a = 0; a < 10; a++)
                Thread.sleep(500);
            System.out.println(" count is " + getName());
        } catch (InterruptedException e) {
            System.out.println(" Caught exception ");
        }
    }

    public static void main(String[] args) {
        System.out.println("**** Starting ****");

        Exercise_02 test = new  Exercise_02(" cool ");
        for(int i =0; i <20; i++){
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                System.out.println("Interrupted ");
            }

        }



    }
}

