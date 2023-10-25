package com.green.second.ch1;

public class Hello {
    public static void main(String[] args) {//파란색 키워드 - 예약어
        String str = "Hello";
        for (int i = 0; i < 3; i++) {
            System.out.print(str);
        }
        System.out.print(str);  //str - 아규먼트
        // System.out 알수있는 정보 -  System클래스에 스태틱 전역변수 out이 있다
        // System.out.print() 알수있는 정보 -  System.out. 주소값을 저장할수있다  System.out.print() 그안에 print메소드가 있다
        System.out.print(str);
        System.out.print(str);
    }
}
