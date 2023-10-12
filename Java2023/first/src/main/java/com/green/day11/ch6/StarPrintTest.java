package com.green.day11.ch6;

public class StarPrintTest {
    public static void main(String[] args) {
        StarPrint sp = new StarPrint();

        sp.line(5); //*****
        sp.line(7); //*******
        System.out.println("------------");

        sp.square(4);
        /*
        ****
        ****
        ****
        ****
         */
        sp.triangle(5);
        /*
        *
        **
        ***
        ****
        *****
         */
        String gender = sp.chkGenderById("011231-2117111");
        System.out.println(gender);
        String gender1 = sp.chkGenderById("011231-1117111");
        System.out.println(gender1);
        String gender3 = sp.chkGenderById("011231-5117111");
        System.out.println(gender3);
        //8번째 자리 숫자가 2,4이면 여성 1,3이면 남성 이외 유효하지않음

        int sum = sp.sumFromTo(4,10);
        System.out.println(sum);
        int sum1 = sp.sumFromTo(10,15);
        System.out.println(sum1);
    }
}
