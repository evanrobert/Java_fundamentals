package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {
    public int wallet;


    private final Hand hand;

    public Player(Hand hand, String name, int wallet) {
        this.hand = hand;
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
