package org.example;

public class Sort {
    public static int[] insertionSort(int[] list){
        for (int i = 1; i < list.length; i++){
            int target = list[i];

            int j = i - 1;
            while (j >= 0 && list[j] > target) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = target;
            for (int tmp = 0; tmp < list.length; tmp++) {
                System.out.printf("%d ", list[tmp]);
            }
            System.out.println("");
        }
        return list;
    }
}
