package com.green.day2.Ch2;

public class Mission1Result {
    public static void main(String[] args) {
        int n1 = 10, n2 = 3;

      //int / int는 정수값으로 계산되어져서 결과값도출
        double r = (double)n1/n2;

        float r2 = (float)n1/n2;

        System.out.println("r : "+r);
        //float long 간 표현은 되지만 약간의 오차범위는 존재할 수 있다.

    }
}
