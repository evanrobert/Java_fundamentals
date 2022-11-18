package labs_examples.static_nonstatic.labs;

public class classb {
    public static void differentclass() {
        System.out.println("Ha- Ha");


    }
    public int nonStaticMethod(int a,int b){
        return a + b;


    }
    public void fromdifferentclass(){
        System.out.println(" this is actually from class B, pretty cool ");

    }
    public static int staticclass(int a, int b ){
        return a - b ;

    }
}
