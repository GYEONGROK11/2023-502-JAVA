package com.green.Day5.Ch5;

import java.util.Scanner;

public class FlowEx17Mission {
    public static void main(String[] args) {
        Scanner star = new Scanner(System.in);
        System.out.println("*을 출력할 라인의 수를 입력 하세요");
        int num = star.nextInt();
        //5입력 추출
        /*
        ____*
        ___**
        __***
        _**** _가 하나 더나왔어 5넣었는데
        *****
         */
        for (int i =1; i <=num; i++) {
            for (int z =num-i; z>0; z--) {
                System.out.print("_");
            }
            for (int z =1; z<i+1; z++) {
                System.out.print("*");

            }
            System.out.println();
        }

        System.out.println("---------------------");
        for (int i =num; i>0 ; i--) {
            for (int z =1; z<=num; z++) {
                if(z < i){
                    System.out.print("_");
                }else{
                    System.out.print("*");
                }

            }
            System.out.println();

        }

        }
    }

