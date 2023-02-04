package org.example.search.binary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    public void testBinarySearch(){
        int[] list = {1,2,3,4,5};
        assertTrue(BinarySearch.search(list,1));
        assertTrue(BinarySearch.search(list,5));
        assertTrue(BinarySearch.search(list,2));
        assertFalse(BinarySearch.search(list,-1));
        assertFalse(BinarySearch.search(list,6));

    }

}