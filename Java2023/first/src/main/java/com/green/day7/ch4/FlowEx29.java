package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx29 {
    public static void main(String[] args) {
        //3,6,9게임
        /*
        i = 1
        i = 2
        i = 짝
        ...
         */

        for (int i = 1; i < 101; i++) {
            System.out.printf("i = %d ", i);
            int temp = i;
            while (temp > 0) {
                int modVal = temp % 10;
                if (modVal != 0 && modVal % 3 == 0) {
                    System.out.print("짝");
                }
                temp /= 10;
            }
            System.out.println();
        }

    }
}

class FlowEx29_1 {
    public static void main(String[] args) {

        for (int i = 1; i < 101; i++) {
            System.out.printf("i = %d ", i);
            int tmp = i;
            do {
                int modVal = tmp % 10;
                if (modVal % 3 == 0 && modVal != 0) {
                    System.out.print("짝");
                }
                tmp /= 10;
            } while (tmp !=0);
            System.out.println();
        }

    }
}

class FlowEx29_2 {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            int a = i % 10;
            double c = i / 10;
            System.out.printf("i=%d %s%s\n", i, a == 3 || a == 6 || a == 9 ? "짝" : "", c == 3 || c == 6 || c == 9 ? "짝" : "");

        }
    }
}