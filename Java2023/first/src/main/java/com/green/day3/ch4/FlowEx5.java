package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] arge) {
        int score = 0;
        System.out.print("점수를 입력하세요 >>");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        if (score >= 90) {
            if (score >= 98) {
                System.out.printf("A+\n");
            } else if (score <= 93) {
                System.out.printf("A-\n");
            } else {
                System.out.printf("A\n");
            }
        } else if (score >= 80) {
            if (score >= 88) {
                System.out.printf("B+\n");
            } else if (score <= 83) {
                System.out.printf("B-\n");
            } else {
                System.out.printf("B\n");
            }
        } else {
            System.out.printf("C\n");
        }
        //스코어 90점 보다 같거나 크면 A
        //80점 보다 같거나 크면 B
        //1의 자리수가 8이상이면 + 3이하면 - 나머지는 빈칸
        //나머지 C
        String grade = "C";
        String opt = "";
        if (score >= 90) {
            grade = "A";
            if (score >= 98) {
                opt = "+";
            } else if (score <= 93) {
                opt = "-";
            }
        } else if (score >= 80) {
            grade = "B";
            if (score >= 88) {
                opt = "+";
            } else if (score <= 83) {
                opt = "-";
            }
        }
        System.out.printf("%s%s학점\n", grade, opt);

        String grade1 = "C";
        String opt1 = "";
        if (score >= 90) {
            grade1 = "A";
        } else if (score >= 80) {
            grade1 = "B";
        }
        if (score >= 80) {
            //int rMod = score % 10;
            if (score % 10 >= 8 || score == 100) {
                // (rMod >= 8 || score == 100)
                opt1 = "+";
            } else if (score % 10 <= 3) {
                // (rMod <= 3)
                opt1 = "-";
            }
        }
        System.out.printf("%s%s학점\n", grade1, opt1);


    }
}
