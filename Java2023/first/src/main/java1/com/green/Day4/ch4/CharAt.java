package com.green.Day4.ch4;

public class CharAt {
    public static void main(String[] args) {
        String str = "abcdefghijk".toUpperCase();
        String str3 = str.toUpperCase();
        System.out.println("str3 : "+ str3);
       //.은 객체에 접근하는역할 ,반복문은 0번부터 시작
        char ch2 = str.charAt(2);
        int val = Character.getNumericValue(ch2);//문자 2를 정수 2로 바꾸기위해 사용
        System.out.println("val :"+ val);
        /*System.out.println(str);

*/
        System.out.println("result3 :"+ str.charAt(6));
        System.out.println("result2 : " +str.charAt(0));
        char result = str.charAt(1);
        System.out.println("result1 : " +result);
        System.out.println("result2 : " +str.charAt(2));
    }
}
