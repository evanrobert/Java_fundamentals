package resturants;

public class whereShouldWeEatBuilder {
    public static void main(String[] args) {
        italian italian = new italian(25, 4.5,"cheese Ravioli", true);
        chinese chinese = new chinese(18, 4.2, " sweet & sour Chicken ");
        mexican mexican = new mexican(12,5.0,"Burritos",1,"Hard shell tacos",true
        );
        System.out.println( " Italian Restaurant cd Review " +italian.getReviews());
        System.out.println( " Chinese Restaurant Review " + chinese.getReviews());
        System.out.println( " Mexican Restaurant Review " + mexican.getReviews());

    }
}
