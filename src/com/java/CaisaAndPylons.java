package com.java;

import java.util.Scanner;

public class CaisaAndPylons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int br = scanner.nextInt();
        int arr[] = new int[br];
        for(int i=0;i<br;i++){
            arr[i] = scanner.nextInt();
        }
        int dol = arr[0];
        int en = 0;
        for (int i=0;i<br - 1;i++){
            if(arr[i] >= arr[i+1]){
                en += arr[i] - arr[i+1];
            } else {
                if(en >= Math.abs(arr[i] - arr[i + 1])){
                    en -= Math.abs(arr[i] - arr[i + 1]);
                } else {
                    dol += Math.abs(arr[i] - arr[i+1]) - en;
                    en = 0;
                }
            }
        }
        System.out.println(dol);
    }
}
