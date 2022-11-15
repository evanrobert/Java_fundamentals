package resturants;

public class mexican extends whereShouldWeEat {
    protected int foodEatingChallenge;
    protected String worstFoodOnMenu;
    protected boolean worthGoing;


    public mexican(int price, double reviews, String knownFor, int foodEatingChallenge, String worstFoodOnMenu, boolean worthGoing) {
        super(price, reviews, knownFor);
        this.foodEatingChallenge = foodEatingChallenge;
        this.worstFoodOnMenu = worstFoodOnMenu;
        this.worthGoing = worthGoing;
    }
    public void Overload(){
      this.reviews(4.2);
      super.reviews(4.3);

    }
   @Override
    public void setPrice(int price) {
        System.out.println(" Already know price ");
    }


}
