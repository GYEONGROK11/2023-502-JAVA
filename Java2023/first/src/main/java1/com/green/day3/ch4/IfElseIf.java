package com.green.day3.ch4;

public class IfElseIf {

    public static void main(String[] args) {
        if ( 1 == 1 ){System.out.println("1");}
        else if ( 2 == 2 ){System.out.println("2");}
        else if ( 3==3 ){System.out.println("3");}
        else {System.out.println("else");}//if안에 들어오는 타입은 무조건 boolean
        //그룹으로 묶어 놓으면 위에서 아래로 내려오면서 가장 처음 true만 값이 나오게됨 ex>1
        //마지막 else를 하지 않는다면 위에가 다 false일 때 실행이하나도 안됨
    }
}