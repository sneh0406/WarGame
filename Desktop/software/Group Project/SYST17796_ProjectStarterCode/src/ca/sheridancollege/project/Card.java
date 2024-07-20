/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 *
 * @author Patricia Gariando July 19 2024
 * @author sneh June 13, 2024
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 */
public abstract class Card {

          private int value;

          public void setValue(int value) {
                    this.value = value;
          }

          public int getValue() {
                    return value;
          }

}
