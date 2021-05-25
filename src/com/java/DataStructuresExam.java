package com.java;

import java.util.Scanner;

public class DataStructuresExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStudent = scanner.nextInt(); // 4
        int matches = scanner.nextInt();
        int []arr = new int[numStudent + 1];
        for (int i=1;i<=numStudent;i++){
            int value = scanner.nextInt();
            arr[value] = i;
        }

        int cou = 0;
        while (matches-- > 0){
            int studentId1 = scanner.nextInt(); // 2
            int studentId2 = scanner.nextInt(); // 4
            int value1 = arr[studentId1]; // 2
            int value2 = arr[studentId2]; // 4
            int dir1 = Math.abs(value1-value2 - 1);
            int dir2 = numStudent-(dir1+2);
            if(dir1 %2 !=0 || dir2 %2 !=0){
                cou++;
            }
        }
        System.out.println(cou);
    }
}
