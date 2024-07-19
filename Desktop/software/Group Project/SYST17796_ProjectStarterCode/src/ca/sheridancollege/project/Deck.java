/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The Deck class represents a standard deck of 52 playing cards.
 * It includes methods to shuffle the deck, retrieve the cards,
 * and split the deck into two halves.
 * 
 * @author sneh 
 * @date July 19, 2024
 */
public class Deck {
    // List to hold all the playing cards in the deck
    private List<PlayingCard> cards;
    
    //Constructor to initialize the deck with all 52 playing cards and shuffle the deck.
    public Deck() {
        cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new PlayingCard(suit, rank));
            }
        }
        shuffle();              // Shuffle the deck upon creation
    }

    //Shuffles the deck using Collections.shuffle
    public void shuffle() {
        Collections.shuffle(cards);
    }
    
    //Getter method to retrieve the list of cards in the deck.
    public List<PlayingCard> getCards() {
        return cards;
    }
    
    //Splits the deck into two halves
    public List<PlayingCard> splitDeck() {
        int halfDeckSize = cards.size() / 2;
        List<PlayingCard> halfDeck = new ArrayList<>(cards.subList(0, halfDeckSize));
        cards = new ArrayList<>(cards.subList(halfDeckSize, cards.size()));
        return halfDeck;
    }
 
}
