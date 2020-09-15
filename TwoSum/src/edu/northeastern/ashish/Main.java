package edu.northeastern.ashish;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(twoSum(arr, 9));
    }

    // If we just want to find there are 2 values inside the array whose sum = target
    private static boolean twoSum(int[] arr, int target){
        if(arr == null || arr.length <= 1){
            return false;
        }
        Arrays.sort(arr);

        int start = 0;
        int end = arr.length -1;

        while(start < end){
            if(arr[start] + arr[end] == target){
                return true;
            }
            else if (arr[start] + arr[end] > target){
                end --;
            }else{
                start ++;
            }
        }
        return  false;
    }

    // If we just want to get index
    private static int[] twoSumIndex(int[] arr, int target){
        if(arr == null || arr.length <= 1){
            return new int[] {-1,-1};
        }
        HashMap<Integer, Integer>  map = new HashMap<Integer, Integer>();

        for(int i = 0 ; i < arr.length ; i ++){
            int compliment = target - arr[i];
            if(map.containsKey(compliment)){
                return new int[] {map.get(compliment), i};
            }
            map.put(arr[i], i);
        }

        return new int[] {-1,-1};

    }



}
