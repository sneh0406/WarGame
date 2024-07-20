/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 *
 * @author Patricia Gariando June 2024
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public abstract class Player {

          private String name; //the unique name for this player

          /**
           * A constructor that allows you to set the player's unique ID
           *
           * @param name the unique ID to assign to this player.
           */
          public Player(String name) {
                    this.name = name;
          }

          /**
           * @return the player name
           */
          public String getName() {
                    return name;
          }

          /**
           * Ensure that the playerID is unique
           *
           * @param name the player name to set
           */
          public void setName(String name) {
                    this.name = name;
          }

          // any class that inherits from Player will have the option to start game.
          public void startGame() {
                    // Create a deck of cards for Player
                    Deck playerOne = new Deck();
                    Deck playerTwo = new Deck();
                    playerOne.splitDeck(1);
                    playerTwo.splitDeck(2);

                    // Let the player know that they have been handed their deck.
                    System.out.println("\nPlayer has been assigned deck.");
                    System.out.println("CPU has been assigned deck.");

                    //System.out.println(playerOne.getCards());
                    // While both players are not empty handed, play the game.
                    while (!playerOne.getCards().isEmpty() && !playerTwo.getCards().isEmpty()) {

                    }
          }

}
