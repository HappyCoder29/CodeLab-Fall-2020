package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumTwoStrings("523", "32"));
    }

    // Assuming both of them are non negative
    private static int sumTwoStrings(String str1, String str2){
        if(str1.isBlank() || str1.isEmpty() || str2.isBlank() || str2.isEmpty()){
            return  Integer.MIN_VALUE;
        }
        int len1 = str1.length() -1;
        int len2 = str2.length() -1;
        int totalSum = 0;
        int carry = 0;
        int exp = 0;
        while(len1 >= 0 && len2 >= 0){
            int num1 = str1.charAt(len1) - '0';
            int num2 = str2.charAt(len2) - '0';
            int sum = num1 + num2 + carry;
            if(sum > 9){
                carry = 1;
            }else {
                carry = 0;
            }
            sum = sum  % 10;
            totalSum += (sum) *  (int)Math.pow(10, exp);
            len1 --;
            len2 --;
            exp ++;
        }

        while(len1 >= 0){
            int num1 = str1.charAt(len1) - '0';
            int sum = num1 + carry;
            if(sum > 9){
                carry = 1;
            }else {
                carry = 0;
            }
            sum = sum  % 10;
            totalSum += (sum) *  (int)Math.pow(10, exp);
            len1 --;
        }

        while(len2 >= 0){
            int num2 = str2.charAt(len2) - '0';
            int sum = num2 + carry;
            if(sum > 9){
                carry = 1;
            }else {
                carry = 0;
            }
            sum = sum  % 10;
            totalSum += (sum) *  10 ^ exp;
            len2 --;
        }

        exp ++;
        totalSum += carry * (int) Math.pow(10, exp);

        return totalSum;

    }


}
