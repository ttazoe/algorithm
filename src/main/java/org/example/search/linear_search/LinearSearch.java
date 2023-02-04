package org.example.search.linear_search;

public class LinearSearch {
    static boolean isExist(int[] list, int x) {
        for (int i : list) {
            if (i == x) return true;
        }
        return false;
    }
}
