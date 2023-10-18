package com.green.day15.ch7;

class Tv2{
    boolean power;
    int channel;

    void power(){power = !power;}
    void channelUp(){channel++;}
    void channelDown(){channel--;}
}
class CaptionTv2 extends Tv2{
    int channel;
    boolean caption;
    void  displayCaption(String text){
        if(caption){
            System.out.println(text);
        }
    }

    void printParentChannel(){
        System.out.printf("parent-channel : %d\n",super.channel);
    }
}
public class CaptionTvTest2 {
    public static void main(String[] args) {
        CaptionTv2 ctv = new CaptionTv2();
        ctv.channel =10;
        ctv.channelUp();

        System.out.printf("ctv.channel : %d\n",ctv.channel);
        ctv.printParentChannel();
    }
}
