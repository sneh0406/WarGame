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
public class Card {

          // List to hold all the playing cards in the deck
          private List<Card> cards;
          private int value;

          //Constructor to create a PlayingCard with a specific suit and rank
          final private Suit suit;
          final private Rank rank;

          public Card(Suit suit, Rank rank) {
                    this.suit = suit;
                    this.rank = rank;
                    setValue(rank.getValue());      // Set the card's value based on its rank
          }

          //Getter method for the suit of the card
          public Suit getSuit() {
                    return suit;
          }

          //Getter method for the rank of the card
          public Rank getRank() {
                    return rank;
          }

          public void setValue(int value) {
                    this.value = value;
          }

          public int getValue() {
                    return value;
          }

          /**
           *
           * @return card, the card at the top of pile which is at the last index of the List
           */
          public Card removeCardFromTop() {
                    if (cards.size() < 1) {
                              return null;
                    }
                    return cards.remove(cards.size() - 1);
          }

          /**
           *
           * @param card, the card will be added at index 0 which is the bottom of the pile
           */
          public void addCardToBottom(Card card) {
                    cards.add(0, card);
          }

          @Override
          public String toString() {
                    return rank + " of " + suit;
          }

}
