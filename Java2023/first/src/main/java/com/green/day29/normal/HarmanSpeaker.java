package com.green.day29.normal;

public class HarmanSpeaker {

    private HanilWoofer superwoofer;

    public HarmanSpeaker(){
        superwoofer = new HanilWoofer();
    }

    public void speak(){
        System.out.println("하만스피커는 하하만만 하만하만");
        superwoofer.soundBase();
    }

}
