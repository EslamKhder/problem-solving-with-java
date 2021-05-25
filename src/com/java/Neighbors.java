package com.java;

import java.util.Scanner;

public class Neighbors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double size = input.nextDouble();

        double c = Math.ceil(Math.sqrt(Math.pow(a,2) + Math.pow(b,2)));

        long length = (long) Math.ceil(c/size);
        System.out.println(length*length);

    }
}