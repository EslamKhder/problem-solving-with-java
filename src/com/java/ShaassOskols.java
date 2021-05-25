package com.java;

import java.util.Scanner;

public class ShaassOskols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberBox = scanner.nextInt();
        int boxes[] = new int[numberBox];
        for (int i = 0;i<boxes.length;i++){
            boxes[i] = scanner.nextInt();
        }
        int died = scanner.nextInt();
        for (int i =0;i<died;i++){
            int position = scanner.nextInt(); // 2
            int numdied = scanner.nextInt();  // 2
            int pointerleft = 0;
            int pointerright = 0;
            for (int x = 0;x<boxes[position-1]-1;x++){
                if((x+1) < numdied){
                    pointerleft++;
                } else {
                    pointerright++;
                }
            }
            if(position == 1){
                boxes[position] += pointerright;
            } else {
                if (position == boxes.length) {
                    boxes[position-2] += pointerleft;
                } else {
                    boxes[position-2] += pointerleft;
                    boxes[position] += pointerright;
                }
            }
            boxes[position - 1] = 0;
        }

    }
}
