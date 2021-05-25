package com.java;

import java.util.Scanner;

public class VanyaCubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        int result = 0;
        int added = 1;
        while (true){
            result = 0;
            for (int x = added;x>0;x--){
                for (int i = x;i>0;i--){
                    result += i;
                }
            }
            if(result > num){
                break;
            }
            count++;
            added++;
        }
        System.out.println(count);
    }
}
