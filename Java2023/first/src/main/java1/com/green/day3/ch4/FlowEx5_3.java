package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5_3 {
    public static void main(String[] args) {
        int score = 0;
        System.out.print("점수를 입력하세요");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();


        String grade = "c";//String은 %S
        String opt = "";

        if (score >= 90) {
            grade = "A";
            if (score >= 98) {
            } else if (score >= 80) {
                grade = "B";
            }
        }
        if (score >= 80) {
            int rMod = score % 10;

            if (score % 10 >= 8 || score == 100) {
                opt = "+";
            } else if (rMod <= 3) ;
            opt = "-";
        }

        System.out.printf("%s학점", grade, opt);


    }
}
