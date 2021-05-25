package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AbandonedSentimentFromPast {

    public static void main(String[]argus) {
        Scanner scanner = new Scanner(System.in);
        int size1 = scanner.nextInt();
        int size2 = scanner.nextInt();
        int arr1[] = new int[size1];
        List<Integer> arr2 = new ArrayList();
        for(int i=0;i<size1;i++){
            arr1[i] = scanner.nextInt();
        }
        for(int i=0;i<size2;i++){
            arr2.add(scanner.nextInt());
        }
        Collections.sort(arr2);
        int z = size2 - 1;
        for (int i=0;i<size1;i++){
            if(arr1[i] == 0){
                arr1[i] = arr2.get(z);
                z--;
            }
        }

        String res = "No";
        for (int i=0;i<size1 - 1;i++){
            if(arr1[i] >= arr1[i+1]){
                res = "Yes";
                break;
            }
        }
        System.out.println(res);
    }
}
