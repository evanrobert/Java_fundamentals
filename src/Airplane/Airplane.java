package Airplane;

public class Airplane {
    double fuelCapactiy;
    int currentFuelLevel;
    float milesToDestination;

    public Airplane(double fuelCapactiy, int currentFuelLevel, float milesToDestination) {
        this.fuelCapactiy = fuelCapactiy;
        this.currentFuelLevel = currentFuelLevel;
        this.milesToDestination = milesToDestination;

    }

    public double getFuelCapactiy() {
        return fuelCapactiy;
    }

    public void setFuelCapactiy(double fuelCapactiy) {
        this.fuelCapactiy = fuelCapactiy;
    }

    public int getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(int currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    public float getMilesToDestination() {
        return milesToDestination;
    }

    public void setMilesToDestination(float milesToDestination) {
        this.milesToDestination = milesToDestination;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "fuelCapactiy=" + fuelCapactiy +
                ", currentFuelLevel=" + currentFuelLevel +
                ", milesToDestination=" + milesToDestination +
                '}';
    }

}
