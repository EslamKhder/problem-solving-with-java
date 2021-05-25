package com.java;

import java.util.Scanner;

public class Bonapity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int i=0;i<size;i++){
            String word1 = scanner.next().toLowerCase(); // pnggp
            String word2 = scanner.next().toLowerCase();
            word1 = word1.replaceAll("p","b");
            word1 = word1.replaceAll("i","e");
            word2 = word2.replaceAll("p","b");
            word2 = word2.replaceAll("i","e");

            System.out.println(word1.equals(word2)? "Yes" : "No");

        }
    }
}
