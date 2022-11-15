package Adventures;

public class TotalAdventures  {
   protected String whatWasTheWeatherLike;
  protected   int daysSpentTheir;
   protected boolean WouldYouGoAgain;

    public String getWhatWasTheWeatherLike() {
        return whatWasTheWeatherLike;
    }

    public TotalAdventures(int daysSpentTheir) {

    }

    public void setWhatWasTheWeatherLike(String whatWasTheWeatherLike) {
        this.whatWasTheWeatherLike = whatWasTheWeatherLike;
    }

    public int getDaysSpentTheir() {
        return daysSpentTheir;
    }

    public void setDaysSpentTheir(int daysSpentTheir) {
        this.daysSpentTheir = daysSpentTheir;
    }

    public boolean isWouldYouGoAgain() {
        return WouldYouGoAgain;
    }

    public void setWouldYouGoAgain(boolean wouldYouGoAgain) {
        WouldYouGoAgain = wouldYouGoAgain;
    }

    public TotalAdventures(String whatWasTheWeatherLike, int daysSpentTheir, boolean wouldYouGoAgain) {
        this.whatWasTheWeatherLike = whatWasTheWeatherLike;
        this.daysSpentTheir = daysSpentTheir;
        WouldYouGoAgain = wouldYouGoAgain;

    }
}
