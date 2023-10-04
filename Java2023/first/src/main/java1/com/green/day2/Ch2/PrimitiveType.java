package com.green.day2.Ch2;

public class PrimitiveType {
    public static void manin(String[] args) {
        //논리형
        boolean test = true, test2 = false;

        //문자형
        char ch = 'a', ch2 = '가';

        //정수형
        byte b1 = 1; //1byte
        short s1 = 10; //2byte
        int i1 = 100; //4byte
        long L1 = 1000;//8byte

    //1bit
        //8bit>1byte , 1024byte>1kb, 1024kb>1mb , 1024mb>1Gb 1024Gb> 1Tb, 64bit(8Byte)
        //실수형
        //float f1 = 10.1;
        float f2 = 10.1f, f3 = 10.1f; //f를 붙혀서 타입을 동일시만듬
        float f4 = (float)10.1; // <- 강제 형변환 (float) 으로 강제변환
        double d1 = 10.1;

        float f5 = (float)d1; //double타입을 사용했기때문에 강제형변환으로만 가능 f를 붙힐 수 없음

    }
}
