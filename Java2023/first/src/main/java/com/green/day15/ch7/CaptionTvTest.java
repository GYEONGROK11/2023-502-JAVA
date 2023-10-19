package com.green.day15.ch7;


class Tv extends Object {
    public Tv(){
        System.out.println("나는 티비");
    }
    boolean power; //전역변수 멤버필드 :객체가 살아있는 동안 유지됨
    int channel;
    void power() {power = !power;}//토글 : 같은 문장을 실행했을때 값이 계속 바뀜
    void channelUp() {channel++;}
    void channelDown() {channel--;}
}

class CaptionTv extends Tv {
    boolean caption;

    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
    public CaptionTv(){
        System.out.println("나는 캡션티비");
    }
    @Override //에노테이션 : 오버라이딩 검산해줌
    void channelUp() {
        channel += 2;
    }
}

public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv cTv = new CaptionTv();
        System.out.printf("cTv.power : %b\n", cTv.power);
        cTv.power();
        System.out.printf("cTv.power : %b\n", cTv.power);
        cTv.power();
        System.out.printf("cTv.power : %b\n", cTv.power);
        cTv.channel = 10;
        cTv.channelUp();
        System.out.printf("cTv.channel : %d\n", cTv.channel);
        cTv.displayCaption("반갑다 친구들!!");
        cTv.caption = true;
        cTv.displayCaption("반갑다!!!");

    }
}
