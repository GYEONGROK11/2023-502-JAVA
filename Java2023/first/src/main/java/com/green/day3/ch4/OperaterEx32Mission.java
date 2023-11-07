package com.green.day3.ch4;

public class OperaterEx32Mission {
    public static void main(String[] args) {
        //만약 n이 음수 -10 이였다면 10이 출력
        //만약 n이 양수 9 였다면 9가 출력
        //절대값 만들기
        int n = -10;

        if ( n > 0) {
            System.out.printf("%d\n" , n); }
        else {
            System.out.printf("%d\n" , -n);
        }

        int n1 = n > 0 ? n : -n;
        System.out.println("n1 : " + n1);

        System.out.println( n > 0 ? n:-n);
        }
    }
