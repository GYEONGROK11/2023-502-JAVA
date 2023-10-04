package com.green.Day5.Ch5;

import com.sun.security.jgss.GSSUtil;

public class FlowEx12 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            System.out.println(i);
        }
        System.out.println("--------------1");
        for(int i=0; i<5;i++){
            System.out.print(i);
        }
        System.out.println("\n-------------2");

        for(int i=0; i<5; i++){
            System.out.print(i+100);
        }
        System.out.println("\n-------------3");

        for(int i=92; i<97; i++){
            System.out.print("*");
        }
        System.out.println("\n-------------4");
        for(int i=6; i>0; i--){
            System.out.print("*");
        }
    }
}
