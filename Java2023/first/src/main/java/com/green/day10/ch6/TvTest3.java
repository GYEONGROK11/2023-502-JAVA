package com.green.day10.ch6;

public class TvTest3 {
    public static void main(String[] args) {
        Tv tv1 = new Tv();
        Tv tv2 = tv1;
        System.out.println("tv1.channel : "+tv1.channel);
        tv1.channelUp();
        tv1.channelUp();
        System.out.println("tv1.channel : "+tv1.channel);
        System.out.println("tv2.channel : "+tv2.channel);
    }
}
