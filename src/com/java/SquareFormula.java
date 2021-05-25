package com.java;

import java.util.Scanner;

public class SquareFormula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int res = 0;
        int x = 1;
        int y = 1;
        for (int i = 1;i<num;i++){
            if((Math.pow(x,2) + Math.pow(y,2)) == num){
                res++;
                break;
            }
            y++;
        }
        if(res == 0){
            System.out.println(res);
            return;
        }
        System.out.println(++res);
    }
}
