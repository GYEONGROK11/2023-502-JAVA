package com.green.Day4.ch4;

import java.util.Scanner;

public class If_3 {
    public static void main(String[] args) {
    //int val = //1~100 홀수면 > 11은 홀수입니다.
        int val = (int)(Math.random()*100)+1;
        /*String h = "홀수";
        if(val%2 == 0){
            h="짝수";
        }System.out.printf("%d는 %s입니다" , val , h );*/

        String h = "짝수";
        String b = "홀수";

        System.out.printf("%d는 %s입니다.", val ,val % 2 == 0 ? h : b);


    }
}
