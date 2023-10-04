package com.green.day2.ch2;

public class Printf {
    public static void main(String[] args) {
        System.out.println("안녕");
        System.out.println("안녕");
        System.out.println("안녕");
        System.out.println("------------");
        System.out.print("Hello");
        System.out.print("Hello");
        System.out.print("Hello");
        System.out.println("------------");
        System.out.print("Halo\n"); //이스케이프 개행:줄바꿈
        System.out.print("Halo\n");
        System.out.print("Halo\n");
        System.out.println("------------");
        System.out.printf("안녕");
        System.out.printf("안녕");
        System.out.printf("안녕");
        System.out.println("------------");

        String name = "홍길동";
        int age =23;
        char bloodType = 'B';
        float height = 178.8f;

        System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "세이고, 혈액형은 "
                            + bloodType +"형이고, 키는 " + height + "cm입니다.");

        System.out.printf("제 이름은 %s이고, 나이는 %03d세이고, 혈앵형은 %c형이고, 키는 %.2fcm입니다."
        , name, age, bloodType,height);
        System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "세이고, 혈액형은 "
                + bloodType +"형이고, 키는 " + height + "cm입니다.");
    }
}
