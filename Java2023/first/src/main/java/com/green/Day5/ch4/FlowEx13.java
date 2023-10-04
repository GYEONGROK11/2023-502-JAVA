package com.green.day5.ch4;

public class FlowEx13 {
    public static void main(String[] args) {
        //반복문 사용 1~10을 전부 더한값을 출력 55
        int sum = 0;
        for(int i=1; i <= 10 ;i++){
            sum += i;
            System.out.printf("sum : %d, i : %d\n",sum,i);
        }
        System.out.printf("sum : %d\n",sum);


    }
}
