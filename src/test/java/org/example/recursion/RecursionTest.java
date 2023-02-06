package org.example.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursionTest {
    @Test
    public void testRecursiveSolve(){
        int[] list = {1,5,7,10,21};
        Recursion testList = new Recursion(list);
        assertFalse(testList.solve(0,2));
        assertFalse(testList.solve(0,4));
        assertTrue(testList.solve(0,17));
        assertTrue(testList.solve(0,8));
    }

}