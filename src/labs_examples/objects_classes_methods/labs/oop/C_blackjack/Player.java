package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {
    public int wallet;

    //Dealer...
    // DRAW CARDS PLAY HAND
    // in constructor name, what they are betting.
    private final Hand hand;
    private final String name;

    public Player(Hand hand, String name, int wallet) {
        this.hand = hand;
        this.name = name;
        this.wallet = wallet;
    }

    public Hand getHand() {

        hand.getHandValue();

        return hand;
    }

    public int getWallet() {
        return wallet;
    }
}
