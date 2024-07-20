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

          private Deck deck;

          public void StartGame() {
                    Scanner input = new Scanner(System.in);
                    Message message = new Message();

                    // Declare variables
                    String answer;
                    String name;

                    // Display the Title and Rules of the game to the player.
                    message.title();
                    message.howToPlay();

                    // Prompt the player if they would like to play the game.
                    System.out.println("Welcome to War! Would you like to play?");
                    System.out.print("Yes (Y) or No (N): ");
                    answer = input.nextLine();

                    // if/else statement
                    if (answer.equalsIgnoreCase("Y")) {
                              System.out.print("\nEnter username: ");
                              name = input.nextLine();
                              // Create player object with name.
                              Player player = new Player(name);
                              System.out.println("Hello, player " + player.getName() + "!");
                              gameSystem();
                    } else {
                              System.out.println("\nPlay with us when you're ready! BYE!");
                    }

          }

          public void gameSystem() {
                    // Create a deck of cards for Player\
                    deck = new Deck();
                    deck.createDeck();
                    List<Card> p1Deck = new ArrayList<Card>();
                    List<Card> p2Deck = new ArrayList<Card>();
                    p1Deck.addAll(deck.splitDeck(1));
                    p2Deck.addAll(deck.splitDeck(2));

                    // Let the player know that they have been handed their deck.
                    System.out.println("\nPlayer has been assigned deck.");
                    System.out.println("CPU has been assigned deck.");
                    System.out.println();

                    // While both players are not empty handed, play the game.
                    while (!p1Deck.isEmpty() && !p2Deck.isEmpty()) {
                              Card p1CardFaceUp = p1Deck.remove(0);
                              Card p2CardFaceUp = p2Deck.remove(0);

                              System.out.println("Player One: " + p1CardFaceUp);
                              System.out.println("Player Two: " + p2CardFaceUp);
                              System.out.println();

                    }
          }

} // End of Class
