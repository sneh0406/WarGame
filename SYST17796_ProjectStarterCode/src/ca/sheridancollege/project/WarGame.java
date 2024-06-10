/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author sim20
 */
public class WarGame extends Game{
    
    
    private GroupOfCards deck;
    
    public WarGame(String name){
        super(name);
        deck = new GroupOfCards();
        
        startDeck();
        
    }
    
    private void startDeck(){
         String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        
        
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.addCard(new Card(rank, suit));
            }
        }
        
           
        
        deck.shuffle();
        
        
    }
    
    
 

    @Override
    public void play() {
        
        
        
        
        while(!isGameOver()){

              playRound();

}
         declareWinner();
        }
  
    
    public void distributecards (){
        int numPlayers = players.size();
        while (!deck.isEmpty()) {
            for (Player player : players) {
                if (!deck.isEmpty()) {
                    player.addCard(deck.drawCard());
                }
            }
        }

}
    
    public void playRound() {

          List<Card> roundCards = new ArrayList<>();
        for (Player player : players) {
            if (player.hasCards()){
                Card card = player.playCard();
                roundCards.add(card);
                System.out.println(player.getName() + " plays: " + card);
            }
        }
       
                
           roundWinner(roundCards);
    }
    
    
    public void roundWinner(List<Card> roundCards){
        
        Card highestCard = roundCards.get(0);
        Player winner = null;
    
    
    for (Card currentCard: roundCards){
    if(currentCard.getValue() > highestCard.getValue()){
        highestCard = currentCard;
        winner = players.get(roundCards.indexOf(currentCard));
    }
    
    if(winner != null){
        System.out.println(winner.getName() +"wins the round.");
        winner.collectCards(roundCards);
    }else {
        System.out.println("It's a tie");
    }
    }
}
    
    
    public boolean isGameOver(){
    
      for (Player player : players) {
            if (player.getHandSize()== 0) {
                return true;
            }
        }
        return false;
    
    }


    

               
    

    @Override
    public void declareWinner() {
        Iterator<Player> iterator = players.iterator();
    Player winner = iterator.next();
    while (iterator.hasNext()) {
        Player player = iterator.next();
        if (player.getHandSize()> winner.getHandSize()) {
            winner = player;
        }
    }
    System.out.println("The winner is: " + winner.getName());
        
        
        
    }
    
    
   public static void main(String[] args){
       
       WarGame game = new WarGame("War Card Game");
       Player player1 = new WarPlayer("player1");
       Player player2 = new WarPlayer("player2 ");
       
       game.addPlayer(player1);
       game.addPlayer(player2);
       game.play();
       
     
   }

      
  
    
    
}



     
      
   
    
 
    
    
     
    
    

  
    
    
    
    

   
    

