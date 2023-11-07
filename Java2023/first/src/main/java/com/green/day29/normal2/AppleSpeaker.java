package com.green.day29.normal2;

public class AppleSpeaker implements Speaker{

    private Woofer woofer;

    public AppleSpeaker(){
        woofer = new HanilWoofer();
    }

    public void sound(){
        System.out.println("애플스피커는 애플 애플 애플");
        woofer.soundBase();
    }


}

