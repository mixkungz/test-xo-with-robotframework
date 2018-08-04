/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoardGame.Models;

/**
 *
 * @author Rei
 */
public class BoardXO {
    String[][] board;
    int p1Score;
    

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
    int p2Score;
    int tieScore;
    int turn;
    public BoardXO(){
        
        this.p1Score=0;
        this.p2Score=0;
        this.tieScore=0;
        turn = 0;
    }
    public Object[] getBoard() {
        return board; //To change body of generated methods, choose Tools | Templates.
    }

    public String[][] createBoard() {
        String[][] newBoard = new String[3][3];
        this.board = newBoard;
        return board;
    }
    
}
