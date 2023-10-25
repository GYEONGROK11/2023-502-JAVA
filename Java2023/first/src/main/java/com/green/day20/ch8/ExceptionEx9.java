package com.green.day20.ch8;

public class ExceptionEx9 {
    public static void main(String[] args) {
        try {
            /*Exception e = new Exception("일부러 에러");
            System.out.println("dd");
            throw e;*/   //trow를 쓰면 에러를 터뜨림
            throw new Exception("일부러");

        }catch (Exception e){

            System.out.println(e.getMessage()); //일부러 에러
            e.printStackTrace(); //에러내용 표시
        }

        System.out.println("---끝---");
    }
}
