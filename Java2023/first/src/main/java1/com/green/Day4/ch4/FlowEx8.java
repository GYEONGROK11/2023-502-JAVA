package com.green.Day4.ch4;

import com.green.day3.ch4.scanner;

import java.util.Scanner;

public class FlowEx8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("당신의 주민 번호를 입력 하세요.(000000-1111333 하이픈 포함 작성 바람) >> ");
        //주민 번호 입력 받고 주민 번호를 확인 하시고 > 여자 인지 남자 인지, 유효 하지 않은 번호 인지 출력

        String num = scan.nextLine();
        char idGen = num.charAt(7);

        switch (idGen) {//괄호안에 들어간 값에 따라 CASE TYPE이 달라진다 char=' ', String="", 정수 - 숫자 이렇게만가능
            case '1', '3':
                System.out.println(" 남자 입니다.");
                break;
            case '2', '4':
                System.out.println(" 여자 입니다");
                break;
            default:
                System.out.println("사람이 아닙니다");
        }
        }
    }
