/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 * Single Responsibility Principle (SRP): the Suit enum class adheres to SRP because it's only job
 * is to represent the four standard card suits. The card game WAR focuses more on the value of a
 * card rather than the suit.
 *
 * Open/Closed Principle (OCP): the enum class can easily be extended to include new Suits that will
 * enhance the game experience. In the future, the game can be modified to have a class called
 * "NewSuits" that extends Suits.
 *
 * @Enum represents the four suits in a standard deck of cards.
 *
 * @author sneh July 19, 2024
 * @author Patricia Gariando <gariandp@sheridancollege.ca> August 4, 2024
 */
public enum Suit {
     HEARTS, DIAMONDS, CLUBS, SPADES
}
