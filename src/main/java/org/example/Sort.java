package org.example;

public class Sort {
    public int[] insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int target = list[i];

            int j = i - 1;
            while (j >= 0 && list[j] > target) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = target;

            printList(list);
        }
        return list;
    }

    public int[] bubbleSort(int[] list) {
        int unsortedIndex = list.length;
        while (unsortedIndex > 0) {
            for (int i = 0; i < unsortedIndex - 1; i++) {
                if (list[i] > list[i + 1]) {
                    int tmp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = tmp;
                }
            }
            unsortedIndex--;
            printList(list);
        }
        return list;
    }


    void printList (int[] list) {
        for (int tmp = 0; tmp < list.length; tmp++) {
            System.out.printf("%d ", list[tmp]);
        }
        System.out.println("");
    }
}
