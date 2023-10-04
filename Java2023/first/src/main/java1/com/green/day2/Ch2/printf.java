package com.green.day2.Ch2;

public class printf {
    public static void main(String[] args){
        System.out.println("안녕");
        System.out.println("안녕");
        System.out.println("안녕");
        System.out.printf("hello");
        System.out.printf("hello");
        System.out.printf("hello");
        System.out.println("----------");
        System.out.println("Halo\n");//이스케이프문자 (ㅇ/n)
        System.out.println("Halo\n");
        System.out.println("Halo\n");

        String name = "홍길동";
        int age = 23;
        char bloodType = 'B';
        float height = 178.8f;
        //제 이름은 홍길동이고, 나이는 23세이고, 혈액형은 B형이고 키는 178.8cm입니다
        System.out.print("제 이름은 "+ name + "이고 ");
        System.out.print("나이는"+ age + "이고 ");
        System.out.print("혈액형은 "+ bloodType + "이고 ");
        System.out.println("키는"+ height + "cm입니다");


        System.out.printf("제 이름은 %s이고, 나이는 %d세이고, 혈액형은 %C형이고, 키는 %.1fcm입니다."
                , name, age , bloodType, height); //%뒤 S = string



    }
}
