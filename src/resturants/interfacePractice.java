package resturants;

public class interfacePractice {
    protected int timeToGetToResturant;
    protected String resturantName;
    protected int timeFromOrderToTable;

    public interfacePractice(int timeToGetToResturant, String resturantName, int timeFromOrderToTable) {
        this.timeToGetToResturant = timeToGetToResturant;
        this.resturantName = resturantName;
        this.timeFromOrderToTable = timeFromOrderToTable;
    }

    public void setTimeToGetToResturant(int timeToGetToResturant) {
        this.timeToGetToResturant = timeToGetToResturant;
    }

    public void setResturantName(String resturantName) {
        this.resturantName = resturantName;
    }

    public void setTimeFromOrderToTable(int timeFromOrderToTable) {
        this.timeFromOrderToTable = timeFromOrderToTable;
    }

    public void run(){



    }
}
