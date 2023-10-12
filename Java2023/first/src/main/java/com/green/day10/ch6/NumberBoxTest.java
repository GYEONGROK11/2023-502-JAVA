package com.green.day10.ch6;

public class NumberBoxTest {// NumberBox = 정의  NumberBoxTest = 호출
    public static void main(String[] args) {
        NumberBox nb1 = new NumberBox();
        nb1.sum(10,20);
        nb1.sum(30,40);

        nb1.minus(40,20);
        nb1.minus(40,10);

        nb1.abs(-10);
        nb1.abs(10);
        nb1.abs(-33);
    }
}
