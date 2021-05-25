package com.java;

import java.util.Arrays;
import java.util.Scanner;

public class BankRobbery {

    public static void main(String[]argus) {
        Scanner scanner = new Scanner(System.in);
        int am = scanner.nextInt();
        int l1 = scanner.nextInt();
        int l2 = scanner.nextInt();
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i =0;i<size;i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int counter = 0;
        for (int i=0;i<size;i++){
            if (arr[i] > l1 && arr[i] <l2){
                counter++;
            }
        }
        System.out.println(counter);

    }
}
