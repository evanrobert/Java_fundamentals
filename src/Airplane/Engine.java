package Airplane;

public class Engine {
    int engineHorsePower;
    String engineBrand;
    Boolean engineInspected;

    public Engine(int engineHorsePower, String engineBrand, Boolean engineInspected) {
        this.engineHorsePower = engineHorsePower;
        this.engineBrand = engineBrand;
        this.engineInspected = engineInspected;
    }

    public int getEngineHorsePower() {
        return engineHorsePower;
    }

    public void setEngineHorsePower(int engineHorsePower) {
        this.engineHorsePower = engineHorsePower;
    }

    public String getEngineBrand() {
        return engineBrand;
    }

    public void setEngineBrand(String engineBrand) {
        this.engineBrand = engineBrand;
    }

    public Boolean getEngineInspected() {
        return engineInspected;
    }

    public void setEngineInspected(Boolean engineInspected) {
        this.engineInspected = engineInspected;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineHorsePower=" + engineHorsePower +
                ", engineBrand='" + engineBrand + '\'' +
                ", engineInspected=" + engineInspected +
                '}';
    }
}

