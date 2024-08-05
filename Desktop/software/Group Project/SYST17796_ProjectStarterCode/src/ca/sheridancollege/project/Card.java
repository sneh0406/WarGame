/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 *
 * @author Patricia Gariando July 19 2024
 * @author sneh June 13, 2024
 */
package ca.sheridancollege.project;

import java.util.List;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be
 * instantiated for any Card game. Students wishing to add to the code should remember to add
 * themselves as a modifier.
 *
 * @author dancye
 */
public class Card implements Comparable<Card> {

     // List to hold all the playing cards in the deck.
     private List<Card> cards;
     private int value;

     // Constructor to create a PlayingCard with a specific suit and rank.
     final private Suit suit;
     final private Rank rank;

     public Card(Suit suit, Rank rank) {
          this.suit = suit;
          this.rank = rank;
          setValue(rank.getValue());      // Set the card's value based on its rank
     }

     // Getter method for the suit of a card.
     public Suit getSuit() {
          return suit;
     }

     // Getter method for the rank of a card.
     public Rank getRank() {
          return rank;
     }

     // Setter method for the suit of a card.
     public void setValue(int value) {
          this.value = value;
     }

     // Getter method for the value of a card.
     public int getValue() {
          return value;
     }

     @Override
     public int compareTo(Card other) {
          // Compare ranks using their ordinal values.
          return this.rank.ordinal() - other.rank.ordinal();
     }

     @Override
     public String toString() {
          // Provide a string representation for the card, e.g., "ACE of Spades".
          return rank + " of " + suit;
     }

}
