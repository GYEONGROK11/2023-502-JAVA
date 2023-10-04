package com.green.day3.ch4;

public class AssignmentOperators2 {
    public static void main(String[] args) {

        // ++ 증감식 앞의 차이   r1 = ++n1 쓰기 후 읽기  ++후 1=n1
        int r1 = 0, n1 = 0, a1 =0;
        r1 = ++n1;
        ++a1;
        System.out.printf("r1 : %d, n1 : %d, a1 : %d\n", r1, n1, a1);

        // ++ 증감식 뒤의 차이   r1 = n1++ 읽기 후 쓰기  0=n1 후 ++

        int r2 = 0, n2 = 0, a2 =0;
        r2 = n2++;
        a2++;
        System.out.printf("r2 : %d, n2 : %d, a2 : %d\n", r2, n2, a2);
    }
}
