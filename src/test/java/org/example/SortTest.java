package org.example;

import org.junit.jupiter.api.Test;

class SortTest {

    @Test
    public void testInsertionSort(){
        int[] list = {5, 2, 4, 6, 1 ,3};
        int[] sortedList = Sort.insertionSort(list);
    }


}