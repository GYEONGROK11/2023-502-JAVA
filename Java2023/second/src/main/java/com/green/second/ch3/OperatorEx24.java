package com.green.second.ch3;

public class OperatorEx24 {
    public static void main(String[] args) {

        System.out.println( true && true);
        System.out.println(  false && true && (10/0)==0 );  //and 연산자는 false가 바로 나오면 그 이후는 계산하지않음
                                             // 원래 에러가 뜨지만 계산하지않음
        System.out.println("---------------------");
        System.out.println(true ||true||false);  //or연산자는 하나라도 true일시 트루   true가 바로 나오면 그 이후는 계산하지않음
        System.out.println(true && false && (10/0)==0);
    }
}
