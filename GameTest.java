/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

/**
 *
 * @author Win10
 */
public class GameTest {
     public static void main (String args[]) {
            
        GamePlayer a=new GamePlayer("01","Anu");
        GamePlayer b=new GamePlayer("02","Sri");
        GamePlayer c=new GamePlayer("03","Van");
        GamePlayer d=new GamePlayer("04","Subi");
        GamePlayer e=new GamePlayer("05","Karthi");
        UnoGamePlay game=new UnoGamePlay("UNOGAME-01");
        game.CreateNewGame();
        game.addplayer(a);
        game.addplayer(b);
        game.addplayer(c);
        game.addplayer(d);
        game.addplayer(e);
        game.StartGame();
        game.showGameInformation();
        }
}
