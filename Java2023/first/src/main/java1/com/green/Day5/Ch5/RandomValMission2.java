package com.green.Day5.Ch5;

public class RandomValMission2 {
    public static void main(String[] args) {
    //int min = 10, max= 50; 리터럴은 더 이상 사용하지 않는다
        //min , max 상수만 사용하여
        //min ~max 나올 수 있는 랜덤 숫자를 만드는 로직을 구현 하시오.
        final int MIN=10 , MAX=19;//final-상수만들기


        for(int i=0; i<1000; i++){
            int val = (int)(Math.random()*(MAX-MIN+1))+MIN;
            System.out.println("val :"+ val);
            if(val < MIN || val >MAX){
                System.out.println("범위를 벗어 났습니다");
                break;//0.9999


            }
        }
        System.out.println("끝!");
    }
}
