package com.java;

import java.util.Scanner;

public class PUM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int counter = 1;
        for (int i=1;i<=num;i++){
            if(counter % 4 == 0){
                System.out.println(" PUM");
                counter++;
                i--;
                continue;
            }
            System.out.print(counter++ + " " + counter++ + " " + counter++);
        }
        System.out.println(" PUM");
    }
}
/*
    i++    ++i
* */