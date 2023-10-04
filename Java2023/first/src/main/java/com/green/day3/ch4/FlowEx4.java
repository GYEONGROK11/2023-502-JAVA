package com.green.day3.ch4;

import java.util.Scanner;

public interface FlowEx4 {
    public static void main(String[] args) {
        int score = 0;

        System.out.print("점수를 입력하세요 >>");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        if(score >= 90) {
            System.out.println("A");
        } else if(score >= 80){
            System.out.println("B");
        } else if(score >= 70) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }

        char grade = 'D';

        if(score >= 90) {
             grade = 'A';
        } else if(score >= 80){
            grade = 'B';
        } else if(score >= 70) {
            grade = 'C';
        }
        System.out.printf("%c학점\n", grade);


        //score 값이 90점보다 같거나 크면 A
        // 80점보다 같거나 크면 B
        // 70점보다 같거나 크면 C
        // 나머지 D
    }
}
