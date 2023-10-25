package com.green.second.ch3;

public class OperatorEx19 {
    public static void main(String[] args) {
        int n1 = 12, n2 = 8;
        System.out.println(n1 / n2);
        System.out.println(n1 % n2);

        System.out.println(n1 % 10); //1의자리수

        int rVal = (int) (Math.random() * 9) + 1;
        System.out.printf("%d는(은) %s수입니다",rVal, rVal % 2 == 0 ? "짝" : "홀");

    }
}
