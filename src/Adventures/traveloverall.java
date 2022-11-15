package Adventures;

public class traveloverall extends TotalAdventures{
    protected int daysSpent;
    protected boolean enjoyedTravel;

    public traveloverall(String whatWasTheWeatherLike, int daysSpentTheir, boolean wouldYouGoAgain, int daysSpent,
                         boolean enjoyedTravel ) {
        super(whatWasTheWeatherLike, daysSpentTheir, wouldYouGoAgain);
        this.daysSpentTheir = daysSpentTheir;
        this.enjoyedTravel = enjoyedTravel;

    }

    @Override
    public int getDaysSpentTheir() {
        return super.getDaysSpentTheir();
    }}
    