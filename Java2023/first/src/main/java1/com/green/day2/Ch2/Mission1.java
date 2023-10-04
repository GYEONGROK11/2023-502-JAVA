package com.green.day2.Ch2;

import java.net.SocketOption;

public class Mission1 {
    public static void main(String[] args) {
        int n1 = 10 , n2 = 3;



        //System.out.println(n1 / n2);
        //n1을 n2로 나눴을때 3.333 나왔으면한다
        System.out.println((double) n1 / n2);
        System.out.println((float) n1/ n2);
        System.out.println((short) n1/ n2);
        int n4 = 10 , n5 =8;

        double r = (double)n4 /n5;

        float r2 = (float)n4 / n5;

        System.out.println("r :"+ r);
        //n4앞 double이 int보다 강하기 때문에 n4앞에만 붙혀도 자동형변환이됨







    }
}
