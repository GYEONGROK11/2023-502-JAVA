package com.green.day3.ch4;

import com.green.day2.Ch2.ScannerEx;

import java.util.Scanner;

//해당값이 홀수면 -은 홀수입니다.
//해당값이 짝수면 -은 짝수입니다.
//예를 입력을 8로했다 8은 짝수입니다.
public class FlowEx2_2 {

    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println( "숫자를 하나 입력하세요");

        String tmp = scan.nextLine();
        int input = Integer.parseInt(tmp);//형변환 Interger.parseInt 의 method사용으로 정수로전환  문자열 equals


        if( (input ) % 2  == 0 ) {
            System.out.printf(" %d은 짝수입니다." , input);
        }else{
            System.out.printf(" %d는 홀수입니다", input
            );
        }
    }
}
