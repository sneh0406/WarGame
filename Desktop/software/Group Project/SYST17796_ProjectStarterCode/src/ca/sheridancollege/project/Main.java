/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 * Single Responsibility Principle (SRP): the Main class adheres to SRP since it focuses on one
 * specific task and that is initializing the game. For a cleaner and more organized code, we have
 * decided to implement the mechanics of the game in another class allowing the Main class to just
 * have a main method.
 *
 * @author Patricia Gariando <gariandp@sheridancollege.ca> July 19, 2024
 */
public class Main {

     /**
      * Main method where we start the game.
      *
      * @param args
      */
     public static void main(String[] args) {
          Game game = new Game();
          game.StartGame();
     }

}
