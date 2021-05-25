package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LuckyNumbers {
    public static void main(String[] args) {
        List<Integer> mynums = new ArrayList(); // 1 10^5
        mynums.add(4);mynums.add(7);mynums.add(44);mynums.add(47);mynums.add(74);mynums.add(77);
        mynums.add(444);mynums.add(447);mynums.add(474);mynums.add(477);
        mynums.add(774);mynums.add(777);mynums.add(747);mynums.add(744);
        mynums.add(4444);mynums.add(4447);mynums.add(4474);mynums.add(4477);
        mynums.add(4777);mynums.add(4744);mynums.add(4774);mynums.add(4747);
        mynums.add(7777);mynums.add(7774);mynums.add(7747);mynums.add(7744);
        mynums.add(7444);mynums.add(7477);mynums.add(7447);mynums.add(7474);
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt(); // 1
        int num2 = scanner.nextInt(); // 100
        int flag = 0;
        for (int i = num1;i<=num2;i++) {
            if(mynums.contains(i)){
                System.out.print(i + " ");
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println(-1);
        }

    }
}
