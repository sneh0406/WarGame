/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author sheli
 * @author Patricia Gariando <gariandp@sheridancollege.ca> July 19, 2024
 */
public class Message {

          /**
           * Displays the title of the game prior to the game starting.
           */
          public void title() {
                    System.out.println();
                    System.out.println("* * * * * * * * * * * * * * * * * * * *"
                            + "\n*                                         *"
                            + "\n*         *  *  *   ****   ***            *"
                            + "\n*         *  *  *   *  *   *  *           *"
                            + "\n*         *  *  *   ****   ***            *"
                            + "\n*         *** ***   *  *   *  *           *"
                            + "\n*                                         *"
                            + "\n* * * * * * * * * * * * * * * * * * * * * *");
          }

          /**
           * Display the rules of the game prior to the game starting.
           */
          public void howToPlay() {
                    System.out.println("\nHow To Play:");

                    System.out.println("1. A deck of 52 is split between the two players.\n"
                            + "2. Players will simultaneously put down a card.\n"
                            + "3. Player with the highest card value takes the pile.\n"
                            + "4. Piles after each 'battle' must be put under the winner's deck.\n"
                            + "5. If both players put down a card that is of the same value, 'War' must be declared!\n"
                            + "    > each player will play 4 cards: the fourth card will be placed face up.\n"
                            + "    > player with the highest card value takes the pile.\n"
                            + "    > if a player runs out of cards during 'War', they immediately lose.\n"
                            + "6. The game proceeds until one player has all 52 cards.\n");
          }

          /**
           * Displays a greeting message when the user starts the game.
           */
          public void displayGreeting() {
                    System.out.println("Welcome to the War game! Get ready to play!");
          }

          /**
           * Displays a win message when the user wins the game.
           */
          public void displayWinMessage() {
                    System.out.println("Congratulations! You have won the game!");
          }

          /**
           * Displays a lose message when the user loses the game.
           */
          public void displayLoseMessage() {
                    System.out.println("Sorry, you lost the game. Better luck next time!");
          }
}
