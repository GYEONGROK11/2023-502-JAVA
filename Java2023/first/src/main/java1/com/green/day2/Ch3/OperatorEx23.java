package com.green.day2.Ch3;

public class OperatorEx23 {

    public static void main(String[] args) {
        String s1 = "Hello" , s2 = "Hello";
        String s3 = new String("Hello");

        System.out.printf("%s == %s : %b\n", s1, s2, s1 == s2);
        System.out.printf("%s == %s : %b\n", s1, s3, s1 == s3);
        System.out.printf("%s == %s : %b\n", s1, s3, s1.equals(s3));//문자열 비교는 equals사용
        System.out.printf("%s == %s : %b\n", s3, s1, s3.equals(s1));

        //reference type에서 == 비교는 주소값 비교 new 하는 순간 새로운 주소 -> 다른 주소값이되버림


    }

}
