package com.green.day29.normal;

public class AppleSpeaker{

    private HansungWoofer woofer;

    private HanilWoofer superwoofer;

    public AppleSpeaker(){
        superwoofer = new HanilWoofer();
    }

    public void sound(){
        System.out.println("애플스피커는 애플 애플 애플");
        superwoofer.soundBase();
    }


}

