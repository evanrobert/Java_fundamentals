package resturants;

public class whereShouldWeEat {
    private int price;
    protected double reviews;
    private String knownFor;

    public whereShouldWeEat() {

    }
    public  void taste ( String tastesTheBest){
        System.out.println( " The burritos taste very good at this restaurant ");
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getReviews() {
        return reviews;
    }

    public void setReviews(double reviews) {
        this.reviews = reviews;
    }

    public String getKnownFor() {
        return knownFor;
    }

    public void setKnownFor(String knownFor) {
        this.knownFor = knownFor;
    }

    public whereShouldWeEat(int price, double reviews, String knownFor) {
        this.price = price;
        this.reviews = reviews;
        this.knownFor = knownFor;

    }

    protected void reviews(double v) {
    }
}
