package com.green.day4.ch4;

public class RandomVal {
    public static void main(String[] args) {
        double doubleVal = Math.random();  //0.00000~0.9999999
        System.out.println("val : "+ doubleVal);

        int intVal = (int)(doubleVal * 10);
        System.out.println("val : "+ intVal);

        int rVal = (int)(Math.random() * 20);
        System.out.println("val : "+ rVal);


    }
}
