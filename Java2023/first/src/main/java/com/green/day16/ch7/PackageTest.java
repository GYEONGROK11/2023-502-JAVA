package com.green.day16.ch7;

import com.green.day13.ch6.MyMath2;
import com.green.day15.ch7.*;  //패키지 임포트시 *표

public class PackageTest {
    public static void main(String[] args) {
        Parent parent;
        com.green.day15.ch7.Parent parent1;
        //2개가 있을 경우 : 둘 다 쓸때는 풀네임을 적음

        MyMath2.staticAbs(10);
        MyMath2.staticNum =10;
    }
}
