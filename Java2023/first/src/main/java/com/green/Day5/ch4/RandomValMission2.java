package com.green.day5.ch4;

public class RandomValMission2 {
    public static void main(String[] args) {
        final int MIN = 10, MAX = 100;


        //리터럴 더이상 하지않고 min max  상수만 이용하여  MIN~MAX만 나올수있는 랜덤 숫자를 만드는 로직을 구현


        for(int i=0;i<1000;i++){
            int rVal = (int) (Math.random() * (MAX-MIN+1)) + MIN; //10~50
            System.out.println("val : " + rVal);
            if(rVal < MIN || rVal > MAX){
                System.out.println("범위를 벗어났습니다.");
                break;
            }
        }
        System.out.println("끝");
    }
}
