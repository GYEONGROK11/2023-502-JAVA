package com.green.day4.ch4;

import java.util.Scanner;

public class If_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력하세요 >>");
        String gender = scan.nextLine();

        if ("남자".equals(gender)) {
            System.out.println("잘생겼다");
        } else if ("여자".equals(gender)) {
            System.out.println("예쁘다");
        } else {
            System.out.println("누구냐");
        }


        System.out.println(gender.equals("남자") ? "잘생겼다" : gender.equals("여자") ? "예쁘다" : "누구냐");


        //스캐너 이용 성별 입력
        //남자입력 잘생겼다
        //여자입력 예쁘ㅏ
        //남자여자가 아닌값은 누구냐
    }
}
