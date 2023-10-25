package com.green.day19.ch7;

class PlayerTest{
    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer();
        ap.play(10);
        VideoPlayer vp = new VideoPlayer();
        vp.play(20);
        Player player = ap;
        player.play(30);
        player = vp;
        player.play(40);

    }
}

public abstract class Player { //추상클래스 - 클래스는 자기가 가진 메소드중 추상메소드가 1개라도 있다면 자신도 추상클래스가 되어야됨
                               //추상 클래스 - 구현부가 없어 객체화안됨, 부모(타입으)로서 활동함,  강제성이 있음
                               // 인터페이스 - 추상메소드 밖에 없는 클래스 객체화안됨
    public abstract void play(int pos); //추상메소드 - 선언부만 있는 메소드
    // 추상메소드 - 메소드 구현부가 없기 때문에 자식클래스에 오버라이딩 강제성이 있음
}

class AudioPlayer extends Player{
    @Override  //에노테이션
    public void play(int pos) {
        System.out.println("Audio Play 위치 : " +pos);
    }
}

class VideoPlayer extends Player{
    @Override
    public void play(int pos) {
        System.out.println("Video Play 위치 : " +pos);
    }
}

abstract class DvdPlayer extends Player{ //클래스가 추상클래스를 받을때 그 클래스도 추상클래스가 되면 오버라이딩을 자식한테 미룸
                                         // 추상메소드 나도 쓸것이다 abstract
}
