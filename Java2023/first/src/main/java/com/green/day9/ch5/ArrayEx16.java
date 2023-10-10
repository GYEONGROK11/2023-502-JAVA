package com.green.day9.ch5;

import java.util.Scanner;

public class ArrayEx16 {
    /*
    3개의 String 값을 담을수있는 배열 생성
    3번 문자열 입력받음 (스캐너)
    입력받은 문자열들을 순차적으로 배열에 값을 넣음
    종료되면 향상된포문을 이용하여 저장되어있는 값을 콘솔에 출력
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] str = new String[3];

        for (int i =0; i< str.length; i++){
            System.out.print("문자를 입력하세요>>");
            String val = scan.nextLine();
            str[i] = val;
        }


        for(String str1 : str){    //향상된 for 문  foreach
            System.out.println(str1);
        }

    }
}
