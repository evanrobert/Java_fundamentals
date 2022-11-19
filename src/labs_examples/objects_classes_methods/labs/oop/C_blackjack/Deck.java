package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.*;
// making deck
public class Deck {
    private final ArrayList<Card> cards = new ArrayList<Card>();
    private final String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};
    private final String[] faces = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private final int[] values = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
    private int count = 0;

    //making deck
    public Deck() {
        for (int i = 0; i < suits.length; i++) {
            for (int x = 0; x < faces.length; x++) {
                cards.add(new Card(suits[i], faces[x], values[x]));
            }
        }
    }
    //Shuffling the deck
    public void shuffle() {
        Collections.shuffle(cards);
        count = 0;
    }
// drawing the cards
    public Card draw() {
        //@TODO Make sure that the count is not greater than cardsLeft()
        return cards.get(count++);
    }
// Lets you know the cards that are left
    public int cardsLeft() {
        return cards.size() - count;
    }

}






