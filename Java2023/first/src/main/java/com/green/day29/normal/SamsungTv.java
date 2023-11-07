package com.green.day29.normal;

public class SamsungTv {
    private HarmanSpeaker speaker;

    private boolean isMute;

    public void sound(){
        if(!isMute){
            speaker.speak();
        }
    }

    public void toggleMute(){
        isMute = !isMute;
    }

    public SamsungTv(){
        speaker = new HarmanSpeaker();
    }

}
