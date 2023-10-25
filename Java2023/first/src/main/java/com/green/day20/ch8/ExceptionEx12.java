package com.green.day20.ch8;

public class ExceptionEx12 {
    public static void main(String[] args) {
        //method1();
        try {
            method2();
        } catch (Exception e){
            System.out.println("method2 에러다");
        }
        System.out.println("---끝---");
    }

    static void method1(){
        int a =10/0;
    }

    static void method2() throws Exception {
        int a =10/0;
    }

}


class ExceptionEx12_2 {
    public static void main(String[] args) {    // try-catch문으로 에러 처리
        try {
            method1();
        } catch (Exception e) {

        }
    }
    static void method1() throws Exception{
        method2();
    }
    static void method2() throws Exception {  //throws Exception 에러 처리를 미룸  - 한곳으로 에러를 모으려고 씀
        int a =10/0;
    }
}