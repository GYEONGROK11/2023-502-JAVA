package com.green.day4.ch4;

import java.util.Scanner;

public class
FlowEx8 {
    public static void main(String[] args) {
        //주민번호를 받고 여자인지 남자인지 유효하지 않은지 스위치문
        System.out.print("주민번호를 입력하세요>>");
        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();

        char result = num.charAt(7);
        int val = Character.getNumericValue(result);


        switch (val) {
            case 1, 3:
                System.out.println("남자입니다");
                break;
            case 2, 4:
                System.out.println("여자입니다");
                break;
            default:
                System.out.println("없는 번호입니다");


        }
    }
}
