package com.green.day10.ch6;

public class MethodExamTest {
    public static void main(String[] args) {
        MethodExam me = new MethodExam();
        me.checkZero(10);
        me.checkZero(9);
        me.checkZero(0);

        for (int i = 0; i < 1000; i++) {
            int r = me.randomValFromTo(10, 100);
            if (r < 10 || r > 100) {
                System.out.println("실패");
                break;
            }

        } //System.out.println(r);

        int r2 = me.randomValFromTo(5, 9);
        System.out.println(r2);

        me.scoreResultPrint(102);//잘못입력
        me.scoreResultPrint(100);//A
        me.scoreResultPrint(90);//A
        me.scoreResultPrint(80);//B
        me.scoreResultPrint(70);//C
        me.scoreResultPrint(69);//D
        me.scoreResultPrint(-1);//잘못입력


    }
}
