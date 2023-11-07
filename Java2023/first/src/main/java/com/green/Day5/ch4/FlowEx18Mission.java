package com.green.day5.ch4;

public class FlowEx18Mission {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int z = 2; z <= 9; z++) {
                System.out.printf("%d x %d = %d\t", z, i, i * z);
            }
            System.out.println();
        }
    }
}
