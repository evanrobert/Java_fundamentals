package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;


public class Hand {

    private final ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
        getHandValue();

    }

    // Error in this part of code.
    // function to add cards to hand
    public String addCard(Card card) {
        hand.add(card);
        return card.toString();
    }


    // getting handValue
    public int getHandValue() {
        int handValue = 0;
        for (Card cards : hand) {
            String cardFaces = cards.getFaces();
            switch (cardFaces) {
                case "Jack":
                case "Queen":
                case "King":
                    handValue += 10;
                    break;
                case "Ace":
                    if (handValue > 10) {
                        handValue += 1;
                    } else {
                        handValue += 11;
                    }
                    break;
                default:
                    handValue += Integer.parseInt(cardFaces);
            }
        }
        // Returning the handValue
        return handValue;
    }


    /**
     * Returns the player's hand.
     */


    public ArrayList<Card> getHand() {
        return hand;
    }


    public void clear() {
        hand.clear();
    }}










