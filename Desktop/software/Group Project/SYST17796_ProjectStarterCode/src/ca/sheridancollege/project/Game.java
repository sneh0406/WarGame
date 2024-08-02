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

     public void StartGame() {
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
               playerOne = new Player(name);
               System.out.println("Hello, player " + playerOne.getName() + "!");
               run();
          } else {
               System.out.println("\nPlay with us when you're ready! BYE!");
          }

     }

     public void run() {
          // Create a deck of cards for Player\
          deck = new Deck();
          deck.createDeck();
          List<Card> p1Deck = new ArrayList();
          List<Card> p2Deck = new ArrayList();
          p1Deck.addAll(deck.splitDeck(1));
          p2Deck.addAll(deck.splitDeck(2));

          // Let the player know that they have been handed their deck.
          System.out.println("\n" + playerOne.getName() + " has been assigned deck, cards in hand: " + p1Deck.size());
          System.out.println(playerTwo.getName() + " has been assigned deck, cards in hand: " + p2Deck.size());
          System.out.println();

          String playAgain;
          // While both players are not empty handed, play the game.
          while (!p1Deck.isEmpty() && !p2Deck.isEmpty()) {
               Card p1CardFaceUp = p1Deck.remove(0);
               Card p2CardFaceUp = p2Deck.remove(0);

               System.out.println(playerOne.getName() + "'s card: " + p1CardFaceUp);
               System.out.println(playerTwo.getName() + "'s card: " + p2CardFaceUp);

               int result = p1CardFaceUp.compareTo(p2CardFaceUp);
               if (result > 0) {
                    System.out.println(playerOne.getName() + " wins the round!");
                    p1Deck.add(0, p1CardFaceUp);
                    p1Deck.add(0, p2CardFaceUp);
               } else if (result < 0) {
                    System.out.println(playerTwo.getName() + " wins the round!");
                    p2Deck.add(0, p1CardFaceUp);
                    p2Deck.add(0, p2CardFaceUp);
               } else {
                    System.out.println("It's a tie!! **WAR**");
                    List<Card> warPile = new ArrayList();
                    warPile.add(0, p1CardFaceUp);
                    warPile.add(0, p2CardFaceUp);

                    while (result == 0 && !p1Deck.isEmpty() && !p2Deck.isEmpty()) {
                         if (p1Deck.size() < 4 || p2Deck.size() < 4) {
                              if (p1Deck.size() < 4) {
                                   System.out.println(playerOne.getName() + " does not have enough cards for war. Game over.");
                              } else {
                                   System.out.println(playerTwo.getName() + " does not have enough cards for war. Game over.");
                              }
                              System.out.println("Would you like to play again? Yes (Y) or No (N): ");
                              playAgain = input.nextLine();
                              if (playAgain.equalsIgnoreCase("Yes") || playAgain.equalsIgnoreCase("Y")) {
                                   StartGame();
                              } else {
                                   System.out.println();
                                   message.goodbyeMessage();
                              }
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
               System.out.println(playerOne.getName() + " deck size: " + p1Deck.size());
               System.out.println(playerTwo.getName() + " deck size: " + p2Deck.size());
               System.out.println();
          }

          if (p1Deck.isEmpty()) {
               System.out.println(playerOne.getName() + " is out of cards. " + playerTwo.getName() + " wins the game!");
          } else if (p2Deck.isEmpty()) {
               System.out.println(playerTwo.getName() + " is out of cards. " + playerOne.getName() + " wins the game!");
          }

          System.out.println("Would you like to play again? Yes (Y) or No (N): ");
          playAgain = input.nextLine();
          if (playAgain.equalsIgnoreCase("Yes") || playAgain.equalsIgnoreCase("Y")) {
               StartGame();
          } else {
               System.out.println();
               message.goodbyeMessage();
          }
     }

}
