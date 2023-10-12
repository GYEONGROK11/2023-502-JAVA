package com.green.day10.ch6;

public class Object {

    /*
    객체는 속성(명사,멤버필드,property,전역변수)(값과관련된) + 메소드(동사,멤버메소드)(움직임과 관련된)
     */

    /*
    클래스 : 문서 설계도 설명   붕어빵 틀
    객체 (Object)(인스턴스) : TV 제품 아파트  붕어빵
     */

    /*
    Steck 메모리영역            Heap 메모리영역
    쌓임 퍼스트인 라스트아웃      퍼스트인 퍼스트아웃
    ↓3↑                         →3 2 1→
    ↓2↑
    ↓1↑

    Steck 메모리영역            Heap 메모리영역
    Tv tv1 주소값저장     →     TV | channel color | 메소드
                              주소값 16진수 0*1111
    Tv tv2 주소값저장     →     TV | channel color | 메소드
                              주소값 16진수 0*2222


    Steck 메모리영역            Heap 메모리영역
    Tv tv1 주소값저장     →      TV | channel color | 메소드
        | (쉘로우카피)          주소값 16진수 0*1111
    Tv tv2 주소값저장   → ↑
     */

}
