package com.green.day6.ch4;

import java.util.Scanner;

public class DoWhile3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int input = 0;
        while (true){
            System.out.print("1~100사이 숫자 입력 (종료:0) >>");
            input = scan.nextInt();
            if(input == 0){
            break;}                                 //무한루프에 break 조건을 달아서 끝냄
            sum += input;
        }
        System.out.println("끝!"+sum);
    }
}
