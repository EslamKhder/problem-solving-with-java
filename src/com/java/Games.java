package com.java;

import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int []arr1 = new int[size];
        int []arr2 = new int[size];
        int result = 0;
        for (int i=0;i<size;i++){
            arr1[i] = scanner.nextInt();
            arr2[i] = scanner.nextInt();
        }
        /*
            1 2
            2 4
            3 4

        */
        for (int i=0;i<size;i++){
            for (int z=0;z<size;z++){
                if(arr1[i] == arr2[z]){
                    result++;
                }
            }
        }
        System.out.println(result);

    }
}
