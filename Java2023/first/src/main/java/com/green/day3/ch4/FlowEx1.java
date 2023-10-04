package com.green.day3.ch4;

public class FlowEx1 {
    public static void main(String[] args) {
        int x =0;
        System.out.printf("x=%d 일 때, 참인 것은\n", x);
        //if 분기문

        if ( x == 0) {
            System.out.println("x == 0"); }
        if ( x != 0) {
            System.out.println("x != 0"); }

        //if (t or f 로 나오는 비교문 작성(불리언타입)) {System.out.println("x == 0"); } - true 일때만 실행

        System.out.println("---------");

        x = 1;

        System.out.printf("x=%d 일 때, 참인 것은\n", x);

        if ( x == 0) {
            System.out.println("x == 0"); }
        if ( x != 0) {
            System.out.println("x != 0"); }
        if ( !(x == 0)) {
            System.out.println("!(x == 0)"); }
        if ( !(x != 0)) {
            System.out.println("(x != 0)"); }

        System.out.println("끝!");

    }
}
