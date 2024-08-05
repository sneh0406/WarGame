/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * Single Responsibility Principle (SRP): the Player class exclusively focuses on managing the
 * player's name. The variable is encapsulated and is only accessible through getter and setter
 * methods.
 *
 * A class manages Player name. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @author Patricia Gariando June 2024
 */
public class Player {

     private String name; //the unique name for this players

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

}
