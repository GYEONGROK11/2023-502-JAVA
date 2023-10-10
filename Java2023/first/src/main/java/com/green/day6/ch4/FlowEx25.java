package com.green.day6.ch4;

import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args) {
        int num = 0, sum =0;
        System.out.printf("숫자를 입력하세요.>>");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        //12345 는 15가나오게  각각 합
        while (num != 0){
            int modVal = num % 10;  //sum += num % 10 // sum = sum + num % 10
            sum += modVal;
            num /= 10;
        }
        System.out.println("결과 : "+sum);
    }
}
