package com.green.day14.ch6;



public class Card {
    String pattern;//전역변수 객체가 살아있는동안 계속 살아있음
    String denomination;

    public Card(){

    }
    public Card(String pattern, String denomination) { //지역변수 = 호출이 끝나면 죽음
        this.pattern = pattern;
        this.denomination = denomination;
        //this. 멤버필드나 멤버메소드 호출
    }

    void printMySelf(){
        System.out.printf("%s(%s)\n",pattern,denomination);
    }


}
