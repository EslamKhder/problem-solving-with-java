package com.java;

import java.util.Scanner;

public class LovelyPalindromes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();  // 12345
        char []nums = value.toCharArray(); // [ 1 , 2 , 3 , 4 , 5 ]
        System.out.print(value);
        for (int i = nums.length - 1;i>=0;i--) {
            System.out.print(nums[i]);
        }

    }
}
