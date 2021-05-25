package com.java;

import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int []nums = new int[size + 1]; // 4
        for (int i = 1;i<= size;i++){ // i = 1      i = 4
            nums[scanner.nextInt()] = i; // 2 1  3 2  4 3 1 4
        }
        for (int i = 1;i<= size;i++){ // i = 1      i = 4
            System.out.print(nums[i] + " ");
        }

    }
}
