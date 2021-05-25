package com.java;

import java.util.Scanner;

public class oPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 97;
        int aa = 191;
        int fix = 94;
        int numChar = scanner.nextInt();
        for (int i =0;i<numChar;i++) {
            int num = scanner.nextInt();
            int result = aa - num; // 187 - 191 = 4  101
            System.out.print((char) 182);
        }

    }
}
/*
      a  97
      b  98
      c  99
      d  100
      e 101
      f 102
      j 103
      h 104
* */
/*

  a   191
  b   190
  c   189
  d   188
  e   187
  f   186
  j   185
  h   184
  i   183
* */