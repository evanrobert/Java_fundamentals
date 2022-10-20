package Airplane;

public class specs {
    int yearMade;
    String manufactuer;
    long priceSoldFor;

    public specs(int yearMade, String manufactuer, long priceSoldFor) {
        this.yearMade = yearMade;
        this.manufactuer = manufactuer;
        this.priceSoldFor = priceSoldFor;
    }

    public int getYearMade() {
        return yearMade;
    }

    public void setYearMade(int yearMade) {
        this.yearMade = yearMade;
    }

    public String getManufactuer() {
        return manufactuer;
    }

    public void setManufactuer(String manufactuer) {
        this.manufactuer = manufactuer;
    }

    public long getPriceSoldFor() {
        return priceSoldFor;
    }

    public void setPriceSoldFor(long priceSoldFor) {
        this.priceSoldFor = priceSoldFor;
    }

    @Override
    public String toString() {
        return "specs{" +
                "yearMade=" + yearMade +
                ", manufactuer='" + manufactuer + '\'' +
                ", priceSoldFor=" + priceSoldFor +
                '}';
    }
}
