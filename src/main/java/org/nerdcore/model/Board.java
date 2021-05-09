package org.nerdcore.model;

public class Board {

    private Block[][] board;
    private int bR, bC, R, C;



    Board(int numRows, int numCols, int numBlockRows, int numBlockCols){
        this.R = numRows;
        this.C = numCols;
        this.bR = numBlockRows;
        this.bC = numBlockCols;

        for(int r = 0; r< numBlockRows; r++){
            for(int c = 0; c < numBlockCols; c++){

            }
        }
    }

    Board(Block[][] board){}
    Board(Integer[][] board){}

    Board(){}

    public Block[][] getBoard() {
        return board;
    }


    Integer[] getRow(int R){return new Integer[0];}
    Integer[] getCol(int C){return new Integer[0];}

    boolean isOk(Position pos){return false;}
    void markAsPossible(Position pos, int N){}
    void markAsDeadEnd(Position pos){}
}
