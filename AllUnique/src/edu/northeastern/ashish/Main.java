package edu.northeastern.ashish;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
    }

    private static boolean allUniq(int[] arr){
        if(arr == null || arr.length <=1){
            return true;
        }
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i : arr) {
            if (set.contains(i)){
                return false;
            }
            set.add(i);
        }
        return  true;
    }
}
