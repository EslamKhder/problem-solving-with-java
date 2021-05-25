package com.java;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {

        /*
        3
        1 1 0
        1 1 1
        1 0 0
        * */
        Scanner scanner = new Scanner(System.in);
        int numQuestion = scanner.nextInt();
        int counter = 0;
        for(int i = 0;i<numQuestion;i++){
            int total = 0;
            for (int x =0;x<3;x++){
                int answer = scanner.nextInt();
                total += answer;
            }
            if(total >= 2){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
