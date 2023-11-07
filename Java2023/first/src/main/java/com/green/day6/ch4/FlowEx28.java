package com.green.day6.ch4;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        int input = 0;
        int answer = (int) (Math.random() * 100 + 1);

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("1~100사이 숫자 입력 >>");
            input = scan.nextInt();
            if (input > answer) {
                System.out.print("down\n");
            } else if (input < answer) {
                System.out.print("up\n");
            } else if (input == answer) {
                break;
            }
        }
        System.out.print("정답");
    }

}
class FlowEx28_1 {
    public static void main(String[] args) {  //객체 = 속성 + 메소드
        int input = 0;
        int answer = (int) (Math.random() * 100 + 1);

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("1~100사이 숫자 입력 >>");
            input = scan.nextInt();

            if (input == answer) {
                break;
            }
            System.out.println(input < answer ? "up" : "down");
        }
        System.out.print("정답");
    }
}
//System.out.println("answer : " + answer);

        /*
        while 문 이용
        숫자를 1~100 사이의 정수를 입력하세요>>
        입력 숫자 보다 크다 UP
        입력 숫자 보다 작다 DOWN
        맞출때까지 반복
         */

