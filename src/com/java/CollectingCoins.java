package com.java;

import java.util.Scanner;

public class CollectingCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int x = 4;
        int[][] arr = new int[num][x];
        for (int i = 0; i < num; i++) {
            int max = 0;
            int result = 0;
            for (x = 0; x < 4; x++) {
                arr[i][x] = scanner.nextInt();
                if (x != 3) {
                    if (arr[i][x] > max) {
                        max = arr[i][x];
                    }
                }
            }
            for (x = 0; x < 4; x++) {
                if (x != 3 && max != arr[i][x]) {
                    result += max - arr[i][x];
                }

            }
            if ((arr[i][x - 1] - result) % 3 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
