package com.green.day2.ch2;

public class CastingEx1 {
    public static void main(String[] args) {
        double d = 85.4;
        int score = (int)d;
        System.out.println("score : " + score);
        System.out.println("d : " + d);

        byte b1 =127;   //자동형변환
        short s1 = b1;
        int i1 = s1;

        float f1 =i1;   //4byte = 4byte 가능한이유 float는 계산식으로 저장하기 때문 - 단점 : 정확한 값은 아님
        int i2 = (int)f1;



    }
}
