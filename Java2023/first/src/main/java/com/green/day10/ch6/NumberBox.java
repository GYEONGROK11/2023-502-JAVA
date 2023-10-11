package com.green.day10.ch6;

public class NumberBox {// NumberBox = 정의  NumberBoxTest = 호출
    //2차 가공이 필요하면 return메소드 사용 아니면 void 메소드 사용
    void sum(int n1, int n2) {
        System.out.printf("%d + %d = %d\n", n1, n2, (n1 + n2));
        return; //생략
    }

    void minus(int n1, int n2) {
        System.out.printf("%d - %d = %d\n", n1, n2, (n1 - n2));
    }
    void abs(int n) {
        System.out.println( n>0 ? n : -n);
    }

}
