package com.green.day13.ch6;

public class OverloadingTest {
    public static void main(String[] args) {

        System.out.println();
    }
    //오버로딩 - 파라미터에서 타입과 타입개수가 다를때 같은이름을 사용할 수 있다
    void print(){}

    void print(int n){}

    void print(int n1,int n2){}
    //int print(int n1,int n2){} x

    void print(int n1,String str2){}
    void print(String str2,int n1){}
}
