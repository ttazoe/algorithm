package org.example.search.binary;

public class BinarySearch {
    static boolean search(int[] list, int x) {
        int first = 0;
        int last = list.length;

        while (first < last) {
            int mid = (first + last) / 2;
            System.out.printf("%d %d %d \n", first, last, mid);
            if (list[mid] == x) return  true;
            if (list[mid] < x) first = mid + 1;
            if (list[mid] > x) last = mid;
        }
        return false;
    }
}
