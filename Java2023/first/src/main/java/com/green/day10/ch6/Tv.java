package com.green.day10.ch6;

public class Tv {// Tv = 정의  TvTest = 호출
    String color;  //속성(멤버필드,property,전역변수)
    boolean power;
    int channel;
    //void(리턴타입) a(메소드명) ()(파라미터-매개변수)
    //void         power      ()                - 메소드를 정의했다
    void power() {power = !power;} //메소드(멤버메소드)
    // void power() - 메소드선언부  {power = !power;} - 구현부
    void channelUp() {channel++;}
    void channelDown() {channel--;}


}
