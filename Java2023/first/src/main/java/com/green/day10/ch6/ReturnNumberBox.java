package com.green.day10.ch6;

public class ReturnNumberBox {
//2차 가공이 필요하면 return메소드 사용 아니면 void 메소드 사용
    int sum(int n1, int n2) { //값자체를 만들때 return 을 주로 씀
        return n1 + n2;
    }

    int abs(int n) {
        return n > 0 ? n : -n;
    }

    int abs1(int n) {
        if (n > 0) {
            return n;
        }
        return -n;
    }
}
