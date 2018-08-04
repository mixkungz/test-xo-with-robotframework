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
        return board; 
    }

    public boolean checkColumn(int col,String symbol) {
        int num =col==2?1:col++;
        boolean isWin = false;
        for(int row=0;row<3;row++){
            
            if(board[row][col]==null){
                break;
            }
            if((board[0][col].equals(board[1][col]))&& (board[2][col].equals(board[1][col]))&& (board[0][col].equals(board[2][col]))){
                isWin = true;
            } else {
                break;
            }
        }
        return isWin;
    }
    
    public boolean checkRow(int row,String symbol) {
        int num =row==2?1:row++;
        boolean isWin = false;
        for(int col=0;col<3;col++){
            
            if(board[row][col]==null){
                break;
            }
            if((board[row][0].equals(board[row][1]))&& (board[row][2].equals(board[row][1]))&& (board[row][0].equals(board[row][2]))){
                isWin = true;
            } else {
                break;
            }
        }
        return isWin;
    }
    
}
