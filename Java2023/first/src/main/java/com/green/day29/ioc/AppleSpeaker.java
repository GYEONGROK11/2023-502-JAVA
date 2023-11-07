package com.green.day29.ioc;

import com.green.day29.Speaker;
import com.green.day29.Woofer;

public class AppleSpeaker implements Speaker {

    private Woofer woofer;

    public AppleSpeaker(Woofer woofer){
        this.woofer = woofer;
    }  //외부 주소값을 담아 쓰겠다

    public void sound(){
        System.out.println("애플스피커는 애플 애플 애플");
        woofer.soundBase();
    }


}

