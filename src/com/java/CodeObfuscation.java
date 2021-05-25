package com.java;

import java.util.Scanner;

public class CodeObfuscation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.next();

        char []arr = new char[code.length()];

        if(code.charAt(0) == 'a'){
            arr[0] = 'a';
            for (int i = 1;i<code.length();i++){ // a b c d       64 65 66 67
                for (int z=0;z<code.length();z++){
                    if(code.charAt(i) == arr[z] || code.charAt(i) - arr[z] == 1){
                        arr[i] = code.charAt(i);
                        break;
                    }
                }
            }
            boolean flag = true;
            for (int i=0;i<code.length();i++){
                if(code.charAt(i) != arr[i]){
                    flag = false;
                }
            }
            if(flag == true){
                System.out.println("YES");
            } else  {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}
