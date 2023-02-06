package org.example;

import org.example.sort.Sort;
import org.junit.jupiter.api.Test;

class SortTest {

    @Test
    public void testInsertionSort(){
        int[] list = {5, 2, 4, 6, 1 ,3};
        Sort sort = new Sort();
        int[] sortedList = sort.insertionSort(list);
    }

    @Test
    public void testBubbleSort(){
        int[] list = {5, 2, 4, 6, 1 ,3};
        Sort sort = new Sort();
        int[] sortedList = sort.bubbleSort(list);
    }

    @Test
    public void testSelectionSort(){
        int[] list = {5, 2, 4, 6, 1 ,3};
        Sort sort = new Sort();
        int[] sortedList = sort.selectionSort(list);
    }

    @Test
    public void shellSort(){
        int[] list = {5, 2, 4, 6, 1 ,3};
        Sort sort = new Sort();
        int[] sortedList = sort.shellSort(list);
    }

    @Test
    public void mergeSort(){
        int[] list = {5, 2, 4, 6, 1 ,3};
        Sort sort = new Sort();
        sort.mergeSort(list,0,list.length);
    }

}