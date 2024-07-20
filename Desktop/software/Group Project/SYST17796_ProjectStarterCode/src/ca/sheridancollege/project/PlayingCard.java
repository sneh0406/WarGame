/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author sneh July 19, 2024
 */
public class PlayingCard extends Card {

          //Constructor to create a PlayingCard with a specific suit and rank
          final private Suit suit;
          final private Rank rank;

          public PlayingCard(Suit suit, Rank rank) {
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

          /**
           * Provides a string representation of the card, including its rank and suit.
           *
           * @return A string in the format "Rank of Suit" (e.g., "Ace of Spades")
           */
          @Override
          public String toString() {
                    return rank + " of " + suit;
          }

}
