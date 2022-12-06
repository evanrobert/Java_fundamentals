package labs_examples.enumerations.labs;

public class EnumController {
    public static void main(String[] args) {
        Exercise_01.Seasons bestSeason = Exercise_01.Seasons.WINTER;
        Exercise_01.Seasons worstSeason = Exercise_01.Seasons.SPRING;
        Exercise_01.Seasons okSeason = Exercise_01.Seasons.FALL;
        Exercise_01.Seasons ok2Season = Exercise_01.Seasons.SUMMER;
        System.out.println(" The best season in my opinion is " + bestSeason + "!!!!!");
        System.out.println("The worst season is " + worstSeason);
        System.out.println(okSeason + " and " + ok2Season + " are just ok ");
        Exercise_01.Seasons.WINTER.getRankings();
        System.out.println("Spring gets an " + worstSeason.getRankings());
        System.out.println("Winter gets a " + bestSeason.getRankings());


    }
}
