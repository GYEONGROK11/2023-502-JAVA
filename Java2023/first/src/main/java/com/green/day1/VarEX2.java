package com.green.day1;

public class VarEX2 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int temp = x;
        x = y;
        y = temp;


        System.out.println("x : " + x);
        System.out.println("y : " + y);
        //System.out.println("x : " + x); +는 자동형변환 : 문자열과 정수를 같은 타입으로
    }
}
