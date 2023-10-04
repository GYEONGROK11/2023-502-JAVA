package com.green.day4.ch4;

public class If_4 {
    public static void main(String[] args) {
        /*
        50~200사이 숫자

        100이하면 그 값의 * 2한 결과값
        100초과면 그 값의 + 10한 결과값
         */

        int val = (int) (Math.random() * 151) + 50;

        System.out.println(val);


        if (val > 100) {
            System.out.printf("%d입니다\n", val + 10);
        } else {
            System.out.printf("%d입니다\n", val * 2);
        }

        System.out.printf("%d입니다\n", val > 100 ? (val + 10) : (val * 2));


    }
}