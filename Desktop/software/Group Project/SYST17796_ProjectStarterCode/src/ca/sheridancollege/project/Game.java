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
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */

public class Game {

    Scanner input = new Scanner(System.in);
    Deck deck;
    Player playerOne;
    Player playerTwo = new Player("CPU");
    Message message = new Message();

    public void startGame() {
        // Display the Title and Rules of the game to the player.
        message.title();
        message.howToPlay();

        // Automatically prompt the player for their username.
        System.out.print("\nEnter username: ");
        String name = input.nextLine();

        // Create player object with the name provided.
        playerOne = new Player(name);
        System.out.println("Hello, player " + playerOne.getName() + "!");
        
        // Start the main game loop.
        run();
    }

    public void run() {
        // Create a deck of cards and split it between the players
        deck = new Deck();
        deck.createDeck();
        List<Card> p1Deck = new ArrayList<>(deck.splitDeck(1));
        List<Card> p2Deck = new ArrayList<>(deck.splitDeck(2));

        // Notify the players about their decks
        System.out.println("\n" + playerOne.getName() + " has been assigned a deck, cards in hand: " + p1Deck.size());
        System.out.println(playerTwo.getName() + " has been assigned a deck, cards in hand: " + p2Deck.size());
        System.out.println();

        // Main game loop - continue until one player runs out of cards
        while (!p1Deck.isEmpty() && !p2Deck.isEmpty()) {
            // Each player plays the top card from their deck
            Card p1CardFaceUp = p1Deck.remove(0);
            Card p2CardFaceUp = p2Deck.remove(0);

            // Display the played cards
            System.out.println(playerOne.getName() + "'s card: " + p1CardFaceUp);
            System.out.println(playerTwo.getName() + "'s card: " + p2CardFaceUp);

            // Compare the cards and decide the winner of the round
            int result = p1CardFaceUp.compareTo(p2CardFaceUp);
            if (result > 0) {
                System.out.println(playerOne.getName() + " wins the round!");
                p1Deck.add(p1CardFaceUp);
                p1Deck.add(p2CardFaceUp);
            } else if (result < 0) {
                System.out.println(playerTwo.getName() + " wins the round!");
                p2Deck.add(p1CardFaceUp);
                p2Deck.add(p2CardFaceUp);
            } else {
                System.out.println("It's a tie! **WAR**");
                List<Card> warPile = new ArrayList<>();
                warPile.add(p1CardFaceUp);
                warPile.add(p2CardFaceUp);

                while (result == 0 && !p1Deck.isEmpty() && !p2Deck.isEmpty()) {
                    if (p1Deck.size() < 4 || p2Deck.size() < 4) {
                        if (p1Deck.size() < 4) {
                            System.out.println(playerOne.getName() + " does not have enough cards for war. Game over.");
                        } else {
                            System.out.println(playerTwo.getName() + " does not have enough cards for war. Game over.");
                        }
                        return;  // End the game if either player can't continue
                    }

                    for (int i = 0; i < 4; i++) {
                        warPile.add(p1Deck.remove(0));
                        warPile.add(p2Deck.remove(0));
                    }

                    Card p1WarCard = warPile.get(warPile.size() - 2);
                    Card p2WarCard = warPile.get(warPile.size() - 1);

                    System.out.println("/*War*/ Cards: " + playerOne.getName() + ": " + p1WarCard + " vs. " + playerTwo.getName() + ": " + p2WarCard);
                    result = p1WarCard.compareTo(p2WarCard);

                    if (result > 0) {
                        System.out.println(playerOne.getName() + " wins the war!");
                        p1Deck.addAll(warPile);
                    } else if (result < 0) {
                        System.out.println(playerTwo.getName() + " wins the war!");
                        p2Deck.addAll(warPile);
                    }
                }
            }

            // Display the current deck sizes
            System.out.println(playerOne.getName() + " deck size: " + p1Deck.size());
            System.out.println(playerTwo.getName() + " deck size: " + p2Deck.size());
            System.out.println();
        }

        // Determine the winner
        if (p1Deck.isEmpty()) {
            System.out.println(playerOne.getName() + " is out of cards. " + playerTwo.getName() + " wins the game!");
        } else if (p2Deck.isEmpty()) {
            System.out.println(playerTwo.getName() + " is out of cards. " + playerOne.getName() + " wins the game!");
        }

        // End the game
        message.goodbyeMessage();
    }
}
