package org.nerdcore.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.omg.PortableInterceptor.INACTIVE;

import static org.junit.jupiter.api.Assertions.*;

class BlockTest {

    Block E, T;
    Integer[][] G;
    @BeforeEach
    void setup(){
        G = new Integer[][]{{1,2,3},{4,5,6},{7,8,9}};
        E = new Block(G);
        T = null;
    }

    @Test
    void testConstructor(){
        assertArrayEquals(G, E.nums);
        assertEquals(9, E.limit);
        assertEquals(3, E.R);
        assertEquals(3, E.C);

        T = new Block(3,3);
        assertArrayEquals(new Integer[3][3], T.nums);
        assertEquals(9, T.limit);
        assertEquals(3, T.R);
        assertEquals(3, T.C);
    }

    @Test
    void getGrid() {
        assertArrayEquals(G, E.getGrid());
        T = new Block(3,3);
        assertArrayEquals(new Integer[3][3], T.getGrid());
        G = new Integer[][]{{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
        T = new Block(G);
        assertArrayEquals(G, T.getGrid());
    }

    @Test
    void getRow() {
        for(int i = 0; i < G.length; i++){
            assertArrayEquals(G[i], E.getRow(i));
        }
        G = new Integer[][]{{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
        T = new Block(G);
        for(int i = 0; i < G.length; i++){
            assertArrayEquals(G[i], T.getRow(i));
        }
    }

    @Test
    void getCol() {
        assertArrayEquals(new Integer[]{1,4,7}, E.getCol(0));
        assertArrayEquals(new Integer[]{2,5,8}, E.getCol(1));
        assertArrayEquals(new Integer[]{3,6,9}, E.getCol(2));
    }

    @Test
    void testSet(){
        T = new Block(G.length, G[0].length);
        int n = 1;
        for(int r = 0; r < G.length; r++){
            for(int c = 0; c < G[0].length; c++){
                assertTrue(T.set(r, c, n++));
            }
        }
        assertArrayEquals(G, T.getGrid());
    }

    @Test
    void testClear(){
        for(int r = 0; r < G.length; r++){
            for(int c = 0; c < G[0].length; c++){
                E.clear(r, c);
                assertNull(E.getGrid()[r][c]);
            }
        }
    }
}