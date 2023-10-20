package com.green.day16.ch7;

public class Test {
    static int num;
    public static void sum(int n1, int n2){ //스태틱 메소드 권장 - 다만 인스턴스변수를 사용하지 않을때
        System.out.println(n1+n2+num);
    }
}

class TestTest{
    public static void main(String[] args) {
        Test.sum(10,20);
    }
}