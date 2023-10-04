package com.green.Day5.Ch5;

import java.util.Scanner;

public class FlowEx17Mission2 {
    public static void main(String[] args) {
        //5 입력시 ____*
        //___**
        //__***
        //_****
        //*****
        Scanner sr = new Scanner(System.in);
        System.out.println("*값 만큼의 숫자를 입력하세요");
        int num = sr.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int z =num-i; z > 0; z--) {
                System.out.print("_");
            }
            for (int z =0; z<i+1; z++) {
                System.out.print("*");
            }
            System.out.println();
        }

            }

            }



