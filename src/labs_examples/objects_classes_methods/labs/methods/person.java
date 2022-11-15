package labs_examples.objects_classes_methods.labs.methods;

public class person {
    int age;
    double height;
    String name;


    public person(){}

    public person(int age , double height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }


    @Override
    public String toString() {
        return "person{" +
                "age=" + age +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }





}
