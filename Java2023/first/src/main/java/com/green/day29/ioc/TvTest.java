package com.green.day29.ioc;

public class TvTest {
    public static void main(String[] args) { // ioc : 인터페이스를 이용해 반대방향으로 조립 - 수정이용이함
        //args 보내는 법 실행버튼 왼쪽 class에 에디트 컨피규레이션  -  프로그램 아규먼트
        String strTv = args[0];
        String strSpeaker = args[1];
        String strWoofer = args[2];
        Tv tv = TvFactory.instance(strTv,strSpeaker,strWoofer);
        tv.sound();
        tv.toggleMute();
        tv.sound();

    }
}
