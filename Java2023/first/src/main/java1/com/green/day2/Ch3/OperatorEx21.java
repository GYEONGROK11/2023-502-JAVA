package com.green.day2.Ch3;

public class OperatorEx21 {
    public static void main(String[]args) {
        int n1 = 10, n2 = 10 , n3=11 , n4 = 9;
        System.out.printf("%d < %d : %b\n" , n1, n2, n1 < n2);
        System.out.printf("%d <= %d : %b\n" , n1, n3, n1 <= n3);
        System.out.printf("%d <= %d : %b\n" , n1, n2, n1 <= n4);
        System.out.printf("%d <= %d : %b\n" , n1, n2, n1 <= n3);
        System.out.println("-------------------------------------");

        System.out.printf("%d > %d : %b\n" , n1, n2, n1 > n2);
        System.out.printf("%d > %d : %b\n" , n1, n4, n1 > n4);
        System.out.printf("%d >= %d : %b\n" , n1, n2, n1 >= n2);
        System.out.printf("%d >= %d : %b\n" , n1, n4, n1 >= n4);
        System.out.println("-------------------------------------");


        System.out.printf("%d == %d : %b\n" , n1, n2, n1 == n2);//같은가
        System.out.printf("%d == %d : %b\n" , n1, n3, n1 == n3);//같은가
        //
        System.out.printf("%d != %d : %b\n" , n1, n2, n1 != n2);//다른가
        System.out.printf("%d != %d : %b\n" , n1, n2, n1 != n3);//다른가



    }
}
