/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;


/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author Simran kaur
 * @author June, 2024
 */
public abstract class Player {
     private String name; //the unique name for this player
     
     protected ArrayList<Card> hand;
    
     public Player(String name ){  
          this.name = name;
          this.hand = new ArrayList<>();
    }
//

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
    
    /**
     *
     * @param card
     
     */


    
     public void addCard(Card card){
        hand.addLast(card);
        
    }
     public Card playCard(){
         
         return hand.remove(0);
     }
     

    
    public boolean hasCards(){
        return !hand.isEmpty();
    }
    public int getHandSize(){
        return hand.size();
    }
    
    public void AllCards(ArrayList<Card> cards){
        hand.addAll(cards);
    }
    public void collectCards(List<Card> cards) {
        hand.addAll(cards);
    }
    
    
    public abstract void play();
    
    
    


    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
//    public Player(String name) {
//        this.name = name;
//    }
//
//    /**
//     * @return the player name
//     */
//    public String getName() {
//        return name;
//    }
//
//    /**
//     * Ensure that the playerID is unique
//     *
//     * @param name the player name to set
//     */
//    public void setName(String name) {
//        this.name = name;
//    }

    
//    }
//    
  

}
