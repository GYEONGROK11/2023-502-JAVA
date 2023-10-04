package com.green.day2.Ch2;

import java.util.Date;

public class Naming {
    public static void main(String[] args) {

        //1. 대문자 구별 길이제한x
        //2. 이름으로 예약어 사용 x -> int int, void, static;
        //3. 숫자 시작 X ex{) 1ab
        //4. 특수문자 _ $만 가능 (int _ab, $ab;)
        //-------------------------------------------------------------
        //케이스 기법
        //hello my name is hong

        //1. 파스칼 케이스 기법
        //HelloMyNameIsHong -단어마다 첫글자 대문자 = 대문자로 시작

        //2.카멜 케이스 기법 (변수명, 메소드명)
        //helloMyNameIsHong - 첫 단어만 소문자 = 소문자로 시작

        //3. 케밥 케이스 기법
        //hello-my-name-is-hong (css언어)

        //4.스네이크 케이스 기법
        //hello_my_name_is_hong

        //-------------------------------------------------------------
        //상수는 전부 대문자  구분은 언더바
        //PI, MAX_NUMBER 변수명 앞에 final -> 상수, 대문자로 적어야함
        final int PI, MAX_NUMBER = 10;
        Date today = new Date();
        // Date에 대문자 -> 레퍼런스타입 if 소문자->기본형이다.

    }

}
