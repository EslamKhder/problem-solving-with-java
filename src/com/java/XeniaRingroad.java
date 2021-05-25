package com.java;

import java.util.Scanner;

public class XeniaRingroad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long numHouse = scanner.nextLong();
        long tasks = scanner.nextLong();

        long result = 0;
        long point = 1;
        for (int i=0;i< tasks;i++){
            long house = scanner.nextInt();
            if(house >= point){
                result += house-point;
            } else {
                result += (numHouse - point) + house;
            }
            point = house;
        }
        System.out.println(result);
    }

}
