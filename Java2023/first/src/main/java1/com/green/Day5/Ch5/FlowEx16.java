package com.green.Day5.Ch5;

public class FlowEx16 {
    public static void main(String[] args) {
        //중첩 반복문을 사용하여
        //가로 10개, 세로 5줄,
        //별을 찍으시오

        for (int i = 1; i < 6; i++) {
            for (int z = 1; z < 11; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------------");

        for(int j=1; j<=10*5; j++){
            System.out.print("*");
            if(j % 10 ==0){
                System.out.println();
            }
        }
    }
}

