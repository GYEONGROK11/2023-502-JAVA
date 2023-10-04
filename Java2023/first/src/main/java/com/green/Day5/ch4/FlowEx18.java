package com.green.day5.ch4;

public class FlowEx18 {
    public static void main(String[] args) {
        // 중첩for문 구구단 2단부터 9단까지 출력
        /*
        2 x 1 = 2
        2 x 2 = 4
        ....
        3 x 1 = 3
        ....
        9 x 9 = 81
         */

        for (int z = 2; z <= 9; z++) {
            for (int i = 1; i <= 9; i++) {
                System.out.printf("%d x %d = %d\n", z, i, z * i);
            }
            System.out.println("-----");
        }
    }
}
