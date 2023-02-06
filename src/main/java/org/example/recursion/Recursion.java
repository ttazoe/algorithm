package org.example.recursion;

public class Recursion {
    int[] list;

    public Recursion(int[] list){
        this.list = list;
    }

    public boolean  solve(int index, int target) {
        if (target == 0) {
            return true;
        }

        if (index >= list.length) {
            return false;
        }

        return solve(index + 1, target) || solve(index + 1, target - list[index]);
    }

}
