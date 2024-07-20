/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 *
 * @author Patricia Gariando <gariandp@sheridancollege.ca> July 19, 2024
 */
public class Main {

          /**
           * Main method where the user is greeted.
           *
           * @param args
           */
          public static void main(String[] args) {
                    Scanner input = new Scanner(System.in);

                    // Declare variables
                    String answer;
                    String name;

                    Message message = new Message();

                    // Display the Title and Rules of the game to the player.
                    message.title();
                    message.howToPlay();

                    // Prompt the player if they would like to play the game.
                    System.out.println("Welcome to War! Would you like to play?");
                    System.out.print("Yes (Y) or No (N): ");
                    answer = input.nextLine();

                    // if/else statement
                    if (answer.equalsIgnoreCase("Y")) {
                              System.out.print("\nEnter username: ");
                              name = input.nextLine();
                              // Create player object with name.
                              Player player = new WarPlayer(name);
                              System.out.println("Hello, player " + player.getName() + "!");
                              // Start Game
                              player.startGame();
                    } else {
                              System.out.println("\nPlay with us when you're ready! BYE!");
                    }

          }

}
