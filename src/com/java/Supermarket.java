package com.java;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Supermarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numMarkets = scanner.nextInt();
        int numKilos = scanner.nextInt();
        Map<Double,Double> appels = new TreeMap<>();
        for(int i=0;i<numMarkets;i++){
            Double price = scanner.nextDouble();
            Double kilos = scanner.nextDouble();
            Double result = price / kilos;
            appels.put(result,result * numKilos);
        }
        System.out.println(appels.values().stream().findFirst().get());
    }
}
