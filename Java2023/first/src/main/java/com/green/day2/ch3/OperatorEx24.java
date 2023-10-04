package com.green.day2.ch3;

public class OperatorEx24 {
    public static void main(String[] args) {
        //&& 연산자와 || 연산자의 결과 타입은 boolean 형식 (불리언)

        boolean b1 = 1 == 1 && 2 == 2;  //&& : and연산자

        System.out.println("b1 : " + b1);

        boolean b2 = 1 == 1 && 2 == 2 && 3 == 4;

        System.out.println("b2 : " + b2);

        boolean b3 = 1 == 2 || 2 == 3 || 4 == 4;  //|| : or연산자

        System.out.println("b3 : " + b3);

        boolean b4 = 1 == 2 || 2 == 3 || 3 == 4;

        System.out.println("b4 : " + b4);


        //부정연산자  !

        boolean b5 = 1 == 1;
        System.out.println("b5 : " + b5);
        System.out.println("!b5 : " + !b5);
        System.out.println("!!b5 : " + !!b5);


    }
}
