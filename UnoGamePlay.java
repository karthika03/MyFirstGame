/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Win10
 */
public class UnoGamePlay {
       private String gameID;
	   private ArrayList<GamePlayer> playerList;
	   private String status;
	   private UnoDeckCards deck;
	   private String discardFile;
	   private ArrayList<UnoCard> DiscardPile;
           public UnoGamePlay(String gameID) {
		super();
		this.gameID = gameID;
		deck=new UnoDeckCards(); 
                playerList=new ArrayList<GamePlayer>();
                DiscardPile=new ArrayList<UnoCard>();
	}
	
	public String getGameID() {
		return gameID;
	}
	public void setGameID(String gameID) {
		this.gameID = gameID;
	}
        public UnoDeckCards getdeck(){
            return deck;
        }
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDiscardFile() {
		return discardFile;
	}
	public void setDiscardFile(String discardFile) {
		this.discardFile = discardFile;
	}
	 

       public void addplayer(GamePlayer player){
           playerList.add(player);
       }
	
      public void CreateNewGame(){
          	getdeck().CreateNewDeck();
      }
     public void StartGame(){
         discardACard(getdeck().TakeAcard());
         for(int j=0;j<7;j++){
		for(int i=0;i<playerList.size();i++){
              playerList.get(i).addCardtoHand(deck);
		} 
     }
     }
     
     public UnoCard discardACard(UnoCard c){
         UnoCard card=c;
         DiscardPile.add(card);
         return card;
     }
     public void showDiscardPile(){
         System.out.println("Discard :");
         Iterator<UnoCard> c = DiscardPile.iterator();
         while(c.hasNext()){
              System.out.println(c.next());
         }
     }
     public void showPlayerList(){
         Iterator<GamePlayer> p = playerList.iterator();
                  while (p.hasNext()) {                 
                  p.next().show();
                   }
     }
     public void showGameInformation(){
         System.out.println("Game ID: "+gameID);
         showDiscardPile();
         System.out.println("Cards on deck "+deck.getNumber());
         System.out.println();
         showPlayerList();
     }
     
       public void TakeAcardFromDeck(UnoDeckCards deck){
           UnoCard x=new UnoCard("a","b",1,"c");
     
       }
	}
    

