package com.green.second.ch2;

public class PrimitiveType {
    public static void main(String[] args) {
        boolean b = true;
        b = false;

        final int n1 = 100; //100은 리터럴   상수는 한번 입력된 값이 변경되지 않음
        byte n2 = 100; // byte타입

        float f =12.3f; //더블에서 형변환 해야됨
        float f2 =(float)12.3;
        double d = 12.3;
        float f3 =(float)d;

        long lng =1000000000000L;

        int n3 =100000;
        long lng2 = n3;
    }
}
