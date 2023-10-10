package com.green.day7.ch4;

public class FlowEx30 {
    public static void main(String[] args) {
        //반복문 사용
        int sum = 0;
        int i = 0;
        final int TARGET = 200;   //매직넘버 밑에 리터럴 값 바꾸는거보다 나음
        //i 값이 계속 증가되면 sum에 중첩으로 더하기
        //sum 값이 100초과가 되는 시점의 i 값
        while (true) {
            ++i;
            sum += i;
            System.out.printf("sum : %d\t",sum);
            System.out.printf("i : %d\n",i);

            if (sum > TARGET) {
                break;
            }
        }
        System.out.println(i);
        System.out.println("-------");
        i=0;
        sum=0;
        for (i = 0; i >= 0; i++) {
            sum += i;
            if (sum > TARGET) {
                break;
            }
        }
        System.out.println(i);
    }
}
