package com.green.Day4.ch4;

import java.util.Scanner;

public class If_1 {
    public static void main(String[] args) {
        //Scanner를 이용하여 성별을 입력(남자,여자)
        //만약 남자가 입력되었다면 콘솔에 " 잘 생겼다." 만약 여자면 콘솔에 " 예쁘다" 아니면 " 누구냐"

        Scanner scan = new Scanner(System.in);

        System.out.println("성별을 입력 해주세요. (남자,여자)");
        String gender = scan.nextLine();
      /*  if ("남자".equals(gender)) {
            System.out.println("잘생겼다");
        } else if ("여자".equals(gender)) {
            System.out.println("예쁘다");
        } else {
            System.out.println("누구냐");*/
        if ("남자".equals(gender)) {
            System.out.println("잘생겼다");
        } else {
            System.out.println("여자".equals(gender) ? "예쁘다" : "누구냐");
        }
        String m = "잘생겼다";
        String w = "예쁘다";
        String a = "누구냐";
        System.out.printf("%s",("여자".equals(gender)|| "남자".equals(gender)) ? ("여자".equals(gender) ? w : m) : a);


    }
}