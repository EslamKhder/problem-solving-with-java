package com.java;

import java.util.Scanner;

public class TwoIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l1 = scanner.nextInt();
        int r1 = scanner.nextInt();

        int l2 = scanner.nextInt();
        int r2 = scanner.nextInt();
        if(r1 < l2){
            System.out.println(-1);
            return;
        }
        if(r1 > l2){
            System.out.println(l2 + " " + r1);
        } else {
            System.out.println(r1 + " " + l2);
        }
    }
}
