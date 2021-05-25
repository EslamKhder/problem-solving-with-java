package com.java;

import java.util.Scanner;

public class Ambidexters {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int frist= scanner.nextInt(); // 5     5
            int secound= scanner.nextInt(); // 2   2
            int last= scanner.nextInt(); // 3      2

            if (frist > secound) { // 5 > 2
                int result = frist - secound; //  3
                if(result <= last){    // 3 <=  3  // 5 5 0
                    secound += result;
                    last -= result;
                    secound += last/2;
                    frist += last/2;
                } else {
                    secound += last;
                }
            } else if(secound > frist){

                int result = secound - frist;
                if(result <= last){
                    frist += result;
                    last -= result;
                    secound += last/2;
                    frist += last/2;
                } else {
                    frist += last;
                }
            } else {
                frist += last/2;
                secound += last/2;
            }
 ///  5 3    // 2 5    / 3 3
            if(frist > secound){
                System.out.println(secound * 2);
            } else if(secound > frist){
                System.out.println(frist * 2);
            } else {
                System.out.println(secound + frist);
            }
        }
    }

