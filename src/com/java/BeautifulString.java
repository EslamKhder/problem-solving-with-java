package com.java;

import java.util.Scanner;

public class BeautifulString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for(int i =0;i<size;i++){
            String value = scanner.next();
            if(!isOk(value)){
                System.out.println(-1);
                continue;
            }
            char arr[] = {'a','b','c'};
            char ar[] = value.toCharArray();
            int in = 0;
            int flag = 0;
            int z =0;
            while (value.length() > z){
                if(value.toCharArray()[z] == '?'){
                    ar[z] = arr[in];
                    if(!isOk(ar)){
                        in += 1;
                    } else {
                        flag = 1;
                        z++;
                    }
                } else {
                    z++;
                }
                if (flag == 1){
                    in = 0;
                }
                flag = 0;
            }
            System.out.println(ar);
        }
    }

    public static boolean isOk(String value){
        for(int x=0;x<value.toCharArray().length;x++) {
            if (value.toCharArray()[x] != '?'
                    && value.toCharArray()[x] != '?'
                    && x != value.toCharArray().length - 1
                    && value.toCharArray()[x] == value.toCharArray()[x + 1]
            ) {
                return false;
            }
        }
        return true;
    }
    public static boolean isOk(char[] value){
        for(int x=0;x<value.length;x++) {
            if (value[x] != '?'
                    && value[x] != '?'
                    && x != value.length - 1
                    && value[x] == value[x + 1]
            ) {
                return false;
            }
        }
        return true;
    }
}
