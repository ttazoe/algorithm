package org.example.search.binary;

public class BinarySearch {
    static boolean search(int[] list, int x) {
        int first = 0;
        int last = list.length -1 ;

        while (true) {
            int mid = (first + last) / 2;
            System.out.printf("%d %d %d \n", first, last, mid);
            if (list[mid] == x || list[first] == x || list[last] == x) return  true;
            if (mid == first || mid == last) break;
            if (list[mid] < x) first = mid;
            if (list[mid] > x) last = mid;
        }
        return false;
    }
}
