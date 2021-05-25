package com.java;

import java.util.Scanner;

public class BrainsPhotos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int whiteBlack = 0;
        int color = 0;
        char [][] arr = new char [row][column];
        for (int i=0;i<row;i++){
            for (int z=0;z<column;z++){
                arr[i][z] = scanner.next().charAt(0);
                if(arr[i][z] == 'W' || arr[i][z] == 'B' || arr[i][z] == 'G'){
                    whiteBlack ++;
                } else {
                    color ++;
                }
            }
        }
        if (whiteBlack > color){
            System.out.println("#Black&White");
        } else {
            System.out.println("#Color");
        }
    }
}
