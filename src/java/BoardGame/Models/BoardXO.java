/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoardGame.Models;

import java.util.HashMap;

/**
 *
 * @author Rei
 */
public class BoardXO {
    int[][] Board;
    int p1Score;
    int p2Score;
    int tieScore;
    int turn;
    
    public int getP1Score() {
        return p1Score;
    }

    public int getP2Score() {
        return p2Score;
    }

    public int getTieScore() {
        return tieScore;
    }

    public int getTurn() {
        return turn;
    }
    
    public BoardXO(){
        
        this.p1Score=0;
        this.p2Score=0;
        this.tieScore=0;
        turn = 0;
    }
    public Object[] getBoard() {
        return Board; //To change body of generated methods, choose Tools | Templates.
    }
    
    public HashMap selectPositionToPlay(String row, String column){
        HashMap<String,String> playerSelect = new HashMap<>();
        playerSelect.put("row", row);
        playerSelect.put("column", column);
        if(turn % 2 == 0){
            playerSelect.put("symbol", "x");
        }else{
            playerSelect.put("symbol", "o");
        }
        
        return playerSelect;
    }
    
}
