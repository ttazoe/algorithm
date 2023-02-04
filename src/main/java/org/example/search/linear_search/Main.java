package org.example.search.linear_search;

public class Main {
    public static void main(String[] args){
      //
        int[] t = {1,2,3,4,5};
        int[] s = {2,4,0};
        int sum = 0;

        for (int ti : t) {
            if (LinearSearch.isExist(s, ti)){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
