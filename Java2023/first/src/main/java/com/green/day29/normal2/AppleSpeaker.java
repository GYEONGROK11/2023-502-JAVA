package com.green.day29.normal2;
import com.green.day29.Woofer;
import com.green.day29.Speaker;


public class AppleSpeaker implements Speaker {

    private Woofer woofer;

    public AppleSpeaker(){
        woofer = new HanilWoofer();
    }

    public void sound(){
        System.out.println("애플스피커는 애플 애플 애플");
        woofer.soundBase();
    }


}

