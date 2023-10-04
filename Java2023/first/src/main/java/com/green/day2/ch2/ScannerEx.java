package com.green.day2.ch2;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //객체에 주소값이 저장됨
        /*
        객체
        속성(값저장, 명사)
        메소드(기능, 동사)
         */
        System.out.println("두자리 정수를 하나 입력해주세요 >>");
        String input = scan.nextLine();
        int num = Integer.parseInt(input);
        //double num1 = Double.parseDouble(input);
        //System.out.printf("num = %f\n", (num1 + num1));

        System.out.println("입력내용 : " + (input + input));
        System.out.printf("num = %d\n", (num + num));
    }
}
