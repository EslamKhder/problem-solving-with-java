package com.java;

import java.util.Scanner;

public class YaroslavPermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }
        int result = 0;
        // [ 1  1  2 1 3 2 2 5 2]
        // [ 1  1  2 1 3 2 2 5 1]
        for(int i =0;i<size; i++){
            int pointer = 0;
            for(int x = 0;x<size;x++) {
                if(nums[i] == nums[x]){
                    pointer++;
                }
                if(pointer > result){ // 3  // 4
                    result = pointer;
                }
            }
        }
        if(size % 2 == 0){ //even
            if(result <= size / 2){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            if(result <= (size / 2) + 1){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
