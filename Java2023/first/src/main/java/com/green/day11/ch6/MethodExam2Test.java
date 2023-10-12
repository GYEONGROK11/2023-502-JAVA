package com.green.day11.ch6;

import com.green.day10.ch6.Tv;

public class MethodExam2Test {
    public static void main(String[] args) {
        MethodExam2 me2 = new  MethodExam2();
        String r1 =me2.scoreResultOpt1(100);
        System.out.printf("%s\n",r1);
        String r2 =me2.scoreResultOpt(81);
        System.out.printf("%s\n",r2);
        String r3 =me2.scoreResultOpt(91);
        System.out.printf("%s\n",r3);
        String r4 =me2.scoreResultOpt(101);
        System.out.printf("%s\n",r4);
        /*
        100 초과 0미만 잘못입력
        8점이상 + 3점이하 -
        D학점은 없음
         */
    }
}
