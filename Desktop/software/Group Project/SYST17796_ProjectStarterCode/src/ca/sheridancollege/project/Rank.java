/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 * Single Responsibility Principle (SRP): the Rank enum class adheres to SRP because it efficiently
 * represents the card ranks with their associated value. Variables are encapsulated.
 *
 * Open/Closed Principle (OCP): the enum class can also be extended just like the Suit enum.
 *
 * @Enum represents the ranks of cards in a standard deck. Each rank has an associated value used
 * for comparing cards.
 *
 * @author sneh July 19, 2024
 * @author Patricia Gariando <gariandp@sheridancollege.ca> Aug 4, 2024
 */
public enum Rank {
     TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7),
     EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13), ACE(14);

     // Value associated with each rank, used for comparison.
     private final int value;

     // Constructor to set the value for each rank.
     Rank(int value) {
          this.value = value;
     }

     // Getter method to retrieve the value of the rank.
     public int getValue() {
          return value;
     }
}
