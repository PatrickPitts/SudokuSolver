package org.nerdcore.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    Board B;
    Integer[][]E;

    @BeforeEach
    void setUp() {
        E = new Integer[][]
                {{1,2,3,4},{2,3,4,1},{3,4,1,2},{4,1,2,3}};
        B = new Board(E);
    }

    @Test
    void testConstructor(){
        assertArrayEquals(E, B.getBoard());
        B = new Board(9,9,3,3);
    }


    @Test
    void getRow() {
    }

    @Test
    void getCol() {
    }

    @Test
    void isOk() {
    }

    @Test
    void markAsPossible() {
    }

    @Test
    void markAsDeadEnd() {
    }
}