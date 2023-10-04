package com.green.day2.Ch2;

import java.net.SocketOption;

public class StringEx {
    public static void main(String[] args){
        String name = "Ja" + "va";
        System.out.println(name);

        System.out.println("ja"+"va");
        System.out.println("12"+ 10 + 9);
        //"12"+ 10
        //"12"+"10" -> "1210"
        //"1210" +9
        //"1210" + "9" -> "12109"
        System.out.println("12"+ (10 + 9));
        //10+9 ->19
        //"12" + 19
        //"12" + "19" -> "1219"


    }
}
