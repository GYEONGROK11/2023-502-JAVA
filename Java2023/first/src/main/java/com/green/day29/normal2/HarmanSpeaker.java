package com.green.day29.normal2;

public class HarmanSpeaker implements Speaker{

    private Woofer woofer;

    public HarmanSpeaker(){
        woofer = new HanilWoofer();
    }

    public void sound(){
        System.out.println("하만스피커는 하하만만 하만하만");
        woofer.soundBase();
    }
}
