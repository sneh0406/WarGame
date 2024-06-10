/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author Simran kaur
 * @author Paul Bonenfant Jan 2020
 */
public class GroupOfCards {

    //The group of cards, stored in an ArrayList
    private List<Card> cards;
   

    public GroupOfCards() {
       
        cards = new ArrayList<>();
    }

    
   

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @param card
     * @return the group of cards.
     */
  
    
    public void addCard(Card card){
        cards.add(card);
    }
    
    public void shuffle() {
        Collections.shuffle(cards);
    }
    
    
    
    public Card drawCard(){  //taking first card 
        return cards.isEmpty()?null: cards.remove(0);
    }
    
    public boolean isEmpty(){
        return cards.isEmpty();
    }
    /**
     * @return the size of the group of cards
     */
//    public int getSize() {
//        return cards.size();
//    }

    /**
     * @param size the max size for the group of cards
     * @return 
     */ 
    public int Size() {
        return cards.size();
    }
    
   
}//end class
