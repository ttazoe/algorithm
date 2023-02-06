package org.example.sort;

import java.util.Arrays;

public class Sort {
    public int[] insertionSort(int[] list) {
        int[] sortedList = Arrays.copyOf(list, list.length);
        for (int i = 1; i < sortedList.length; i++) {
            int target = sortedList[i];

            int j = i - 1;
            while (j >= 0 && sortedList[j] > target) {
                sortedList[j + 1] = sortedList[j];
                j--;
            }
            sortedList[j + 1] = target;

            printList(sortedList);
        }
        return sortedList;
    }

    public int[] insertionSort(int[] list, int period) {
        int[] sortedList = Arrays.copyOf(list, list.length);
        for (int i = period; i < sortedList.length; i++) {
            int target = sortedList[i];
            int j = i - period;
            while (j >= 0 && sortedList[j] > target) {
                sortedList[j + period] = sortedList[j];
                j = j - period;
            }
            sortedList[j + period] = target;
            printList(sortedList);
        }
        return sortedList;
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

    public int[] selectionSort(int[] list) {
        for (int sortedIndex = 0; sortedIndex < list.length - 1; sortedIndex++) {
            int minIndex = sortedIndex;

            for (int i = sortedIndex + 1; i < list.length; i++) {
                if (list[i] < list[minIndex]) minIndex = i;
            }

            int tmp = list[sortedIndex];
            list[sortedIndex] = list[minIndex];
            list[minIndex] = tmp;

            printList(list);
        }
        return list;
    }

    public int[] shellSort(int[] list) {
        int[] sortedList = Arrays.copyOf(list, list.length);
        int[] periodList = {4, 3, 1};

        for (int period : periodList) {
            insertionSort(sortedList, period);
        }

        return sortedList;
    }


    public void mergeSort(int[] list, int left, int right) {
        if (right - left > 1) {
            int mid = (right - left) / 2;
            mergeSort(list,left,mid);
            mergeSort(list,mid,right);
            merge(list,left,mid,right);
        }
    }

    public int[] merge(int[] list, int left, int mid, int right) {
        int[] leftList = new int[mid - left + 1];
        int[] rightList = new int[right - mid + 1];
        int[] returnList = new int[right - left];

        for (int i = 0; i < leftList.length - 1; i++) {
            leftList[i] = list[left + i];
        }
        leftList[leftList.length - 1] = 10_000_000;

        for (int i = 0; i < rightList.length - 1; i++) {
            rightList[i] = list[right + i];
        }
        rightList[rightList.length - 1] = 10_000_000;


        int li = 0;
        int ri = 0;
        for (int k = 0; k < right - left; k++) {
            if (leftList[li] < rightList[ri]) {
                returnList[k] = leftList[li];
                li++;
            } else {
                returnList[k] = rightList[ri];
                ri++;
            }
        }
        System.out.println(returnList);
        return returnList;
    }



    public void printList(int[] list) {
        for (int tmp = 0; tmp < list.length; tmp++) {
            System.out.printf("%d ", list[tmp]);
        }
        System.out.println("");
    }


}
