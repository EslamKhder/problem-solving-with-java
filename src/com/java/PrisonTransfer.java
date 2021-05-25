package com.java;

import java.util.Scanner;

public class PrisonTransfer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nums = scanner.nextInt();
        int con = scanner.nextInt();
        int re = scanner.nextInt();
        int counter = 0;
        int res = 0;
        for(int i=0;i<nums;i++){
            int pr = scanner.nextInt();
            if(pr <= con)  counter++;
            else counter = 0;
            if(counter >= re) res++;
        }
        System.out.println(res);
    }
}
