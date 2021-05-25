package com.java;

import java.util.Scanner;

public class Skier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int result;
        for(int z=0;z<size;z++){
            result = 5;
            char []value = scanner.next().toCharArray();
            for(int i=1;i<value.length;i++) {
                if (value[i - 1] == 'N' && value[i] == 'S'
                    ||value[i - 1] == 'W' && value[i] == 'E'
                    ) {
                    result++;
                } else {
                    result +=5;
                }
                if(i != value.length - 1 && value[i] == value[i + 1]){
                    value[i] = value[i-1];
                }
            }
            System.out.println(result);
        }
    }
}
