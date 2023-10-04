package com.green.day2.Ch2;

public class OverflowEx {
    public static void main(String[] args) {
        int intVal = 5;
        byte byteVal = (byte)intVal;

        System.out.printf("byteval : %d\n", byteVal);

        int intVal2 = 128;
        byte byteVal2 = (byte)intVal2;
        System.out.printf("byteVal2 : %d\n", byteVal2);//* - 128~+ 127*


        int intVal3 = 129;
        byte byteVal3 = (byte)intVal3;
        System.out.printf("byteVal3 : %d\n" , byteVal3);


    }
}
