package com.green.day3.ch4;

public class FlowEx1 {
    public static void main(String[] args) {
        int x = 0;
        System.out.printf("x=%d 일 때, 참인 것은\n", x);

        if (x == 0) {System.out.println("x == 0");}//()안 비교연산자 boolean
        if (x!=0) {System.out.println("x != 0");}

        System.out.println("----------");

        x=1;
        System.out.printf("x=%d 일 때, 참인 것은" , x);
        if(x==0){System.out.println("x == 0");}
        if(x!=0){System.out.println("x != 0");}

        if (!(x == 0) ){System.out.println("x ! =0");}//! 연산의 결과를 반대로 바꿈 ex: false여야 true
        if (!(x != 0)) {System.out.println("!(x ! = 0)");}





    }
}