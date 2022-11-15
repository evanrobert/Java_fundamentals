package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {
    private String suit;
    private String faces;
    private int values;

    public Card(String suit, String faces, int values) {

        this.suit = suit;
        this.faces = faces;
        this.values = values;

    }

    public Card() {

    }

    public String getSuit() {
        return suit;
    }


    public String getFaces() { return faces; }





    public int getValue() {
        return values;
    }

// returning deck
    @Override
    public String toString() {
        return (faces + " of " + suit);



}


    }







