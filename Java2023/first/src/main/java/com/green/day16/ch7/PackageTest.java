package com.green.day16.ch7;

import com.green.day13.ch6.MyMath2;
import com.green.day15.ch7.*;  //와일드카드 : 패키지 자체 임포트시 *표
import static com.green.day13.ch6.MyMath2.staticAbs;//스태틱 임폴트

public class PackageTest {
    public static void main(String[] args) { //임폴트하는법 알트엔터 or 풀네임
        Parent parent;
        com.green.day15.ch7.Parent parent1;
        //2개가 있을 경우 : 둘 다 쓸때는 풀네임을 적음
        staticAbs(20);//스태틱 임폴트
        MyMath2.staticAbs(10);
        MyMath2.staticNum =10;
    }
}
