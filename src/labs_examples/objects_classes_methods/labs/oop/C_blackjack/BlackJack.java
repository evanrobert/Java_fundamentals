package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BlackJack {
    public BlackJack() {
    }

    public static void main(String[] args) {


        Card card = new Card();
        Hand hand = new Hand();
        Deck deck = new Deck();
        Player player = new Player(new Hand(), "Evan", 20000);
        Player dealer = new Player(new Hand(), "Dealer", 20000);
        Scanner bet = new Scanner(System.in);


        deck.shuffle();
        dealer.getHand();
        player.getHand();


        var playAgain = "y";
        String stop = "n";
        while (!stop.equals(playAgain)) {
            System.out.println();
            if (deck.cardsLeft() < (deck.cardsLeft() * 50) / 100) {
                System.out.println("Shuffling deck...");
                deck.shuffle();
                pause(bet);


            }
            player.getHand().clear();
            dealer.getHand().clear();

            System.out.println("please place your bet ");
            System.out.println(" your current wallet amount is " + player.wallet);
            int betAmount = bet.nextInt();
            int loseTotal = player.getWallet() - betAmount;
            int winTotal = player.getWallet() + betAmount;
            System.out.println(" you  bet is $" + betAmount);
            System.out.println("Evan your cards are ");
            System.out.println(player.getHand().addCard(deck.draw()));
            System.out.println(player.getHand().addCard(deck.draw()));
            if (player.getHand().getHandValue() == 21) {
                System.out.println(" BlackJack  !!! " + " your wallet total is " + "$" + betAmount);
                break;

            }


            System.out.println(" your hand total is " + player.getHand().getHandValue());
            System.out.println("------------");
            System.out.println(dealer.getHand().addCard(deck.draw()));
            dealer.getHand().addCard(deck.draw());
            System.out.println("Dealer is showing " + dealer.getHand().getHand().get(0).getValue());

            boolean playerStayOrBust = false;

            while (!playerStayOrBust) {
                System.out.println("press 1 to hit press 2 to stand ");
                int playerSelection = bet.nextInt();
                if (playerSelection == 1) {
                    System.out.println(player.getHand().addCard(deck.draw()));
                    System.out.println(" your hand total is " + player.getHand().getHandValue());


                    playerStayOrBust = handBusted(player.getHand());
                } else if (playerSelection == 2) {
                    System.out.println(" you decided to stay at " + player.getHand().getHandValue() + " now the dealer will go ");


                    if (dealer.getHand().getHandValue() >= player.getHand().getHandValue() && dealer.getHand().getHandValue() < 21) {
                        System.out.println("dealers hand is " + dealer.getHand().getHandValue() + " dealer wins " + " you lost " +
                                "$ " + betAmount + " your total now is " + loseTotal);

                    }
                    playerStayOrBust = true;
                    if (playerStayOrBust)
                        System.out.println("dealer has " + dealer.getHand().getHandValue());
                    if (dealer.getHand().getHandValue() > player.getHand().getHandValue())
                        System.out.println("dealer wins");
                    while (dealer.getHand().getHandValue() < player.getHand().getHandValue()) {
                        System.out.println(dealer.getHand().addCard(deck.draw()));

                        if (dealer.getHand().getHandValue() > player.getHand().getHandValue() & dealer.getHand().getHandValue()
                                <= 21)
                            System.out.println("dealer wins with " + dealer.getHand().getHandValue());



                        if (dealer.getHand().getHandValue() > 21) {
                            System.out.println("dealer busts with " + dealer.getHand().getHandValue());
                            System.out.println("you win $" + betAmount + " your new total is " + winTotal);
                        }





                    }
                    if (player.getHand().getHandValue() <= 21 & player.getHand().getHandValue() > dealer.getHand().getHandValue()) {
                        player.wallet = winTotal;
                    } else if (dealer.getHand().getHandValue() > 21) {
                        player.wallet = winTotal;


                    } else {

                        player.wallet = loseTotal;
                    }


                    System.out.println("-----------------------");

                }


                }
            }
        }






    private static boolean handBusted(Hand hand) {
        boolean playerBusted = hand.getHandValue() > 21;

        if (playerBusted) {
            System.out.println(" you busted ");

        }
        return (playerBusted);
    }

    private static void pause(Scanner bet) {
    }

}






