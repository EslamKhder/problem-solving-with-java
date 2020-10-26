package com.company;

import java.util.Scanner;

public class BlackSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] nums = new int[4];
        int counter = 0;
        for (int i=0;i<nums.length;i++){
            nums[i] = scanner.nextInt();
        }
        String instraction = scanner.next();
        for (int x = 0;x<instraction.toCharArray().length;x++){
            //counter += nums[Math.abs(instraction.toCharArray()[x] - 48 - 1)];
            //System.out.println("-----> " + (int)instraction.charAt(x));
            counter += nums[Math.abs( (int)instraction.charAt(x) - 48 - 1)];
        }
        System.out.println(counter);
    }
}
