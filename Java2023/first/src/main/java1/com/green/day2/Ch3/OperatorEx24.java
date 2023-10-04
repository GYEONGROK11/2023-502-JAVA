package com.green.day2.Ch3;

public class OperatorEx24 {
    public static void main(String[] args ){
        boolean b1 = 1 == 1 && 2 == 2;//and 연산자
        System.out.println("b1 : :"+ b1);
        boolean b2 = 1 == 1 && 2 == 2 && 3 == 4;//and연산자 false가 하나도 끼여있으면 안된다

        System.out.println("b2 : " + b2);

        System.out.println("---------------");

        boolean b3 = 1 == 2 || 2 == 3||4 == 4;
        System.out.println("b3 :" +b3); //or 연산자 는 하나만 맞아도 true

        boolean b4 = 1 == 2 || 2 == 3||4 == 5;
        System.out.println("b4 :" +b4);

        System.out.println("---------------");
        //부정연산자
        boolean b5 = 1 == 1;
        System.out.println("b5 :" + b5);
        System.out.println("!b5 :" + !b5);
        System.out.println("!!b5 :" + !!b5);

   }
}
