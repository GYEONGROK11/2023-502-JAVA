package com.green.day4.ch4;

public class Abs {
    public static void main(String[] args) {
        int num = -10;

        if (num > 0) {
            System.out.printf("%d는(은) 절대값 %d\n", num, num);
        } else {
            System.out.printf("%d는(은) 절대값 %d\n", num, -num);
        }

        int a = num > 0 ? num : -num;

        System.out.printf("%d는(은) 절대값 %d\n", num, a);

        System.out.printf("%d는(은) 절대값 %d\n", num, num > 0 ? num : -num);

        //10는(은) 절대값 10
        //-9는(은) 절대값 9
    }
}
