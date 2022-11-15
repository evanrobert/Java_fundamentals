package Adventures;

public class AdventurePackage  {


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {


    Antartica Antartica = new Antartica("cold", 30, true);
    Hawaii Hawaii = new Hawaii("warm", 20, false);
    newZealand newZealand = new newZealand("a good mix ", 12, true);
    Alaska Alaska = new Alaska("freezing", 7, false);
    System.out.println(Hawaii.getDaysSpentTheir());
    System.out.println( "In Antartica i spent " + Antartica.getDaysSpentTheir() + " Days Their" + " , The weather was " + Antartica.getWhatWasTheWeatherLike() );



}}
