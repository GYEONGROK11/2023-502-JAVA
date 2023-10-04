package com.green.day2.Ch2;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        System.out.print("두자리 정수를 하나 입력해주세요 >>");

        Scanner scan = new Scanner(System.in); //객체화 대문자:주소값 (객체에 접근할수있음) 객체 :속성(값저장,명사) 메소드(기능,동사)



        String input = scan.nextLine();//입력내용 기다림

        int num = Integer.parseInt(input);


        System.out.println("입력내용: " + input + input);
        System.out.printf("num=%d\n", num + num);
    }
}
