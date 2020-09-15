package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    private static void rotateArray(int[] arr, int k){
        k = k % arr.length;

        reverseArray(arr, 0, arr.length -1);
        reverseArray(arr, 0, k-1);
        reverseArray(arr, k, arr.length-1);
    }


    private static void reverseArray(int[] arr, int start, int end){
        if(start < 0 || end < 0 || end <= start || start >= arr.length || end >= arr.length ){
            return;
        }
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }
}
