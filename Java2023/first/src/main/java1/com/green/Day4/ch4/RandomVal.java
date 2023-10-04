package com.green.Day4.ch4;

public class RandomVal {
    public static void main(String[] args) {

        double doubleval = Math.random();//0.00~0.9999 절대 1 안나옴
        System.out.println("doubleVal:" + doubleval);

        int intVal = (int)(doubleval * 10);
        System.out.println("intval:" + intVal);

        int rVal = (int)(Math.random()*100+28);//14~23
        System.out.println("rVal:"+rVal);
    }

}
