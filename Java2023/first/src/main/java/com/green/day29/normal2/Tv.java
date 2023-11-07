package com.green.day29.normal2;

public abstract class Tv {
    protected boolean isMute;

    protected Speaker speaker;

    public void sound(){
        if(!isMute){
            speaker.sound();
        }
    }

    public void toggleMute(){
        isMute = !isMute;
    }

}
