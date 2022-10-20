package Airplane;

public class interior {
    int totalPassengersAllowed;
    boolean planeFilled;
    double carryOnWeightAllowed;

    public interior(int totalPassengersAllowed, boolean planeFilled, double carryOnWeightAllowed) {
        this.totalPassengersAllowed = totalPassengersAllowed;
        this.planeFilled = planeFilled;
        this.carryOnWeightAllowed = carryOnWeightAllowed;
    }

    public int getTotalPassengersAllowed() {
        return totalPassengersAllowed;
    }

    public void setTotalPassengersAllowed(int totalPassengersAllowed) {
        this.totalPassengersAllowed = totalPassengersAllowed;
    }

    public boolean isPlaneFilled() {
        return planeFilled;
    }

    public void setPlaneFilled(boolean planeFilled) {
        this.planeFilled = planeFilled;
    }

    public double getCarryOnWeightAllowed() {
        return carryOnWeightAllowed;
    }

    public void setCarryOnWeightAllowed(double carryOnWeightAllowed) {
        this.carryOnWeightAllowed = carryOnWeightAllowed;
    }

    @Override
    public String toString() {
        return "interior{" +
                "totalPassengersAllowed=" + totalPassengersAllowed +
                ", planeFilled=" + planeFilled +
                ", carryOnWeightAllowed=" + carryOnWeightAllowed +
                '}';
    }
}
