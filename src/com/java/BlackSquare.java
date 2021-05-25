package com.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BlackSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer,Integer> steps = new HashMap<>();
        int res = 0;
        for (int i=1;i<=4;i++){
            steps.put(i,scanner.nextInt());
        }
        /*
            1 2 3 4
            1 5 3 2
        * */
        // 11221
        char []arr = scanner.next().toCharArray(); // ['1','1','2','2','1']
        for (int i=0;i<arr.length;i++){
            res += steps.get(arr[i] - 48);
        }
        System.out.println(res);
    }
}