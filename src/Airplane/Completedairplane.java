package Airplane;

public class Completedairplane {
    public static void main(String[] args) {
        Engine myEngine = new Engine(250, "General Eletric ", true);
        interior MyEnterior = new interior(550, true, 50.00);
        specs mySpecs = new specs(2020, "Boeing", 2l);
        design myDesign = new design("boeing747", 75, 'b');
        Airplane myAirplane = new Airplane(57.000, 53, 3f);


    }}
