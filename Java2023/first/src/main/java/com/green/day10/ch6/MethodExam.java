package com.green.day10.ch6;

import java.util.Random;

public class MethodExam {
    void checkZero(int n) {
        System.out.println(n == 0 ? "0입니다" : "0이 아닙니다");
    }

    int randomValFromTo(int n1, int n2) {
        int a = (int) (Math.random() * (n2 - n1 + 1) + n1);
        return a;
    }

    void scoreResultPrint(int n) {

        if (n < 0 || n > 100) {
            System.out.println("잘못입력");
            return;
        }
        String grade = "D";
        if (n >= 90) {
            grade = "A";
        } else if (n >= 80) {
            grade = "B";
        } else if (n >= 70) {
            grade = "C";
        }
        System.out.printf("%s학점\n", grade);
    }
}
