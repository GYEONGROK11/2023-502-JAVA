package com.green.day2.Ch2;

public class CastingEx1 {
    public static void main(String[] args) {

        double d = 85.4;
        int score = (int)d;
        System.out.println(" score :" + score);//정수는 실수 저장 x 반대는 가능
        System.out.println(" d  :" + d);

        byte b1 = 127;
        short s1 = b1;
        int i1 = s1;//앞쪽이 범위가 더 크면 자동변환됨


        float f1 = i1;//float ->지수, 소수점까지 but정확하진않음
        int i2 = (int)f1; //(강제형변환)



    }
}
