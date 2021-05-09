package org.nerdcore.model;

public class Position {
    private int R, C;

    Position(int R, int C){
        this.R = R;
        this.C = C;
    }

    int getRow() {
        return R;
    }
    int getCol(){return C;}
}
