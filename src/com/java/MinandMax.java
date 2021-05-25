package com.java;

import java.util.Scanner;

public class MinandMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int []arr = new int[size];
        for (int i =0;i<size;i++){
            arr[i] = input.nextInt();
        }
        // 5 3 8 9 1
        int max = arr[0]; //5
        int min = arr[0]; //5
        for (int i =0;i<size;i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){ // 5 > 3
                min = arr[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
