package com.green.day6.ch4;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int input = 0;
        do{
            System.out.print("1~100사이 숫자 입력 (종료:0) >>");
            input = scan.nextInt();
            sum += input;
        }while(input !=0);
        System.out.println("끝!"+sum);
    }
}
