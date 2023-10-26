package com.green.second.ch4;

public class FlowEx32 {
    public static void main(String[] args) {
        int val1 = MyUtils.abs(10);
        int val2 = MyUtils.abs(-10);
        int val3 = MyUtils.abs(-20);
        System.out.println(val1);
        System.out.println(val2);

        int rVal1 = MyUtils.randomVal(20, 50);
        int rVal2 = MyUtils.randomVal(10, 30);
        System.out.println(rVal1);
        System.out.println(rVal2);

        int sum1 = MyUtils.sumFromTo(10,30);
        int sum2 = MyUtils.sumFromTo(12,32);
        System.out.println(sum1);
        System.out.println(sum2);

        String gugudan3 = MyUtils.gugudan(3);
        System.out.println(gugudan3);
        String gugudan = MyUtils.gugudanAll(2,3);
        System.out.println(gugudan);
    }
}

class MyUtils {
    public static int abs(int num) {
        return num < 0 ? -num : num;
    }
    public static String gugudan(int dan){
        String gugudan="";
        for (int i = 1; i <= 9; i++) {
            gugudan += String.format("%d * %d = %d\n",dan,i,dan*i);
        }
        return gugudan;
    }
    public static String gugudan2(int dan){
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10; i++) {
            sb.append(String.format("%d * %d = %d\n",dan,i,dan*i));
        }
        return sb.toString();
    }

    public static String gugudanAll(int min, int max){
        String gugudan="";
        for (int i = min; i <= max; i++) {
            gugudan += gugudan(i);
        } return gugudan;
    }


    public static int randomVal(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static int sumFromTo(int min, int max){
        int sum=0;
        for (int i = min; i <= max; i++) {
            sum += i;

        }
        return sum;
    }
}