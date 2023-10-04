package com.green.day2.Ch3;

public class OperatorEx16 {
    public static void main(String[] args) {
        float pi =3.141592f; //앞 ( ) 필요 뒤는 그냥 붙히기
        System.out.println(pi);

        int pro1 = (int)(pi * 1000);
        System.out.println("pro1 :"+ pro1);

        Float pro2 = pro1 / 1000f;
        System.out.println("pro2 :" + pro2);

        System.out.println("one : "+(int)(pi * 1000) * 0.001f);



    }
}