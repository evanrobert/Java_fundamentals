package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Run the class below and study the output. What prints and why?
 *
 * Your answer: It prints 10 because A is the parent class to start. And once we wrote A a = new B(). The vaule of 10 would
 * be assigned to B.
 *
 */
class A {
    int i = 10;
}

class B extends A{
    int i = 20;
}

public class Exercise_02 {

    public static void main(String[] args) {
        A a = new B();

        System.out.println(a.i);
    }
}