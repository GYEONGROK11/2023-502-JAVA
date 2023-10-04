package com.green.day4.ch4;

public class For {
    public static void main(String[] args) {
        /* 실행순서  0            1          3         2        0-1-2-3-1-2-3-1-2-3-1-2-3-1-End
          for ( 초기화공간 ; 반복여부 체크 ; 증감식 ) { 반복대상 }
         */
        for ( int i = 0 ; i < 10 ; i++ ) {
            System.out.println("안녕");

        }

        int j = 0;
        for( ; j<10; ){
            System.out.println("j : " + (++j));
        }
    }
}
