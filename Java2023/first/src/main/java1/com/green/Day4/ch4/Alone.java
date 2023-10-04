package com.green.Day4.ch4;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Alone {
    public static void main(String[] args) {
        //example 휴대폰끝자리가 010-0000-0000
        //끝자리 5이하는 A공간에서 대기 6이상은 B공간에서대기하세요

        System.out.println("전화번호를 입력해주세요");
        Scanner scan = new Scanner(System.in);
        String phone = scan.nextLine();
        char num = phone.charAt(12);


        switch(num){
            case '1' ,'2' ,'3' ,'4', '5':
                System.out.println("A공간");
                break;
            case '6','7','8','9':
                System.out.println("B공간");
                break;

        }




    }
}
