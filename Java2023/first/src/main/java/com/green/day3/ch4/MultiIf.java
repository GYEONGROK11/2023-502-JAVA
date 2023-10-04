package com.green.day3.ch4;

public class MultiIf {
    public static void main(String[] args) {
        int num = 30;                                   //bc는 A에 속한 이프문 A가 실행되면 b부터 실행 b가 f면 c만 실행

        if (num >= 50) {                                                //A if문
            if (num >= 80) {                                            //b if문
                System.out.printf("%d는 엄청 엄청 엄청 크다!", num);
            } else {
                System.out.printf("%d는 엄청 엄청 크다!", num);
            }
        } else {                                                        //c if문
            if (num >= 40) {
                System.out.printf("%d는 엄청 크다!", num);
            } else {
                System.out.printf("%d는 좀 크다!", num);
            }
        }

    }
}
