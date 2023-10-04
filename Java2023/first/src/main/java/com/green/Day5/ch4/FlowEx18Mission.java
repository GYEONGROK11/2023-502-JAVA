package com.green.day5.ch4;

public class FlowEx18Mission {
    public static void main(String[] args) {
        for (int z = 1; z <= 9; z++) {
            for (int i = 2; i <= 9; i++) {
                System.out.printf("%d x %d = %d\t", i, z, z * i);
            }
            System.out.println();
        }
    }
}

class FlowEx18Mission1 {
    public static void main(String[] args) {
        for (int i =1; i < 10 ; i++) {
            for (int z =2 ; z < 10; z++){
                System.out.printf("%d x %d = %d\t",z,i,i*z);
            }
            System.out.println();
        }
    }
}
