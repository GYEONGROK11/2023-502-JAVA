package com.green.day3.ch4;

//사용 Scanner ,if, parsing(형변환)

import java.util.Scanner;

public class FlowEx2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 하나 입력해주세요 >>");
        String input = scan.nextLine();
        int num = Integer.parseInt(input);


        if ( num == 0) {
            System.out.println("콘솔에 입력하신 숫자는 0입니다"); }
        if ( num != 0) {
            System.out.println("콘솔에 입력하신 숫자는 0이 아닙니다"); }

        if ( num == 0) {
            System.out.println("콘솔에 입력하신 숫자는 0입니다"); }  // else는 나머지 조건일때
        else {
            System.out.println("콘솔에 입력하신 숫자는 0이 아닙니다"); }

        if ( num == 0) {
            System.out.println("콘솔에 입력하신 숫자는 0입니다"); }
       else  {
            System.out.println("콘솔에 입력하신 숫자는 0이 아닙니다");
            System.out.printf("입력하신 숫자는 %d 입니다" , num);}


        /*
        숫자를 입력하세요 - 입력대기 - 입력
        변수에 해당 값이 저장될 수 있도록
        해당 문자열을 > 정수형으로 형변환
        해당 숫자가 0이라면 "콘솔에 입력하신 숫자는 0입니다"
        해당 숫자가 0이 아니라면 "콘솔에 입력하신 숫자는 0이 아닙니다"
         */

    }
}
