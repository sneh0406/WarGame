/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sim20
 */
public class WarPlayer extends Player {

          private List<PlayingCard> hand; //hand of cards for player 

          //Constructor to create warPlayer for giving name and initialize hand
          public WarPlayer(String name) {
                    super(name);
                    this.hand = new ArrayList<>();
          }

          //getHand method
          public List<PlayingCard> getHand() {
                    return hand;
          }

          //method to add cards to player hand
          public void addCardToHand(PlayingCard card) {
                    hand.add(card);
          }

          public PlayingCard playCard() {
                    if (!hand.isEmpty()) {
                              return hand.remove(0);
                    } else {
                              return null;
                    }
          }

          //@Override
          public void play() {
                    PlayingCard card = playCard();
                    if (card != null) {
                              System.out.println(getName() + " plays " + card);
                    } else {
                              System.out.println(getName() + " don't have any cards to play.");
                    }
          }

}
