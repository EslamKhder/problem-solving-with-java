package com.java;

import java.util.Scanner;

public class SnowFootprints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        char []path = scanner.next().toCharArray();
        int f = 0;
        int l = 0;
        for (int i=0;i<size;i++){
            if(path[i] != '.'){
                f = i;
                break;
            }
        }
        for (int i=size-1;i>=0;i--){
            if(path[i] != '.'){
                l = i;
                break;
            }
        }
        if(path[f] == 'R' && path[l] == 'R'){
            System.out.println((f+1) + " " + (l+2));
        } else if(path[f] == 'L' && path[l] == 'L'){
            System.out.println((l+1) + " " + (f));
        } else {
            for (int i = f;i<size;i++){
                l = i;
                if(path[i] == 'L'){
                    break;
                }
            }
            System.out.println((f+1) + " " + l);
        }
    }
}
