package com.green.second.ch2;

public class OverUnderFlow {
    public static void main(String[] args) {
        short s1 =130;   //오버플로우
        byte b1 = (byte) s1;
        System.out.printf("b1 : %d\n",b1);

        short s2 = -129;   //언더플로우
        byte b2 = (byte) s2;
        System.out.printf("b2 : %d\n",b2);

        short s3 = 130;
        byte b3=0;
        if(Byte.MAX_VALUE>s3 && Byte.MIN_VALUE<=s3){
            b3 = (byte) s3;
        }
        System.out.printf("b3 : %d\n",b3);
    }

}
