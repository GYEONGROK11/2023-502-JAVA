package com.green.day10.ch6;

public class ReturnNumberBoxTest {
    public static void main(String[] args) {
        ReturnNumberBox rnb = new ReturnNumberBox();

        rnb.sum(10,20);//자체가 30이됨
        int r1 = rnb.sum(10,20);
        System.out.printf("r1 : "+r1);
        int r2 = rnb.sum(20,30);
        System.out.println("r2 : "+r2);
        System.out.println("---끝---");

        int r3 = rnb.abs(-10);
        System.out.println("r3 : "+r3);
        System.out.println("r4 : "+rnb.abs(-99));
        System.out.println("r5 : "+rnb.abs(-19));
        System.out.println("---끝---");



    }
}
