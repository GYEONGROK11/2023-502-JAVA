package com.green.Day4.ch4;

import java.util.Scanner;

public class FlowEx8_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String HI = scan.nextLine();
        char gender = HI.charAt(7);
        switch(gender){
            case '2', '4':
                System.out.println("여성");
                break;
            case '1','3' :
                System.out.println("남성");
                break;
            default:
                System.out.println("요효하지 않음");
        }
        }
    }