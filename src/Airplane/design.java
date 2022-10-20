package Airplane;

public class design {
    String boeing747;
    int lengthInFeet;
    char color;

    public design(String boeing747, int lengthInFeet, char color) {
        this.boeing747 = boeing747;
        this.lengthInFeet = lengthInFeet;
        this.color = color;
    }

    public String getBoeing747() {
        return boeing747;
    }

    public void setBoeing747(String boeing747) {
        this.boeing747 = boeing747;
    }

    public int getLengthInFeet() {
        return lengthInFeet;
    }

    public void setLengthInFeet(int lengthInFeet) {
        this.lengthInFeet = lengthInFeet;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "design{" +
                "boeing747='" + boeing747 + '\'' +
                ", lengthInFeet=" + lengthInFeet +
                ", color=" + color +
                '}';
    }
}
