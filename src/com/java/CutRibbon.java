package com.java;

import java.util.Arrays;
import java.util.Scanner;

public class CutRibbon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt(); // 5
        int arr [] = new int[3];
        arr[0] = scanner.nextInt(); // 5
        arr[1] = scanner.nextInt(); // 3
        arr[2] = scanner.nextInt(); // 2
        Arrays.sort(arr);
        boolean res = true;
        int sum = 0;
        int i =0;
        int counter = 0;
        while (res){
            if(i == 3){
                i =0;
            }
            sum += arr[i];
            if(sum > num1){
                break;
            }
            counter++;
            i++;
        }
        System.out.println(counter);
    }

}
