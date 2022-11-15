package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b) {
            System.out.println("a or b is true");

        }

        // write your code below
        boolean c = true;
        boolean d = false;
        if (!d) ;
        {
            System.out.println(d);

        }
        boolean e = true;
        boolean f = false;
        if (e && f) ;
        System.out.println("this will not work");

    boolean g = true;
    boolean h = false;
    if (g^h);{
        System.out.println(g);
                boolean i = true;
                boolean j = false;
                if (i || j) {
                    System.out.println("i is true if j is true");
                    boolean k = true;
                    boolean l = false;
                    if (k && l) ;
                    System.out.println("This is and");
        }}}}



