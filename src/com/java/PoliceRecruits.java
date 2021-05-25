package com.java;

import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int events = scanner.nextInt();
        int police = 0;
        int issue = 0;
        for (int i=0;i<events;i++){
            int event = scanner.nextInt();
            if(event == -1){
                if(police == 0){
                    issue++;
                } else {
                    police--;
                }
            } else {
                police += event;
            }
        }
        System.out.println(issue);

    }
}
