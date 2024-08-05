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
 * @autho Sheliey
 * @author sneh
 * @date July 19, 2024
 * @author Patricia Gariando July 19, 2024
 */

public class Deck {

     // List to hold all the playing cards in the deck
     private List<Card> cards;

     //Constructor to initialize the deck with all 52 playing cards and shuffle the deck.
     public Deck() {
          this.cards = new ArrayList<>();
        createDeck();
        shuffle();
    }

    void createDeck() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public List<Card> getCards() {
        return new ArrayList<>(cards); // Return a copy to preserve encapsulation
    }

    public List<Card> splitDeck(int num) {
        int halfSize = cards.size() / 2;
        if (num == 1) {
            return new ArrayList<>(cards.subList(0, halfSize));
        } else {
            return new ArrayList<>(cards.subList(halfSize, cards.size()));
        }
    }
     }
    