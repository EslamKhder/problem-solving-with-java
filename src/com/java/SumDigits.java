package com.java;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next(); // 235
        int answer = 0;
        char [] nums = number.toCharArray();
        if (nums.length == 1){
            System.out.println('0');
            return;
        }
        for (int i=0;i<nums.length;i++){
            answer += nums[i] - '0';  // 10
        }
        int counter = 1;
        while (answer>=10) {
            answer = sum(answer); // 1
            counter++;
        }
        System.out.println(counter);

    }
    public static int sum(int num){ // 55
        int result = 0;
        while (num != 0){ // 50 != 0
            result += num % 10; // 5 5  = 10
            num /= 10; // 5  0
        }
        return result;
    }
}
