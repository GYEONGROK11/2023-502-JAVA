package com.green.day10.ch5;

import java.util.Scanner;

public class MultiArrEx4 {
    public static void main(String[] args) {
        /*
            Q1 chair 의 뜻은? >>dmlwk
            틀렸습니다 정답은 의자입니다
            Q2 computer 의 뜻은? >>컴퓨터
            정답입니다
         */
        String[][] words = {
                {"chair", "의자"},
                {"computer", "컴퓨터"},
                {"integer", "정수"},
                {"double", "실수"}
        };

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            String[] Q = words[i];
            System.out.printf("Q%d. %s의 뜻은?>>", i + 1, Q[0]);
            String word = scan.nextLine();
            if (word.equals(Q[1])) {
                System.out.println("정답입니다");
            } else {
                System.out.printf("오답입니다. 정답은 %s입니다\n", Q[1]);
            }
            /*
            if (!word.equals(Q[1])) {
                System.out.printf("오답입니다. 정답은 %s입니다\n", Q[1]);
                continue;
            } System.out.println("정답입니다");
            */
        }
    }
}

class MultiArrEx4_1 {
    public static void main(String[] args) {
        String[][] words = {
                {"chair", "의자"},
                {"computer", "컴퓨터"},
                {"integer", "정수"},
                {"double", "실수"}
        };

        Scanner scan = new Scanner(System.in);

        int i = 1;
        for (String[] wordArr : words) {
            System.out.printf("Q%d. %s의 뜻은?>>", i + 1, wordArr[0]);
            String word = scan.nextLine();
            if (!word.equals(wordArr[1])) {
                System.out.printf("오답입니다. 정답은 %s입니다\n", wordArr[1]);
                continue;
            }
            System.out.println("정답입니다");
        }
    }
}