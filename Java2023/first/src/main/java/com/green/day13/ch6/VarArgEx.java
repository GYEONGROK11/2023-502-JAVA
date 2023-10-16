package com.green.day13.ch6;

public class VarArgEx {

    public static void sum(int...arr){ //...arr(배열)
        int sum = 0;
        for (int a : arr) {
            sum+=a;
        }
        System.out.printf("sum : %d\n",sum);
    }
    public static void main(String[] args) {
        sum(10,20);
        sum(10,20,30);
        sum(10,20,30,40);
        sum(10,20,30,123,123,123,41,15,123);
    }
}
