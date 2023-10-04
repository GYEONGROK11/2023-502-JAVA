package com.green.Day4.ch4;

import java.util.Scanner;

public class FlowEx6 {
    public static void main(String[] args) {
        System.out.printf("현재 월을 입력하세요>>");
       //mon값이 3~5사이면 "현재의 계절은 봄입니다"출력,
        //6~8사이면 "현재의 계절은 여름입니다"출력
        //9~11사이면"현재의 게절은 가을입니다"
        //12,1,2면"현재의 계절은 겨울입니다"출력

        Scanner scan = new Scanner(System.in);
        int mon = scan.nextInt();

        switch(mon){//문자열 구분시 switch가 편함 if= equals.사용
            case 3 : case 4 : case 5 ://case 3, 4, 5: 가능
                System.out.println("현재의 계절은 봄 입니다");
                break;
            case 6 : case 7 : case 8 :
                System.out.println("현재의 계절은 여름 입니다");
                break;
            case 9 : case 10 : case 11:
                System.out.println("현재의 계절은 가을 입니다.");
                break;
            case 12 : case 1 : case 2:
                System.out.println("현재의 계절은 겨울 입니다.");
                break;
            default:
                System.out.println("없는 월 입니다.");
          }

    }
}
