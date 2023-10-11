package com.green.day10.ch6;

public class TvTest {
    public static void main(String[] args) {
        Tv tv1 = new Tv(); //new - 문서(클래스명)를 객체화 할때 사용하는 키워드
        tv1.channel = 10; //주소값.메소드  - .은 접근
        tv1.power = true;
        tv1.color = "빨간색";

        Tv tv2 = new Tv();
        tv2.channel = 20;

        System.out.println("tv1==tv2 (주소값-동일성)>>" + (tv1==tv2));
        System.out.println("tv1.channel : "+tv1.channel);
        System.out.println("tv1.power : "+tv1.power);
        System.out.println("tv1.color : "+tv1.color);
        System.out.println("---------------");
        System.out.println("tv2.channel : "+tv2.channel);
        System.out.println("tv2.power : "+tv2.power);
        System.out.println("tv2.color : "+tv2.color);

        tv1.channel++; //주소값.메소드  - .은 접근
        System.out.println("tv1.channel : "+tv1.channel);
    }
}
