package com.green.day27;

public class SubstringTest {
    public static void main(String[] args) {
        String str = "ABCDEFGHIJK";

        String r1 = str.substring(2,5);  //2개 보내면 mid  방번호 2~4까지
        System.out.println("r1 : " + r1);

        String r2 = str.substring(4);  //1개 보내면 방번호 4번 부터 끝까지
        System.out.println("r2 : " + r2);

        System.out.println(str);    //원본값이 파괴되지 않음 비파괴 메소드

    }
}
