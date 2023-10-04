package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx2 {
    public static void main(String[] args) {
        //숫자를 하나 입력하세요> (콘솔)
        //(입력 기다려야함)
        //숫자를 입력하고 엔터를 누르면
        //String변수에 해당값이 저장될 수 있도록
        //해당 문자열을> 정수형으로 형변환
        //해당 숫자가 0이라면 콘솔에 "입력하신 숫자는 0입니다."
        //해당 숫자가 0이 아니라면 콘솔에"입력하신 숫자는 0이 아닙니다."가 떠야함

        System.out.print("숫자를 하나 입력해주세요 >>");

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int num = Integer.parseInt(str);


        if (num != 0) {
            System.out.printf("입력하신 숫자는 %d입니다", num);
        } else {
                System.out.println( "입력하신 숫자는 0입니다");
        }
    }
}