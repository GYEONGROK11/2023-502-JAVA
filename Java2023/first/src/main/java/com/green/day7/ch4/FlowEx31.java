package com.green.day7.ch4;

public class FlowEx31 {
    public static void main(String[] args) {
        /*
        0~10 까지 출력 반복(11번)
        3의 배수는 (0포함) 출력 x
        1 2 4 5 7 8 10
         */
        int i = 0;
        for (i = 0; i <= 10; i++) {
            int z = i % 3;
            if (z == 0) {
                continue;
            }
            System.out.printf("i : %d \n", i);

        }
        System.out.println("------------");
        i = 0;
        for (i = 0; i <= 10; i++) {
            int z = i % 3;
            if (z != 0) {
                System.out.printf("i : %d \n", i);
            }
        }
    }
}
