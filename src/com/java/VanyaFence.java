package com.java;

import java.util.Scanner;

public class VanyaFence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int height = scanner.nextInt();
        int result = size;
        for (int i=0;i<size;i++) {
            int h = scanner.nextInt();
            if(h > height){
                result++;
            }
        }
        System.out.println(result);

    }
}
