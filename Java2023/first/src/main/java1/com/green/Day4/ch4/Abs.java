package com.green.Day4.ch4;

public class Abs {
    public static void main(String[] args) {
        int n= 5;


        System.out.println("n :" + n);
        if( n > 0 ) {
            System.out.printf("%d 는 절대값 %d ",n, n);
        }
        else if( n < 0){
            System.out.printf("%d는 절대값 %d\n" , n, -n);



        }
        /*System.out.printf("%d은(는) 절대값 %d", n ,n<0 ? -n : n );*/
    }
        //10은 절댓값 10 -9 는 9
 }


