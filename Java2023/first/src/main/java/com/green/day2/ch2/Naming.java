package com.green.day2.ch2;

import java.util.Date;

public class Naming {
    public static void main(String[] args) {
        /*  네이밍 관련
        1. 대소문자 구별. 길이제한x
        int abc,ABC,Abc,asdasdasdasd

        2. 이름으로 예약어 사용x
        int int,void,static;

        3. 숫자 시작만x  int 1ab x
                       int a1b, ab1; o

        4. 특수문자 _,$만 가능  int _a_b, $a$b
         */


        /* 케이스기법
           hello my name is hong

           1. 파스칼 케이스 기법  (클래스명)
           HelloMyNameIsHong  대문자로시작
           2. 카멜 케이스 기법 (변수명, 메소드명)
           helloMyNameIsHong  소문자로시작
           3. 케밥 케이스 기법 (java x)
           hello-my-name-is-hong
           4. 스네이크 케이스 기법 (java x) 가능하지만 안씀
           hello_my_name_is_hong
         */

        /* 상수는 전부 대문자 구분은 언더바  - 앞에 final이 붙음
        PI MAX_NUMBER
        리터럴은 값 그 자체이고 상수는 한번 입력된 값이 변경되지 않음
         */
        final int PI = 0, MAX_NUMBER = 10;

        Date today = new Date();
        //대문자 시작 : 참조형 (레퍼런스)   소문자 시작 : 기본형 (프라모티브)

    }
}
