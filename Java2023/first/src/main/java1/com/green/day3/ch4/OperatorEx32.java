package com.green.day3.ch4;

public class OperatorEx32 {

    public static void main(String[] args) {
        //만약에 n이 -10이였다면 콘솔에 10 출력 만약 n이 양수였다면 콘솔에 9가 출력
        int n = -10;

        // n = n * -1
        System.out.println("n : " + n);

        if(n>0){
            System.out.printf("%d",n);
        }else if (n<0){
            System.out.printf("%d", n*-1);
        }
    }
}