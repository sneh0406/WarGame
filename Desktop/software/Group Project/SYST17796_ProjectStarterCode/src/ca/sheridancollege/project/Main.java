/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author Patricia Gariando <gariandp@sheridancollege.ca> July 19, 2024
 * 
 */
/**
 * this class followed single Responsibility Principle (SRP)
 * as main method only responsible for creating the object of game class and starting the game
 * 
 * @author sim20
 */
public class Main {

     /**
      * Main method where start the game.
      *
      * @param args
      */
     public static void main(String[] args) {
          Game game = new Game();
          game.StartGame();

     }

}
