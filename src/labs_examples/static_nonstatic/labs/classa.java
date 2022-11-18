package labs_examples.static_nonstatic.labs;

public class classa {
    public static void main(String[] args) {
        //static-static same class
        double x = divide(50, 2);
        System.out.println(x);
        // Non-static in same class
        classa obj = new classa();
        int y = obj.multiply(50, 100);
        System.out.println(y);
        // Static different class
        classb.differentclass();
        //Non-Static different Class
        classb obj1 = new classb();
        int c = obj1.nonStaticMethod(5, 10);
        System.out.println(c);
        // Non-static Same class
        classa obj2 = new classa();
        obj2.nonStatic();
        //Non-Static different class
        classb obj3 = new classb();
        obj3.fromdifferentclass();
        //Non-static static different class
        classb obj4 = new classb();
        int r = classb.staticclass(50, 10);
        System.out.println(r);
        //Non-Static static Same class
        classa obj5 = new classa();
        obj5.lastOne();









    }
    public void  nonStatic(){
        System.out.println("This an a example ");
    }




    public int multiply(int a , int b ){
        return a * b;

    }
public static double divide (double a , double b){
        return a / b ;
}
public void lastOne(){
        System.out.println("this is the last one ");
}

}
