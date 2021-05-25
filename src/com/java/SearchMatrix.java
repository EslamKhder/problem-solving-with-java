package com.java;

import java.util.Scanner;

public class SearchMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int [][]arr = new int[row][col];

        for (int i =0;i<row;i++){
            for (int x=0;x<col;x++){
                arr[i][x] = scanner.nextInt();
            }
        }
        int se = scanner.nextInt();
        int flag1 = 0;
        for (int i =0;i<row;i++){
            for (int x=0;x<col;x++){
                if(arr[i][x] == se){
                    flag1 = 1;
                    break;
                }
            }
            if(flag1 == 1){
                break;
            }
        }
        if(flag1 == 1){
            System.out.println("will not take number");
        } else {
            System.out.println("will take number");
        }
    }
}
/*

     0 1 2
   0 5 6 7
   1 8 9 10
   2 1 2 3
* */
