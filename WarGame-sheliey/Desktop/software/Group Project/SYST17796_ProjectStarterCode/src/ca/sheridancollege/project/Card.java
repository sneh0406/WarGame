/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * @author sneh   June 13, 2024
 */
package ca.sheridancollege.project;

public abstract class Card {
    //default modifier for child classes

    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
    
    @Override
    public abstract String toString();

}
