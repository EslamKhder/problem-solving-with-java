package com.java;

import java.util.Scanner;

public class RaisingBacteria {
    public static void main(String[] args) {
        // write your code here
        int n;
        int ans =0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        while(n>1){
            if(n%2==0)
                n=n/2;
            else
            {
                n=n-1;
                ans++;
            }
        }
        System.out.println(ans+1);
    }
}
