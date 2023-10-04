package com.green.day4.ch4;

import java.util.Scanner;

public class FlowEx10 {
    public static void main(String[] args) {
        int score = 0;
        char grade = 'F';

        Scanner scan = new Scanner(System.in);
        System.out.print("당신의 점수를 입력하세요 >>");
        String num = scan.nextLine();

        score = Integer.parseInt(num);

        if (score < 0 || score > 100) {
            System.out.println("잘못된 입력입니다");
        } else {
            switch (score / 10) {
                case 9, 10:
                    grade = 'A';
                    break;
                case 8:
                    grade = 'B';
                    break;
                case 7:
                    grade = 'C';
                    break;
            }  System.out.printf("당신의 학점은 %c입니다", grade);
        }
        //스위치 사용
        //90점이상 A 80점이상 B  70점이상 C 나머지 F

    }
}
