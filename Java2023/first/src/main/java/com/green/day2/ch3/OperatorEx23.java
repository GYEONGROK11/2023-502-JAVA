package com.green.day2.ch3;

public class OperatorEx23 {
    public static void main(String[] args) {
        String s1 = "Hello", s2 = "Hello";
        String s3 = new String("Hello");
        //String  - 대문자 참조는 주소값이 같은지 비교
        System.out.printf("%s == %s : %b\n",s1, s2, s1 == s2);
        System.out.printf("%s == %s : %b\n",s1, s3, s1 == s3);
        System.out.printf("%s.equals(%s) : %b\n",s1, s3, s1.equals(s3));
        System.out.printf("%s.equals(%s) : %b\n",s3, s1, s3.equals(s1));   //문자열비교는 equals 비교

        //referencs type에서 == 비교는 주소값 비교



    }
}
