package labs_examples.enumerations.labs;

/**
 * Enumerations Exercise 1:
 * <p>
 * 1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a seperate class.
 * 2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 * of this enum from a seperate class.
 */
public class Exercise_01 {
    public enum Seasons {
        WINTER(10), SUMMER(8), FALL(7), SPRING(8);

        private final int rankings;

        Seasons(int rankings) {
            this.rankings = rankings;
        }

        public int getRankings() {
            return rankings;
        }
    }


}






