package com.green.day4.ch4;

import java.util.Scanner;

public class If_2 {
    public static void main(String[] args) {
        //스캐너 이용 성별 입력
        //남자입력 잘생겼다 남자 남 man Man
        //여자입력 예쁘다  여자 여 woman Woman
        //남자여자가 아닌값은 누구냐

        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력하세요 >>");
        String gender = scan.nextLine();



        if ("남자".equals(gender) || "남".equals(gender) || "man".equals(gender) || "Man".equals(gender)) {
            System.out.println("잘생겼다");
        } else if ("여자".equals(gender) || "여".equals(gender) || "woman".equals(gender) || "Woman".equals(gender)) {
            System.out.println("예쁘다");
        } else {
            System.out.println("누구냐");
        }
    }
}