package com.java;

import java.util.Scanner;

public class I_love_username {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int com = scanner.nextInt();
        int max = 0;
        int min = 0;
        int counter = 0;
        boolean flag = true;
        for (int i =0;i<com;i++){
            int points = scanner.nextInt();
            if (flag){
                max = points;
                min = points;
                flag = false;
            }
            if (points > max){
                counter++;
                max = points;
            } else if(points < min){
                counter++;
                min = points;
            }
        }
        System.out.println(counter);
    }
}
