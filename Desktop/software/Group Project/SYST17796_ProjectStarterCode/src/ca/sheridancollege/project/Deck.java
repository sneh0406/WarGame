/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The Deck class represents a standard deck of 52 playing cards. It includes methods to shuffle the
 * deck, retrieve the cards, and split the deck into two halves.
 *
 * @author sneh
 * @date July 19, 2024
 * @author Patricia Gariando July 19, 2024
 */
public class Deck {

          // List to hold all the playing cards in the deck
          private List<Card> cards;

          //Constructor to initialize the deck with all 52 playing cards and shuffle the deck.
          public Deck() {
                    createDeck();
          }

          public void createDeck() {
                    cards = new ArrayList<>();
                    for (Suit suit : Suit.values()) {
                              for (Rank rank : Rank.values()) {
                                        cards.add(new Card(suit, rank));
                              }
                    }
                    shuffle();
          }

          //Shuffles the deck using Collections.shuffle
          public void shuffle() {
                    Collections.shuffle(cards);
          }

          //Getter method to retrieve the list of cards in the deck.
          public List<Card> getCards() {
                    return cards;
          }

          /**
           *
           * @param num the number that will determine which half of the deck the player is assigned
           * @return half of the deck
           */
          public List<Card> splitDeck(int num) {
                    List<Card> deck;
                    // split
                    if (num == 1) {
                              deck = cards.subList(0, 26);
                    } else {
                              deck = cards.subList(27, 52);
                    }
                    return deck;
          }

}
