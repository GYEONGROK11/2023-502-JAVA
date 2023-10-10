package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx32 {
    public static void main(String[] args) {
        /*
        (1) 내용1
        (2) 내용2
        (3) 내용3
        원하는 메뉴 1~3을 선택하세요 (종료 : 0) >>  1
        선택하신 메뉴는 1번입니다
        원하는 메뉴 1~3을 선택하세요 (종료 : 0) >>  4
        메뉴를 잘못 선택하셨습니다
        원하는 메뉴 1~3을 선택하세요 (종료 : 0) >>  0
        프로그램을 종료합니다
        */

        Scanner scan = new Scanner(System.in);
        int input = 0;
        while (true) {
            System.out.print("(1)메뉴1\n(2)메뉴2\n(3)메뉴3\n원하는 메뉴 1~3을 입력하세요 (종료:0) >>");
            input = scan.nextInt();
            if (input == 1) {
                System.out.println("선택메뉴는 1번입니다");
            } else if (input == 2) {
                System.out.println("선택메뉴는 2번입니다");
            } else if (input == 3) {
                System.out.println("선택메뉴는 3번입니다");
            } else if (input == 0) {
                break;
            } else {
                System.out.println("잘못입력하셨습니다");
            }

        }
        System.out.println("끝!");

    }
}

class FlowEx32_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("(1)메뉴1\n" +
                    "(2)메뉴2\n" +
                    "(3)메뉴3\n" +
                    "원하는 메뉴 1~3을 입력하세요 (종료:0) >>");
            int choice = scan.nextInt();

            if (choice == 0) {
                break;
            } else if (choice < 1 || 3 < choice) {
                System.out.println("잘못선택하셨습니다");
                continue;
            }
            System.out.printf("선택하신 메뉴는 %d번 입니다\n", choice);
        }
        System.out.print("프로그램 종료");
    }
}