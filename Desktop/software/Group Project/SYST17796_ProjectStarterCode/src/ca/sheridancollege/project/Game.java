/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 *
 * @author Patricia Gariando July 19 2024
 * @author Snehdeep Kaur June 13, 2024
 */
package ca.sheridancollege.project;

import java.util.*;

/**
 * The class that models your game. You should create a more specific child of this class and
 * instantiate the methods given.
 *
 * @author Sheliey
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */

public class Game {

    private final Scanner input = new Scanner(System.in);
    private Deck deck;
    private Player playerOne;
    private final Player playerTwo = new Player("CPU");
    private final Message message = new Message();

    public void startGame() {
        message.title();
        message.howToPlay();

        System.out.print("\nEnter username: ");
        String name = input.nextLine();
        playerOne = new Player(name);

        deck = new Deck();
        deck.createDeck();

        List<Card> p1Deck = deck.splitDeck(1);
        List<Card> p2Deck = deck.splitDeck(2);

        playGame(p1Deck, p2Deck);
    }

    private void playGame(List<Card> p1Deck, List<Card> p2Deck) {
        System.out.println("\n" + playerOne.getName() + " has " + p1Deck.size() + " cards.");
        System.out.println(playerTwo.getName() + " has " + p2Deck.size() + " cards.\n");

        while (!p1Deck.isEmpty() && !p2Deck.isEmpty()) {
            Card p1Card = p1Deck.remove(0);
            Card p2Card = p2Deck.remove(0);

            System.out.println(playerOne.getName() + "'s card: " + p1Card);
            System.out.println(playerTwo.getName() + "'s card: " + p2Card);

            int result = p1Card.compareTo(p2Card);

            if (result > 0) {
                System.out.println(playerOne.getName() + " wins the round!");
                p1Deck.addAll(Arrays.asList(p1Card, p2Card));
            } else if (result < 0) {
                System.out.println(playerTwo.getName() + " wins the round!");
                p2Deck.addAll(Arrays.asList(p1Card, p2Card));
            } else {
                System.out.println("It's a tie! **WAR**");
                handleWar(p1Deck, p2Deck, p1Card, p2Card);
            }

            System.out.println(playerOne.getName() + " deck size: " + p1Deck.size());
            System.out.println(playerTwo.getName() + " deck size: " + p2Deck.size() + "\n");
        }

        displayWinner(p1Deck, p2Deck);
        message.goodbyeMessage();
    }

    private void handleWar(List<Card> p1Deck, List<Card> p2Deck, Card p1Card, Card p2Card) {
        List<Card> warPile = new ArrayList<>(Arrays.asList(p1Card, p2Card));

        while (!p1Deck.isEmpty() && !p2Deck.isEmpty()) {
            if (p1Deck.size() < 4 || p2Deck.size() < 4) {
                System.out.println("Not enough cards for war. Game over.");
                return;
            }

            for (int i = 0; i < 4; i++) {
                warPile.add(p1Deck.remove(0));
                warPile.add(p2Deck.remove(0));
            }

            Card p1WarCard = warPile.get(warPile.size() - 2);
            Card p2WarCard = warPile.get(warPile.size() - 1);

            System.out.println("/*War*/ Cards: " + playerOne.getName() + ": " + p1WarCard + " vs. " + playerTwo.getName() + ": " + p2WarCard);

            int result = p1WarCard.compareTo(p2WarCard);

            if (result > 0) {
                System.out.println(playerOne.getName() + " wins the war!");
                p1Deck.addAll(warPile);
                return;
            } else if (result < 0) {
                System.out.println(playerTwo.getName() + " wins the war!");
                p2Deck.addAll(warPile);
                return;
            }
        }
    }

    private void displayWinner(List<Card> p1Deck, List<Card> p2Deck) {
        if (p1Deck.isEmpty()) {
            System.out.println(playerOne.getName() + " is out of cards. " + playerTwo.getName() + " wins the game!");
        } else {
            System.out.println(playerTwo.getName() + " is out of cards. " + playerOne.getName() + " wins the game!");
        }
    }
}

class Player {
    private final String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
